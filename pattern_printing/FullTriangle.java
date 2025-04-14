import java.util.Scanner;
public class FullTriangle {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
       
        System.out.print("enter n: ");
        int n= obj.nextInt();
        for(int i=1; i<=n; i++){
            for(int space=1; space<n-i+1; space++){
                System.out.print(" ");
            }

            for(int star=1; star<=i; star++){
                System.out.print("* ");
            }

            for(int space=1; space<n-i+1; space++){
                System.out.print(" ");
            }
           System.out.println();
        }
    }
}
