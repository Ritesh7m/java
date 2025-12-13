public class move0atend {
        public   void moveZero(int []arr){
            int n= arr.length;
            int count =0;
            for(int num:arr){
                if(num !=0){
                    arr[count++] = num;
                }
            }
            while(count<n){
                arr[count++] =0;
            }
        } 
    public static void main(String[] args){
        int arr[] = {0,2,0,3,4,0,5,6,0,7};
        move0atend obj = new move0atend();
        obj.moveZero(arr);
        System.out.println("Array after moving zeros to the end:");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }  
}
