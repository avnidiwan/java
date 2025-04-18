public class UniqueElement {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5}; //[000,000,000,000,6]
        int[] arr2={2,3,4,5,6}; //[1,000,000,000,000]
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]) {
                   arr1[i] = arr2[j] = 000;
                    break;
                }         
                else{
                    if(arr2[j]==000 || arr1[i]==000){
                        continue;
                    }
                }
            }
        }int count=0;
    for(int i=0; i<arr1.length; i++){
    if(arr1[i]==000){
        continue;
    }
    else{
        System.out.print(arr1[i]+"  ");
        count++;
    }
    }
    for(int i=0; i<arr2.length; i++){
    if(arr2[i]==000){
        continue;
    }
    else{
        System.out.print(arr2[i]+"  ");
        count++;
    }
    }
    System.out.println();
    System.out.print("the total number of unique elements are: "+count);
}
}



