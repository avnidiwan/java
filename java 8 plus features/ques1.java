//the task is to take a list first filter the values greater than 2, the filter the even values and then calculate the sum of even list
import java.util.*;
import java.util.stream.Collectors;
public class ques1{
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(0,2,3,4,5);
        List<Integer> greater2 = list.stream()
                                .filter(n -> n>=2)
                                .collect(Collectors.toList());
        System.out.println("values greater than 2 are: "+greater2);
        List<Integer> evenList = greater2.stream()
                                .filter(n -> n%2==0)
                                .collect(Collectors.toList());
        System.out.println("even values are: "+evenList);
        int sum=evenList.stream().reduce(0,(a,b)->a+b) ;
        System.out.println("sum of even valus is: "+sum);

    }
}
