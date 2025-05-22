import java.util.Scanner;
public class tryCatch2{
    public static void main(String[] args){
         System.out.print("Enter value of a: ");
         Scanner obj= new Scanner(System.in);
         int a = obj.nextInt();
         System.out.println();
         System.out.print("Enter value of b: ");
        // Scanner obj = new Scanner(System.in);
         int b = obj.nextInt();
         try {
             int c= a/b;
         System.out.println(c);
         } catch (Exception e) {
            System.out.println("We cannot divide by zero");
         }
        System.out.println("hii");
        System.out.println("Hellooo");
        System.out.println("Byeee");
    }
}
