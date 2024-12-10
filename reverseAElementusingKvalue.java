import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int k = 1;
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));  // Fixed typo here
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  
        reverse(arr, 0, n - 1);  
        reverse(arr, 0, k - 1);  
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
