import java.util.Scanner;
public class SquareOfStars{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter n:");
        int n = obj.nextInt();
        for(int i=1; i<=n; i++){
           for(int j=1; j<=n; j++){
            System.out.print("* ");
           }
           System.out.println();
        }

    }
}