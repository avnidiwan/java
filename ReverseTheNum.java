import java.util.Scanner;

public class ReverseTheNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = obj.nextInt();
        int rem, result=0;
        while(num!=0) {
            rem= num % 10;
            result =result*10+rem;
            num /=10;
            

        }
        System.out.println(result);
    }
}
