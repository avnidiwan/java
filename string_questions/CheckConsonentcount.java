public class CheckConsonentcount {
    public static void main(String[] args) {
        String palin="malayalam";
        int isPalin=0;
        int length=palin.length();
        int countVow=0;
        for(int i=0, j=(palin.length()-1); i<j; i++, j--){
           if(palin.charAt(i)==palin.charAt(j)){
            if(palin.charAt(i)=='a' || palin.charAt(i)=='e' || palin.charAt(i)=='i' || palin.charAt(i)=='o' || palin.charAt(i)=='u'){
               countVow++;
            }
               isPalin=1;
               
           } else{
               isPalin=0;
               break;
           }
        }
        if(isPalin==1) {
           System.out.print("IS PALINDROME");
           System.out.println();
           System.out.print("the count of consonent is: "+(length-(countVow*2)));
        }
        else if(isPalin==0){
           System.out.print("NOT PALINDROME");
        }
       } 
}
