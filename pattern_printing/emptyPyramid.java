import java.util.Scanner;
public class emptyPyramid {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= obj.nextInt();
        int space1=n-1, space2=n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int k=space1; k>=1; k--){
                System.out.print("  ");
            }
            space1--;
            for(int k=space2; k>=1; k--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            space2--;
        System.out.println();
        }

    }
}
