
import java.util.*;

public class reduce {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(5,10,15,20,25);
        int sum=list.stream().reduce(0,(a,b)->a+b) ;
        System.out.println(sum);
    }
}
