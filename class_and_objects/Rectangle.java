class area{
    void area(int l, int b){
        System.out.print("AREA: "+l*b);
    }
}
class perimeter{
    void perimeter(int l, int b){
        System.out.print("PERIMETER: "+2*(l+b));
    }
}
public class Rectangle {
    public static void main(String[] args) {
        area a= new area();
        perimeter p= new perimeter();
        p.perimeter(10,20);
        System.out.println();
        a.area(50,50);
    }
}
