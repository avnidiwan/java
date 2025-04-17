public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {2, 14, 6, 18, 10};


        // Merging arr1 and arr2 into arr3
        for (int i = 0; i < arr1.length; i++) {
           for(int j=0; j<arr2.length; j++){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
           }
        }
    }
        
    }
}
