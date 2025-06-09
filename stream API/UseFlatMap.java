import java.util.*;
import java.util.stream.*;
public class UseFlatMap {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java is Fun", "Streams are POwerful", null);
        List<String> list2 = list1.stream()
                                  .flatMap(mapper -> Stream.of(mapper.split(" ")))
                                  .collect(Collectors.toList());
        System.out.println(list2);
    }
    
}
