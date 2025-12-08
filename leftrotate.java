public class leftrotate {

    public static void leftRotatebyone(int arr[]){
        int n= arr.length;
        int temp = arr[0];
        for(int i =1;i<n;i++){
            arr[i-1]= arr[i];
        }
        arr[n-1]= temp;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
    
    leftRotatebyone(arr);
    System.out.println("array after left rotation by one position:");
    for(int num: arr){
        System.out.print(num+" ");
    }
}
}

