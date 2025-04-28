public class DisplayAllDigit {
    public static void display(int n){
        while(n>0){
            int d=n%10;
            n=n/10;
            System.out.println(d);
        }
    }
    public static void main(String[] args){
        display(12345);
    }
}
