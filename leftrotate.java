public class leftrotate {

    public static void leftRotate(int arr[],int d){
        int n= arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
    }
    public static void reverse(int arr[], int si, int ei){
        while(si<ei){
            int temp = arr[si];
             arr[si] = arr[ei];
             arr[ei]= temp;
             si++;
             ei--;
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
    
    leftRotate(arr,1);
    System.out.println("array after left rotation by d position:");
    for(int num: arr){
        System.out.print(num+" ");
    }
}
}

