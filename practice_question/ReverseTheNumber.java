import java.util.Scanner;
public class ReverseTheNumber {
     public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("enter number: ");
        int a= obj.nextInt();
    int ans=0;
    while(a>0){
        int lastd= a%10;
        ans=(ans*10)+lastd;
        a= a/10;
    }
    System.out.println(ans);
}
}
