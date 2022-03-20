import java.math.BigDecimal;

public interface MathOperation {
    BigDecimal multiply(BigDecimal numberOne, BigDecimal numberTwo);
    BigDecimal add(BigDecimal numberOne, BigDecimal numberTwo);
    BigDecimal divide(BigDecimal numberOne, BigDecimal numberTwo);
    BigDecimal subtract(BigDecimal numberOne, BigDecimal numberTwo);
}
