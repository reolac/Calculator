import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addNumber_singleNumber_returnsNumber() {
        Calculator calculator = new Calculator();

        calculator.addNumber(1);

        assertEquals(1, calculator.getSum(), 0.01d);
    }

    @Test
    public void addNumber_multiNumbers_returnsNumber() {
        Calculator calculator = new Calculator();

        calculator.addNumber(1);
        calculator.addNumber(1);

        assertEquals(2, calculator.getSum(), 0.01d);
    }

    @Test
    public void addNumber_oneDouble_returnsDouble() {
        Calculator calculator = new Calculator();

        calculator.addNumber(1.10d);

        assertEquals(1.10d, calculator.getSum(), 0.01d);
    }

    @Test
    public void addNumber_multiDouble_returnsDouble() {
        Calculator calculator = new Calculator();

        calculator.addNumber(1.10d);
        calculator.addNumber(1.10d);

        assertEquals(2.20d, calculator.getSum(), 0.01d);
    }

    @Test
    public void getMean_singleNumber_returnsNumber() {
        Calculator calculator = new Calculator();

        calculator.addNumber(1);

        assertEquals(1, calculator.getMean(), 0.01d);
    }

    @Test
    public void getMean_multiNumbers_returnDouble() {
        Calculator calculator = new Calculator();

        calculator.addNumber(1);
        calculator.addNumber(2);
        calculator.addNumber(3);

        assertEquals(2, calculator.getMean(), 0.01d);
    }

    @Test
    public void getMean_multiDouble_returnDouble() {
        Calculator calculator = new Calculator();

        calculator.addNumber(0.5);
        calculator.addNumber(1);

        assertEquals(0.75, calculator.getMean(), 0.01d);
    }

    @Test
    public void getMedian_singleNumber_returnsNumber() {
        Calculator calculator = new Calculator();

        calculator.addNumber(1);

        assertEquals(1, calculator.getMedian(), 0.01d);
    }

    @Test
    public void getMedian_multiNumbersOrdered_returnsNumber() {
        Calculator calculator = new Calculator();

        calculator.addNumber(1);
        calculator.addNumber(2);
        calculator.addNumber(3);

        assertEquals(2, calculator.getMedian(), 0.01d);
    }

    @Test
    public void getMedian_multiNumbersUnordered_returnsNumber() {
        Calculator calculator = new Calculator();

        calculator.addNumber(1);
        calculator.addNumber(3);
        calculator.addNumber(2);

        assertEquals(2, calculator.getMedian(), 0.01d);
    }
}