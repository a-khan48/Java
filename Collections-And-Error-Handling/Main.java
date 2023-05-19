import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(24);
        numbers.add(31);
        numbers.add(59);
        numbers.add(9);
        numbers.add(9);
        numbers.add(59);
        numbers.add(12);

        try {
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);

            double sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum: " + sum);

            double average = (double) sum / numbers.size();
            System.out.println("Average: " + average);
            System.out.println("Numbers with no duplicates: " + uniqueNumbers);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Program executed.");
        }
    }
}