import java.util.Scanner;

public class SumFrom1ToN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = obj.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("SUM: "+sum);

    }
}
