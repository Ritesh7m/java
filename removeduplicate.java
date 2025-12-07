import java.util.HashSet;
class removeduplicate{

    public static int  duplicate(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int result[] = new int[set.size()];
        int index =0;
        for(int num:set){
            result[index++] = num;
        }
        System.out.println("array after removing the duplicate elements:");
        for(int num:result){
            System.out.print(num+" ");
        }
        System.out.println();
        return set.size();
    }


    public  static void main(String [] args){
        int arr [] ={1,2,2,3,4,4,5,5,6};
        int ans = duplicate(arr);
        System.out.println("size of array after removing duplicate is: "+ans);

    }
}