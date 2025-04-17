public class SumOfTwoArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,7,8,9};
        int[] arr2={6,2,0,6,1,4};
        int sum1=0, sum2=0, tSum;
        for(int i=0; i<arr1.length; i++){
            sum1=sum1+arr1[i];
        }
        for(int j=0; j<arr2.length; j++){
            sum2=sum2+arr2[j];
        }
        tSum=sum1+sum2;
        System.out.print("SUM: "+tSum);



    }
}
