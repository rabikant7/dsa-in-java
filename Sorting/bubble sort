
public class bubble {
    public static void sort(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            for(int j = 0; j<arr.length-i-1;j++){
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {2,9,5,1,6};

        //array before sorting
        print(arr);
        //Sorting the array
        sort(arr);
        //Array after sorting
        print(arr);

        
    }
}
