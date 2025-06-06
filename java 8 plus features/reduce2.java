import java.util.*;

public class reduce2 {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(5,10,15,20,25);
        Optional sum=list.stream().reduce((a,b)->a+b);
        System.out.println(sum);
    }
}
