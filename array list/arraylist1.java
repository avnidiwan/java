
import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args){
        ArrayList<String> arr= new ArrayList();
        arr.add("Avni");
        arr.add("Unnati");
        arr.add("Aaradhya");
        System.out.println(arr);
        arr.add(1,"Diwan");
        System.out.println(arr);
    }
}
