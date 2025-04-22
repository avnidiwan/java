public class PrintPalindromeCount {
    public static void main(String[] args) {
        String palin="racecar";
        int isPalin=0;
        int count=0;
        for(int i=0, j=(palin.length()-1); i<j; i++, j--){
           if(palin.charAt(i)==palin.charAt(j)){
               count++;
               isPalin=1;
               
           } else{
               isPalin=0;
               break;
           }
        }
        if(isPalin==1) {
           System.out.print("IS PALINDROME");
           System.out.println();
           System.out.print("the count of same alphabet is: "+count);
        }
        else if(isPalin==0){
           System.out.print("NOT PALINDROME");
        }
       } 
}
