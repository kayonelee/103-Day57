package DebuggingPractice;

public class AverageCalculatorNullBound {
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

// ADDING A NULLPOINTER EXCEPTION BY ASSIGNING NULL TO THE NUMBER ARRAY
//        int[] numbers = null;
//        double average;
//        try {
//            average = AverageCalculator.calculateAverage(numbers); // LINE 23 EXCEPTION OCCURS HERE BC THE NUMBER ARRAY IS NULL
//            System.out.println("The average is: " + average);
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException occurred: " + e.getMessage());
//        }
//BREAKPOINT LINE 9. TO FIX, WE CAN ADD AN ARRAY OF VALID NUMBERS INSIDE CURLY BRACKETS.SEE EXAMPLE BELOW (ex: int[] numbers = {1, 2, 3, 4, 5};)

        int[] numbers = {1, 2, 3, 4, 5};
        double average = AverageCalculator.calculateAverage(numbers);
        System.out.println("The average is: " + average);
        //RETURN 3.0-RUNS & WORKS


// ADDING AN ARRAYINDEXOUTOFBOUNDS EXCEPTION
//        int[] numbers2 = {1, 2, 3, 4, 5};
//        double average = AverageCalculator.calculateAverage(numbers);
//        System.out.println("The average is: " + average);

//// ACCESSING AN ELEMENT OUTSIDE OF THE BOUNDS OF THE ARRAY
//        int[] numbers3 = {1, 2, 3, 4, 5};
//        average = AverageCalculator.calculateAverage(numbers3);
//        System.out.println("The average is: " + average);
//        System.out.println("Index 12 value: " + numbers3[12]); // LINE 45 EXCEPTION OCCURS HERE BC THERE IS NO SUCH INDEX AS INDEX 12
//        //TO FIX, COUNT THE INDEX STARTING AT 0. ARRAY HAS A TOTAL INDEX OF 4

        int[] numbers3 = {1, 2, 3, 4, 5};
        average = AverageCalculator.calculateAverage(numbers3);
        System.out.println("The average is: " + average);
        System.out.println("Index 1 value is: " + numbers3[1]); // INDEX 1 is (2)
        //Print out Index 1 as 2
    }
    }
