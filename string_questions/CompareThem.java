public class CompareThem {
    public static void main(String[] args) {
    String str1="Heyyyy",
    str2="Avniii";
    int notFound=1;
    for(int i=0, j=0; i<str1.length() || j<str2.length(); i++, j++){
        if(str1.charAt(i)==str2.charAt(j)){
            System.out.println("same characters are: "+str1.charAt(i));
            notFound=0;
        }
        }
if(notFound==1){
System.out.println("No character matched...");
}
    }
}

