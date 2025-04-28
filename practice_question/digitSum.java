public class digitSum {
    public static void display(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            n=n/10;
            sum+=d;
            
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        display(12345);
    }
}
