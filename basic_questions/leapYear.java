public class leapYear{
    public static void main(String[] args) {
        int year=1999;
        if(year%4==0 && year%10!=0){
            System.out.println(year+" is a LEAP YEAR");
        }
        else{
            System.out.println(year+" is not a leap year");
        }

}}