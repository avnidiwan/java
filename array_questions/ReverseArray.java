import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= obj.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= obj.nextInt();
      }
      System.out.println("Reversed aray is:");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+"  ");
        }
    }
    }

