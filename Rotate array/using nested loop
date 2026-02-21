public class rotateArray {
    public static void rotate(int arr[], int key){
        int n = arr.length;
        int time = key % n;

        for(int j =0 ; j< time; j++){

        int last = arr[n-1];
        int i = n-1;
        while(i>0){
            arr[i] = arr[i-1];
            i--;
        }
        arr[i] = last;
        }
    }

    public static void print(int arr[]){
        for(int j = 0; j<arr.length ;j++){
            System.out.print(arr[j] +" ");
        }
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        
       rotate(arr, 8);
        print(arr);
    }
}
