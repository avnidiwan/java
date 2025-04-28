public class sum {
    public static void sumofN(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        sumofN(5);
    }
}
