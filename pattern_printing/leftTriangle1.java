import java.util.Scanner;
public class leftTriangle1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= obj.nextInt();
        int space=0;
        for(int i=1; i<=n; i++){
            for(int j=0; j<space; j++){
                System.out.print("  ");
            }
            for(int k=n; k>=i; k--){
                System.out.print("* ");
            }
            space++;
System.out.println();
        }

    }
}
