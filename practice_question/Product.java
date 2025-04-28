public class Product {
    public static void multiply(int n){
        int m=1;
        for(int i=1; i<=n; i++){
            m*=i;
        }
        System.out.print("product is: "+m);
    }
    public static void main(String[] args) {
        multiply(5);
    }
}
