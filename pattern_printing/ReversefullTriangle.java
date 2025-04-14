import java.util.Scanner;
public class ReversefullTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter n: ");
        int n= obj. nextInt();
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
