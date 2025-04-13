import java.util.Scanner;
public class PrintASCIIValue {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch= obj.next().charAt(0);
        System.out.println("the character is "+ch+" and its ASCII value is "+(int)ch);

    }
}
