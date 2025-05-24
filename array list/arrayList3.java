import java.util.ArrayList;

public class arrayList3 {
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=10; i++){
            arr.add(i*2);
        }
        for(int i=0; i<=arr.size(); i++){
            System.out.println(arr.get(i));
        }

    }
}
