package homework5;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    ADD('+', (d1, d2) -> d1 + d2),
    SUB('-', (d1, d2) -> d1 - d2),
    MUL('*', (d1, d2) -> d1 * d2),
    DIV('/', (d1, d2) -> d1 / d2),
    RAIS('^', (d1, d2) -> Math.pow(d1, d2)),
    SQR('√', (d1, d2) -> Math.pow(d1, 1 / d2)), //Alt+251 = "√"
    SQR_MOD('#', (d1, d2) -> Math.pow((d1 + d2) / d1 + 117, d2));

    private final char symbol;
    private final DoubleBinaryOperator operator;

    Operation(char symbol, DoubleBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    public double getResult(double d1, double d2) {
        return operator.applyAsDouble(d1, d2);
    }

    public char getSymbol() {
        return symbol;
    }
}
