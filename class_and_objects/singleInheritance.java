class animal{
    void bark(){
        System.out.println("barks");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("eats");
    }
}
public class singleInheritance{
    public static void main(String[] args){
        dog d = new dog();
        d.bark();
        d.eat();
    }
}