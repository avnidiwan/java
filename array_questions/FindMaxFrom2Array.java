public class FindMaxFrom2Array {
    public static void main(String[] args){
        int[] arr1={6,7,8,9,0};
        int[] arr2={1,2,3,4,9};
        int max1=arr1[0];
        int max2=arr2[0];
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>max1){
                max1=arr1[i];
            }
        }
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]>max2){
                max2=arr2[i];
            }
        }
        if(max1>max2){
            System.out.println("Max is from array1 and is: "+max1);
        }
        else{
            if(max1<max2){
                System.out.println("Max is from array2 and is: "+max2);
            }
            else{
                System.out.println("the values of max from the both array is same and is: "+max1);
            }
        }
    }
}
