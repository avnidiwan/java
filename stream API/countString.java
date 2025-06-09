import java.util.*;
import java.util.stream.*;
public class countString {
    public static void main(String[] args){
        List<String> list = Arrays.asList("apple", "banana", "apricot", "cherry", "Avocado");
        List<String> newList=list.stream().filter(s->s.startsWith("a")||s.startsWith("A")).collect(Collectors.toList());
        System.out.println("Strings starting with 'a' or 'A': " + newList);
        int count=newList.size();
        System.out.println("Count of strings starting with 'a' or 'A': " + count);

    }
}
