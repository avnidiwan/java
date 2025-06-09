import java.util.*;
import java.util.stream.*;
public class MultiplyAll {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int product = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }
}
