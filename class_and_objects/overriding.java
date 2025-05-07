class parent{
    void eat(){
        System.out.println("Maggieee");
    }
}
class child extends parent{
    void eat(){
        System.out.println("Pastaaa");
    }
}
public class overriding {
    public static void main( String[] args){
        parent obj= new child();
         obj.eat();
    }

}
