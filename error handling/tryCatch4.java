//MAXIMUN SUBARRAY SUM , USING LOOP
public class tryCatch4 {
    public static void main(String[] args){
       try {
            int [] arr= {2,3,5,5,-1,0,4};
        int sum, max=arr[0], a=0;
        for(int i=0;i<(arr.length-2); i++){
            for(int j=(i+1);j<(arr.length-1); j++){
                sum=arr[i]+arr[j]+arr[j+1];
                if(sum>max){
                    max=sum;
                    a=i;
                }   
            }         
        }
        System.out.println("the sum is: "+max);
         System.out.println("the subarray consists of elemnts "+arr[a]+" "+arr[a+1]+" "+arr[a+2]);
       } catch (Exception e) {
        System.out.println("maximum subarray sum not found");
       }
    } 
}
