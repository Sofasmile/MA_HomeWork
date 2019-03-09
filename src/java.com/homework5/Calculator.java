package homework5;

import java.util.stream.Stream;

public class Calculator {
    public static double calculate(double a, double b, char c) {
        Operation result = Stream.of(Operation.values())
                .filter(op -> op.getSymbol() == c)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("This operator doesn't exist"));
        return result.getResult(a, b);
    }
}
