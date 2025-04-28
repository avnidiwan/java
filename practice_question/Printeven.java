public class Printeven {
    public static void even(int n){
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
    even(20);
    }
}
