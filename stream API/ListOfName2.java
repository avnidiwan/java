import java.util.*;
import java.util.stream.*;
public class ListOfName2 {
    public static void main(String[] args) {
        List<String> name=Arrays.asList("John","Ravi","Abhishek");
        //List<String> newList=name.stream().filter(n->n.length()>4).collect(Collectors.toList());
        String newList=name.stream().filter(n->n.length()>4).collect(Collectors.joining());   
        System.out.println(newList);
    }
}
