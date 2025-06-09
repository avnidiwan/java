import java.util.*;
import java.util.stream.*;
public class SquareOfEven {
    public static void main(String[] args){
        List <Integer> list= Arrays.asList(1,2,3,4,5);
        List<Integer> evenlist= list.stream()
                                    .filter(n -> n%2==0)
                                    .collect(Collectors.toList());
        System.out.println("Even numbers are: " + evenlist);
        List<Integer> squareOfEven = evenlist.stream()
                                             .map(n->n*n)
                                             .collect(Collectors.toList());
        System.out.println("Square of even numbers are: " + squareOfEven);
    }
}
