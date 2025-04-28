public class linearSearch {
    public static void search(int[] arr, int key){
        int found=0;
        for(int i=0; i<arr.length; i++){        
                if(arr[i] == key){
                System.out.println("founded");
                System.out.println("index number: "+i);
                found=1;}
        }
        if(found==0){
            System.out.print("not found");
        }

    }
    public static void main(String[] args){
        int[] arr={10,92,78,55,45,92,45,6};
        search(arr, 6);
    }
}
