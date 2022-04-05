package Leetcode.KKDSA;
import java.util.*;
public class AmazonInfinteArray {
    static int s = 0;
    static int e = 1;
        
        
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
        int arr[] = new int[20];
        int target = sc.nextInt();
        //System.out.println(target);
        for (int i = 0; i < 20; i ++) {
            arr[i] = sc.nextInt();
        }*/
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(find_pos(arr, target));

    }
    public static int find_pos(int[] arr, int key){
        int s = 0;
        int e = 1;
        int ans = binarysearch_asc(arr, key, s, e);
        while (arr[e] < key) {
            s = e;
            e = 2*e;
            ans = binarysearch_asc(arr, key, s, e);
            
            
        }
        return ans;
    }
    public static int binarysearch_asc(int[] arr, int target, int s, int e) {
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (arr[mid] > target) {
                e = mid - 1;
            }
            else if (arr[mid] < target) {
                s = mid + 1;
            }
            else {
                return mid;
            }
            
        }
        return -1;
    }
}
 