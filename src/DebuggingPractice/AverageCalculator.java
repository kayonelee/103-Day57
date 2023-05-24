package DebuggingPractice;

public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        return average;
        }
    public static void main(String[] args) {

//Test your method with an array containing the numbers 1, 2, 3, 4, 5. Your method should return 3.0.
        int[] numbers = {1, 2, 3, 4, 5};
        double average = AverageCalculator.calculateAverage(numbers);
        System.out.println("The average is: " + average);

        //RETURN 3.0-RUNS & WORKS
        }
    }
