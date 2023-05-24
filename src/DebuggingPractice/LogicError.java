package DebuggingPractice;

public class LogicError {
//    FINDING MAXIMUM NUMBER IN THE ARRAY
    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

//        if (numbers[0] > max) { // ----LINE 14 LOGICAL ERROR HERE-------">"
//            max = numbers[0];
//        }
//REMOVED THE IF STATEMENT AS IT IS UNNECESSARY TO COMPARE THE TWO NUMBER TO OUTPUT THE MAX, ALREADY HAVE MAX VARIABLE

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 23, 6};

        int result = findMax(numbers);
        System.out.println("The maximum number: " + result); //PRINTS OUT MAX NUMBER AS 23
    }
}
