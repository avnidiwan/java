import java.util.Scanner;
public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner obj= new Scanner (System.in);
        System.out.print("enter n: ");
        char n= obj.next().charAt(0);
        for(int i=1; i<=n; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
