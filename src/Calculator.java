import java.util.ArrayList;
import static java.util.Collections.*;

public class Calculator {

    private ArrayList<Double> numbers = new ArrayList<>();

    private int getNumberOfNumbers() {
        return this.numbers.size();
    }

    public double getSum() {
        return this.numbers.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double getMean() {
        return getSum() / getNumberOfNumbers();
    }

    public double getMedian() {
        int numberOfWords = getNumberOfNumbers();

        if (BooleanExtensions.isEvenNumber(numberOfWords)) {
            return getMean();
        } else {
            sort(this.numbers);
            return this.numbers.get(numberOfWords / 2);
        }
    }

    public void addNumber(double number) {
        this.numbers.add(number);
    }
}