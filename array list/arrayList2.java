import java.util.ArrayList;
public class arrayList2{
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        System.out.println(arr);
        arr.add(2, "C");
        arr.add(3, "D");
        System.out.println(arr);
        arr.addFirst("Alphabets: ");
        System.out.println(arr);
        arr.addLast("E F G ...");
        System.out.println(arr);
        
        System.out.println(arr.get( 1));
        
        System.out.println(arr.getFirst());
        
        System.out.println(arr.getLast());
        
        System.out.println(arr.indexOf("A"));
        arr.clear();
        System.out.println(arr);
    }
}
