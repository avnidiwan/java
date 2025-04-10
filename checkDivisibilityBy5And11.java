public class checkDivisibilityBy5And11 {
    public static void main(String[] args) {
        int num=88;
        if(num%5==0 && num%11==0){
            System.out.println(num+" is divisible by 5 and 11");
        }
        else{
            System.out.println(num+" is not divisible by 5 and 11");
        }
    }
}
