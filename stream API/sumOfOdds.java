import java.util.*;
import java.util.stream.*;

public class sumOfOdds {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        List<Integer> oddList=list.stream()
                                  .filter(n->n%2!=0)
                                  .collect(Collectors.toList());
        System.out.println("Odd numbers are: " + oddList);
        int sum = oddList.stream()
                        .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of odd numbers is: " + sum);
    }
}
