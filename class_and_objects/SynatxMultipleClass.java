class student{
    String firstName="AVNI";
    String lastName="DIWAN";
    void fullName(){
        System.out.print(firstName+" "+lastName);
    }
}
public class SynatxMultipleClass {
    public static void main(String[] args){
        student obj1= new student();
        obj1.fullName();
    }
}
