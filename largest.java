public class largest{
    public static int largest(int [] arr){
        int largest = Integer.MIN_VALUE;
        for(int num :arr){
            if(num>largest){
                largest = num;
            }
        }
        return largest;
    }
    public static  void main(String[] args){
        int num [] = {3,5,7,2,8,6,9,22,54,1};
        System.out.println("largest element is: "+ largest(num));
    }
}
