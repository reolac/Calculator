import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addNumber_singleNumber_returnsNumber() {
        Calculator calculator = new Calculator();

        calculator.addNumber(1);

        assertEquals(1, calculator.getSum());
    }
}