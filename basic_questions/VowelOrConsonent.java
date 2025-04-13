import java.util.Scanner;
public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE ALPHABET");
        char alp = obj.next().charAt(0);
        switch (alp){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("VOWELS"); break;
            default: System.out.println("CONSONENT");
        }       
    }
}
