public class sortedORnot {
    public static boolean sorted(int [] arr){
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int num[] = {3,4,5,1,2};
        System.out.println("is array sorted :"+ sorted(num));
    }
}
