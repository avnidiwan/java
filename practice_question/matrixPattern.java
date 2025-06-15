public class matrixPattern {
    public static void main(String[] args){
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        // for(int i=0; i<arr.length;i++){
        //     for(int j=0; j<arr[i].length;j++){
        //       if(i==0){
        //         try {
        //     Thread.sleep(1000);;
        // } catch (Exception e) {
        // } 
        //         System.out.print(arr[i][j] + " ");
        //       }
        //       else
        //       {if(j==2){
        //         try {
        //     Thread.sleep(1000);;
        // } catch (Exception e) {
        // } 
        //         System.out.print(arr[i][j] + " ");
        //       }
        //       else
        //       {if(i==2){
        //         try {
        //     Thread.sleep(1000);;
        // } catch (Exception e) {
        // } 
        //       System.out.print(arr[i][j] + " ");
        //       }
        //       else
        //       {if(j==0){
        //         try {
        //     Thread.sleep(1000);;
        // } catch (Exception e) {
        // } 
        //       System.out.print(arr[i][j] + " ");
        //       }
        //     else{if(i==j){
        //         try {
        //     Thread.sleep(1000);;
        // } catch (Exception e) {
        // } 
        //         System.out.print(arr[i][j] + " ");
        //     }}}}}
        //     }  
        //     System.out.println();  
        // }


        for(int i=0; i<arr.length; i++){
          
            System.out.print(arr[0][i]+ " ");
        }
        System.out.println();
        for(int i=1; i<arr.length; i++){
         
            System.out.println(arr[i][2]+" ");
        }
        for(int i=1; i>=0; i--){
            
            System.out.print(arr[2][i]+" ");
        }
    }
}
