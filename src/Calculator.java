import java.util.ArrayList;

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
        return numbers.get(getNumberOfNumbers() / 2);
    }

    public void addNumber(double number) {
        numbers.add(number);
    }
}
