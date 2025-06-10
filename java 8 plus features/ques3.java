import java.util.*;
import java.util.stream.Collectors;

public class ques3 {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(3,65,76,37,3);
        int min=list.stream().reduce(Integer.MAX_VALUE,(a,b)->a>b?b:a);
        System.out.println("minimum value: "+min);
        List<Integer> newList=list.stream()
                                .filter(n -> n!=min)
                                .collect(Collectors.toList());
        System.out.println(newList);
        int secMin=newList.stream().reduce(Integer.MAX_VALUE,(a,b)->a>b?b:a);
        System.out.println("Second minimum value: "+secMin);
    }
}