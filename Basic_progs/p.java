package Basic_progs;
import java.util.*;
public class p 
{
    public static void main(String[] args)
    {
        int[] arr = {0,1,2,3,4,10,8,3,56,100,98};
        /*Arrays.sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        int x = Arrays.binarySearch(arr, 10);
        System.out.println(x);
        
        for(int num: arr) 
        {
            System.out.println(num);
        }*/
        int[] arr2 = {0,1,2,3,4,10,8,3,56,100,98};
        
        System.out.print(Arrays.equals(arr,arr2));
    }
}