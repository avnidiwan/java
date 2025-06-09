
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class LIstOfName {
    public static void main(String[] args) {
    List<String> name=Arrays.asList("Ram","Shyam","Om","Sita");
    List<String> filterName=name.stream()
                                .filter(n-> n.length() > 3)
                                .collect(Collectors.toList());
    System.out.println("Names with more than 3 characters: " + filterName);
    List<String> uppercase=filterName.stream()      
                                     .map(n->n.toUpperCase())
                                     .collect(Collectors.toList());
    System.out.println("Uppercase names: " + uppercase);
    }
}
