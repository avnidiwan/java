import java.util.ArrayList;
public class arrayList4{
    public static void main(String[] args){
        int sum=0, preSum=0, num;
        ArrayList<Integer> arr = new ArrayList<>();
        
        // int [] arr= {2,3,5,5,-1,0,4};
        arr.add(2);  arr.add(-7);  arr.add(0);  arr.add(5);  arr.add(6);  arr.add(-3);  arr.add(0); arr.add(1);
        int totSum=0;
        for(int i=0; i<arr.size(); i++){
            totSum+=arr.get(i);
        }
        System.out.println(totSum);
        for(int i=0; i<arr.size(); i++){ 
             sum=sum+arr.get(i);  
            //  System.out.println(sum);
           if(sum>=preSum){
           
            preSum=sum;
           }
           else if(sum<preSum){
           arr.remove(i);
           num=arr.get(i);
        //    System.out.println(num);
           sum=sum+arr.get(i);
        //    System.out.println("sum: "+sum);
           }
           
        }  
        System.out.println(sum); 
    }  
}


