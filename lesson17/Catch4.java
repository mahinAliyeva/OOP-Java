package lesson17;

public class Catch4 {
    public static void main(String[] args) {
        int[][] memoryHolder = new int[100000][];
        int i = 0;

        while (true) {
            memoryHolder[i] = new int[1000000]; // 1 million integers = ~4MB
            i++;
            System.out.println("Allocated " + i + " blocks");
        }
    }
}
