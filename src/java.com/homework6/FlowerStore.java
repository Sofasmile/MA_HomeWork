package homework6;

public class FlowerStore {
    private int purse;
    private Flower[] flowers;

    public int getPurse() {
        return purse;
    }

    private void addMoney(int countRose, int countTulip, int countChamomile) {
        purse += Rose.PRICE * countRose + Chamomile.PRICE * countChamomile + Tulip.PRICE * countTulip;
    }


    public Flower[] sell(int countRose, int countTulip, int countChamomile) {
        int count = countRose + countTulip + countChamomile;
        flowers = new Flower[count];
        for (int i = 0; i < count; i++) {
            flowers[i] = (i < countRose) ? new Rose()
                    : (i < (countTulip + countRose)) ? new Tulip()
                    : new Chamomile();
        }
        addMoney(countRose, countTulip, countChamomile);
        return flowers;
    }

    public Flower[] sellSequence(int countRose, int countTulip, int countChamomile) {
        int count = countRose + countTulip + countChamomile;
        flowers = new Flower[count];
        addMoney(countRose, countTulip, countChamomile);
        int temp;
        for (int i = 0; i < count; i += temp) {
            temp = 0;
            if (countRose > 0) {
                flowers[i] = new Rose();
                temp++;
                countRose--;
            }
            if (countTulip > 0) {
                flowers[i + temp] = new Tulip();
                temp++;
                countTulip--;
            }
            if (countChamomile > 0) {
                flowers[i + temp] = new Chamomile();
                temp++;
                countChamomile--;
            }
        }
        return flowers;
    }

    public void showBouquet(Flower[] flowers) {
        if (flowers.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
        for (Flower f : flowers) {
            System.out.print(f.name() + " ");
        }
    }
}
