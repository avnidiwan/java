import java.util.Scanner;
public class CountOddEven {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=obj.nextInt();
        int[] arr= new int[n];
        int countEven=0, countOdd=0;
        System.out.print("enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]= obj.nextInt();  
            if(arr[i]%2==0){
                countEven++;
            }  
            else if(arr[i] % 2 != 0) {
                countOdd++;
            }  
        }
        System.out.println("Even numbers count: "+countEven);
        System.out.println("Odd numbers count: "+countOdd);

    }
    }

