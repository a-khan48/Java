package validating;

public class Calculator {

    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Invalid. The number must be greater than 0");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public static int binomialCoefficient(int setSize, int subsetSize) {
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("Invalid. Your subset must be smaller than your set.");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
        public static void main(String[] args) {
            int result = Calculator.binomialCoefficient(7, 1);
            System.out.println(result);

            int result2 = Calculator.binomialCoefficient(1, 2);
    }
}
