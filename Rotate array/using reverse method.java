public class rotate_reverse {

    public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start++] = arr[end];
        arr[end--] = temp;
    }
}
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int k = 3;
        k = k%n;

        print(arr);
        reverse(arr, 0, n-1);
        print(arr);
        reverse(arr,0,k-1);
        print(arr);
        reverse(arr,k,n-1);
        print(arr);
        
        


    }
}
