public class secLarget {
    public static int secLargest(int[] arr){
        int largest = arr[0];
        int seclargest = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]> largest){
                seclargest = largest;
                largest = arr[i];
            }
            if(arr[i]>seclargest && arr[i] !=largest){
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
    public static void main(String[] args){
        int num []= {3,5,7,2,8,6,9,22,54,1};
        System.out.println("second largest element is: "+ secLargest(num));
    }
    
}
