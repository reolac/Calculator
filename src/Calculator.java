import java.util.ArrayList;
import static java.util.Collections.*;

public class Calculator {

    private ArrayList<Double> numbers = new ArrayList<>();

    private int getNumberOfNumbers() {
        return numbers.size();
    }

    public double getSum() {
        return numbers.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double getMean() {
        return getSum() / getNumberOfNumbers();
    }

    public double getMedian() {
        sort(numbers);
        return numbers.get(getNumberOfNumbers() / 2);
    }

    public void addNumber(double number) {
        numbers.add(number);
    }
}