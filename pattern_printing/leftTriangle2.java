import java.util.Scanner;
public class leftTriangle2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= obj.nextInt();
        int space=n-1;
        for(int i=1; i<=n; i++){
            for(int k=space; k>=i; k--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
           
        System.out.println();
        }

    }
}

