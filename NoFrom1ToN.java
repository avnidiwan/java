import java.util.Scanner;
public class NoFrom1ToN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = obj.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
