class areaOfShape{
    void area(int a){
        System.out.println("area of Square is: "+a*a);
    }
    void area(int l, int b){
        System.out.println("area of rectangle is: "+ l*b);
    }
    void area(double r){
        System.out.println("area of circle is: "+3.14*r*r);
    }
    void area(double b, double h){
        System.out.println("area of triangle is: "+ 0.5*b*h);
    }
}
public class AreaUsingFunOverloading {
 public static void main(String[] args){
    areaOfShape a = new areaOfShape();
    a.area(5);
    a.area(5,6);
    a.area(2.2);
    a.area(1.1,5.2);
 }   
}
