package homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    public void calculate(double a, double b, char c) {
        List<Double> values = new ArrayList<Double>();
        values.add(a);
        values.add(b);
        String operator = String.valueOf(c);
        try {
            System.out.println(mathOperation(values, operator));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private Double mathOperation(List<Double> values, String operator) {
        Operation result = Arrays.stream(Operation.values())
                .filter(op -> op.getSymbol().equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("This operator doesn't exist"));
        return result.getResult(values.get(0), values.get(1));
    }
}
