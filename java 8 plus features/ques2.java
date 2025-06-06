
import java.util.*;
import java.util.stream.Collectors;

public class ques2 {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(3,65,76,37,3,85,26,96,29,7,30,16,87,91,90);
        int max=list.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("maximum value: "+max);
        List<Integer> newList=list.stream()
                                .filter(n -> n!=max)
                                .collect(Collectors.toList());
        System.out.println(newList);
        int secMax=newList.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("Second maximum value: "+secMax);
    }
}
