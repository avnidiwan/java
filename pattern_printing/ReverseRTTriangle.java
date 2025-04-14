import java.util.Scanner;
public class ReverseRTTriangle {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("enter n: ");
        int n= obj.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
        }
        System.out.println();
    }
    }
}
