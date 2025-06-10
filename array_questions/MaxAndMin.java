import java.util.*;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = obj.nextInt();
        System.out.print("Enter inputs for array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("maximum: " + max);
        System.out.println("minimum: " + min);
    }
}
