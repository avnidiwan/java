
import java.util.*;
import java.util.stream.*;

public class DivisibleBy7 {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(10,14,22,30, 0);
        List<Integer> divisibleBy7 = num.stream().filter(a -> a % 7 == 0).collect(Collectors.toList());
        System.out.println(divisibleBy7);
//can also use anyMatch()
    }
}
