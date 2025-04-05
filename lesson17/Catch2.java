package lesson17;

public class Catch2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 0};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You are trying to access the element whose index is not existing in the list");

            for (int i = 0; i < arr.length - 1; i++) {
                try {
                    if (arr[i + 1] == 0){
                        throw new ArithmeticException();
                    }
                    System.out.println((double) arr[i] / arr[i + 1]);
                } catch (ArithmeticException ae) {
                    System.out.println("You cannot divide something by ZERO.");
                }
            }
        }
    }
}
