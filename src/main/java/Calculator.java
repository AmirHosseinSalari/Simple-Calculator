import java.math.BigDecimal;

public class Calculator implements MathOperation{
    @Override
    public BigDecimal multiply(BigDecimal numberOne, BigDecimal numberTwo) {
        return numberOne.multiply(numberTwo);
    }

    @Override
    public BigDecimal add(BigDecimal numberOne, BigDecimal numberTwo) {
        return numberOne.add(numberTwo);
    }

    @Override
    public BigDecimal divide(BigDecimal numberOne, BigDecimal numberTwo) {
        return numberOne.divide(numberTwo);
    }

    @Override
    public BigDecimal subtract(BigDecimal numberOne, BigDecimal numberTwo) {
        return numberOne.subtract(numberTwo);
    }
}
