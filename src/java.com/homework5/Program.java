package homework5;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(5.9, 2.1, '+');
        calculator.calculate(1.3, 2.2, '-');
        calculator.calculate(7.3, 2.5, '*');
        calculator.calculate(20.0, 6.5, '/');
        calculator.calculate(25.0, 2.0, '√');
        calculator.calculate(15.0, 3.0, '#');
    }
}
