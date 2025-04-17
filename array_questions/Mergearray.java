public class Mergearray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {12, 14, 16, 18, 20};
        int[] arr3 = new int[arr1.length + arr2.length];

        // Merging arr1 and arr2 into arr3
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i]; // Fill arr3 with elements from arr1
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i]; // Fill arr3 with elements from arr2
        }

        // Printing the merged array
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + " ");
        }
    }
}
