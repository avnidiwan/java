import java.util.Scanner;
public class DiamondShape {
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
        for(int i=1;i<=n;i++){
            for(int space=1; space<i; space++){
                System.out.print(" ");
            }
            for( int star=n; star>=i; star--){
                System.out.print("* ");
            }

            for(int space=1; space<i; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
