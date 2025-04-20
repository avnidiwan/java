public class RowSumOf2DArray{
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6}};
        int sum=0;
       for(int i=0; i<arr.length; i++){
        sum=0;
        for(int j=0; j<arr[i].length; j++){
            sum += arr[i][j];
           
        }  
        
        System.out.println("SUM of "+(i+1)+" row is : "+sum);  
       }
       
    }
}

