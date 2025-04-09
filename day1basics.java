
public class day1basics {
    public static void main(String[] args) {
      //wap to print hello world
      System.out.println("Hello World");

      System.out.println("\n");
      //wap to declare variable 
      byte a=8;
      short b=9;
      int c=10;
      long d=11;
      float e=12.5f;
      double f=13.5;
      char g='@';
      boolean h=false;
      System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);

      System.out.println("\n");
      //convert an int to float and print both
      int i=28;
      float j=(float)i;
      System.out.println("int="+i+"   float="+j);

      System.out.println("\n");
      //convert a double to int and print both
      double k=28.282828;
      int l=(int)k;
      System.out.println("double="+k+"    int="+l);

      System.out.println("\n");
      //predict the output
      int x='A';
      System.out.println(x);

      System.out.println("\n");
      //Swap two numbwers using a temporary variable
      int m=10;
      int n=20;
      System.out.println("Original values of m and n are "+m+" "+n);
      int o=n; n=m; m=o;
      System.out.println("swaped values of m and n are "+m+" "+n);

      System.out.println("\n");
      //Swap two numbers without using the third variable
      int num1=10;
      int num2=2;
      System.out.println("Original values of num1 and num2 are "+num1+" "+num2);
      num1+=num2;
      num2=num1-num2;
      num1=num1-num2;
      System.out.println("swaped values of num1 and num2 are "+num1+" "+num2);

      System.out.println("\n");
      //predict the output
      int y=5; double z=10;
      System.out.println(y+z);

      System.out.println("\n");
      //Declare 2 int and 2 float values and add all 4 a d print the result
      int a1=10, a2=20;
      float b1=10.11f, b2=20.22f;
      System.out.println("sum of values is "+(a1+a2+b1+b2));
}
}
