class student{
    void display(String name, int rollno, int marks){
        System.out.print("NAME: " +name+ "     ROLL NO: " +rollno+ "     MARKS: "+marks);
 }
}
public class studentInfo {
    public static void main(String[] args){
    student s1 = new student();
    student s2 = new student();
    student s3 = new student();
    s1.display("Avni",123,90);
    System.out.println();
    s2.display("Unnati",456,89);
    System.out.println();
    s3.display("Sondhiya",899,70);
    System.out.println();
}
}