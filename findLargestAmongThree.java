public class findLargestAmongThree {
    public static void main(String[] args) {
        int a=11, b=55, c=33;
        if(a>b){
            if(a>c)
            System.out.println("Largest number is "+a);
            else
            System.out.println("Largest number is "+c);
        }
        else{ //b>a
            if(b>c)
            System.out.println("Largest number is "+b);
            else
            System.out.println("Largest number is "+c);
        }

    }
}
