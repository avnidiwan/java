public class finallyWord {
    public static void main(String[] args) {
        try {
            int[] arr={1,2,3,4};
            System.out.println(arr[2]);
        } catch (Exception e) {
            //the "e" tells us about the type of exception, its nanme and its detail 
            System.out.println(e);
            System.out.println("index value out of bound");
        }
        finally{
            System.out.println("SAB THEEK HAI");
        }
    }
}
