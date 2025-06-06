import java.util.*;
public class lambdaexp1 {
    public static void main(String[] args){
        ArrayList<String> list= new ArrayList<>();
        list.add("rahul");
        list.add("rohit");
        Collections.sort(list, new Comparator<String>(){
            public int compare(String a, String b) {
                return a.compareTo(b);
        }
        });
        //OR
        Collections.sort(list,(a,b)->a.compareTo(b));
        //using lambda expression to implement sort
    System.out.println(list);
}}
