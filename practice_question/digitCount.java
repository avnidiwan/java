public class digitCount {
    public static void display(int n){
        int count=0;
        while(n>0){
            int d=n%10;
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        display(12345);
    }
}
