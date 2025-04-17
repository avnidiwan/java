public class SumOfElementsOfTwoarray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,7,8,9};
        int[] arr2={6,2,0,6,1,4};
        int arr3[]=new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
           arr3[i]=arr1[i]+arr2[i];
        }
       for(int k=0; k<arr1.length; k++){
        System.out.print(arr3[k]+"  ");
       }
}
}
