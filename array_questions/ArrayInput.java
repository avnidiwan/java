import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n= obj.nextInt();
        System.out.print("Enter inputs for array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for (int i= 0; i < n; i++) {
           System.out.print(arr[i] + " ");
            
        }}
    }
    
