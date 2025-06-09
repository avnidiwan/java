import java.util.*;
import java.util.stream.*;
public class StringToLength {
    public static void main(String[] args){
        List<String> list=Arrays.asList("Java","Stream", "API");
        System.out.println("Original list: " + list);
        List<Integer> length=list.stream()
                                 .map(l->l.length())
                                 .collect(Collectors.toList());
        System.out.println("Lengths of strings: " + length);
    }
}
