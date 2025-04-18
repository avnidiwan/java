import java.util.Scanner;
public class AlphabetTriangle2 {
    public static void main(String[] args) {
        Scanner obj= new Scanner (System.in);
        System.out.print("enter n: ");
        char n= obj.next().charAt(0);
        for(char i='A'; i<=n; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}


