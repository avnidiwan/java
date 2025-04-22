import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("enter number: ");
        int a= obj.nextInt();

        // int a=1234;
        int sum=0;
        while(a>0){
            int lastd=a%10;
            sum=sum+lastd;
            a=a/10;
        }
        System.out.print(sum);
        
    }
}
