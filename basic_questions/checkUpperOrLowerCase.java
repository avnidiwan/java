public class checkUpperOrLowerCase {
    public static void main(String[] args) {
        char alp='@';
        if(alp>='A' && alp<='Z'){
            System.out.println(alp+" is in UPPERCASE");
        }
        else if(alp>='a' && alp<='z'){
            System.out.println(alp+" is in LOWERCASE");
        }
        else{
            System.out.println(alp+" is an INVALID INPUT");
        }
    }
}
