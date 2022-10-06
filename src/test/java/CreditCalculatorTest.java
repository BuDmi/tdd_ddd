import org.example.CreditCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCalculatorTest {
    CreditCalculator creditCalculator;

    @BeforeEach
    public void init() {
        creditCalculator = new CreditCalculator(2, 100_000, 0.2f);
    }

    @Test
    public void testCalcMonthlyPayment() {
        float expectedValue = 5089.5f;
        float actualValue = creditCalculator.calcMonthlyPayment();
        assertEquals(expectedValue, actualValue, 0.1f);
    }

    @Test
    public void testCalcWholeRemainingSum() {
        float expectedValue = 122_150.0f;
        float actualValue = creditCalculator.calcWholeRemainingSum();
        assertEquals(expectedValue, actualValue, 0.1f);
    }

    @Test
    public void testCalcOverpayment() {
        float expectedValue = 22150.0f;
        float actualValue = creditCalculator.calcOverpayment();
        assertEquals(expectedValue, actualValue, 0.1f);
    }
}
