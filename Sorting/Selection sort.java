public class selection {

    public static void main(String[] args) {
        int arr[] = {1,5,4,3,16};

        print(arr);
        sort(arr);
        print(arr);
    }


    public static void sort(int arr[]){
        for(int i =  0; i<arr.length-1; i++){
            int min = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                     min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int arr[]){
          for(int j =0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
            }
            System.out.println();

    }
   
}
