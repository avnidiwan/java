import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("ENTER THE FIRST OPERAND");
        int a = obj.nextInt();
        System.out.println("ENTER THE OPERATOR");
        char op= obj.next().charAt(0);
        System.out.println("ENTER THE SECOND OPERAND");
        int b= obj.nextInt();
        switch(op){
            case '+': System.out.println("ADDITION: " +(a+b));
            break;
            case '-': System.out.println("SUBTRACTION: "+(a-b));
            break;
            case '*': System.out.println("MULTIPLICATION: "+(a*b));
            break;
            case '/': System.out.println("DIVISION: "+(a/b));
            break;
            default: System.out.println("INVALID OPERATOR");
        }
}
}
