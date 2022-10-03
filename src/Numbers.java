import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int x = 1;
        Arrays.sort(numbers);
        System.out.println(search(numbers, x));
    }

    private static boolean search(int[] numbers, int x){
        return Arrays.binarySearch(numbers, x) >= 0;
    }
}