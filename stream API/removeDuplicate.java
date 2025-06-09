import java.util.*;
import java.util.stream.*;
public class removeDuplicate {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(999,1000,1500,1000,2000);
        System.out.println("Original prices "+list );
        List<Integer> newList=list.stream()
                                    .distinct()
                                    .collect(Collectors.toList());
                                    System.out.println("NEW LIST: "+newList);
        List<Integer> MoreThan1000= newList.stream()
                                    .filter(n -> n > 1000)
                                    .collect(Collectors.toList());
        System.out.println("prices greater than 1000: "+MoreThan1000); 
        int totalsum=MoreThan1000.stream().reduce(0,(a,b)->a+b);
        System.out.println("total price: "+totalsum); 
    }
}
