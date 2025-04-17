public class CompareTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 4, 5};
        int[] arr2 = {4,2,3,7,8};
        int[] arr3 = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>arr2[i]) {
                arr3[i]=arr1[i];
            }
            else{
                arr3[i]=arr2[i];
            }
        }
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr3[i]+"  ");
        }
    }
}
