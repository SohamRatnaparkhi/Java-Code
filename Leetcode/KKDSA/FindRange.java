package Leetcode.KKDSA;
import java.util.*;
public class FindRange {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1};
        int target = 1;
        int[] ans = search_range(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search_range(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = binarysearch_asc(nums, target, true);
        ans[1] = binarysearch_asc(nums, target, false);
        
        return ans;
    }
    
    public static int binarysearch_asc(int[] arr, int target, boolean left) {
        int mid = 0;
        int s = 0;
        int e = arr.length - 1;
        int ans = 0;
        while (s <= e) {
            mid = s + (e - s) / 2;
            
            if (arr[mid] > target) {
                e = mid - 1;
            }
            else if (arr[mid] < target) {
                s = mid + 1;
            }
            else {
                ans = mid;
                if (left) {
                    e = mid - 1;
                }
                else {
                    s = mid + 1;
                }
            }
            
        }
        return ans;
    }
}
