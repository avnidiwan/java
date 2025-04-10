public class swapwithoutvar {
    public static void main(String[] args) {
        int a=100, b=300;
        System.out.println("Before swapping the values are "+a+" and "+b);
        a=a+b; b=a-b; a=a-b;
        System.out.println("After swapping the values are "+a+" and "+b);
    }
}
