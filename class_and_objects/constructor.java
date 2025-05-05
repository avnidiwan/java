class student{
    String name="avniii";
    int age=19;
    student(String name, int age){
        System.out.print("NAME: "+name+" AGE: "+age);
    }
    void hey(){
        System.out.println("HEYYY");
    }
}
public class constructor {
   public static void main(String[] args) {
    student obj1= new student("AVNI",20);
    System.out.println();
    System.out.println(obj1.name);
   }

}
