import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= obj.nextInt();
        System.out.print("Enter the number to find in the array: ");
        int key= obj.nextInt();
        System.out.print("Enter the elements of array: ");
        int[] arr= new int[n];
        int found=0;
        for(int i=0; i<n; i++){
            arr[i]=obj.nextInt();
            if(arr[i]==key){
                System.out.println("Element is present at index " + i);
                found=1;
                break;
                
            }
        }
        if(found==0){
            System.out.print("Element not found");
        }
    }
    
}
