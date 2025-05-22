public class tryCatch1{
    public static void main(String[] args){
        int a=10, b=0;
        try {
            int c= a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("we cannot divide by zero");
        }
        System.out.println("hii");
        System.out.println("Hellooo");
        System.out.println("Byeee");
    }
}