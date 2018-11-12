import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void verifyPositiveSum() {
        Calculator calc = new Calculator();

        Assert.assertEquals(15, calc.sum( 7, 8));
    }
}
