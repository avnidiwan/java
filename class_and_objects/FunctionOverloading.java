class parent{
    void sum(int a, int b){
        System.out.println("sum: " + (a + b));
    }
    void sum(int a, int b, int c){
        System.out.println("sum: " + (a + b + c));
    }
    void sum(double a, double b){
        System.out.println("sum: " + (a + b));
    }
}
public class FunctionOverloading {
 public static void main(String[] args){
    parent a = new parent();
    a.sum(2,8);
    a.sum(1,2,3);
    a.sum(2.2, 5.5);
 }   
}
