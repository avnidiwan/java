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
class puppy extends dog{
    void cute(){
        System.out.println("cutieesss");
    }
}
public class Multilevelnhertance {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.bark();
        p.eat();
        p.cute();
    }
}
