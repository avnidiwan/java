import java.util.Scanner;

public class CheckMultipleOf3 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = obj.nextInt();
        if(n%3==0) System.out.println(n+" is a multiple of 3");
        else System.out.println(n+" is not a multiple of 3");
    }
}
