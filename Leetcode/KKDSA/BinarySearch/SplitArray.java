//package Leetcode.KKDSA.BinarySearch;
import java.util.*;
public class SplitArray {
    public static void main(String[] args) {
        int nums[] = {7,2,5,10,9};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }
    public static int splitArray(int[] nums, int m) {

        int max = nums[0];
        int sm = 0;


        for (int i : nums){
            sm += i;
            if (max < i) max = i;
        }

        if (m == nums.length) return max;
        else if(m == 1) return sm;

        int s = max;
        int e = sm;

        while (s <= e){
            int mid = s + (e - s) / 2;
            int arr[][] = new int[nums.length][nums.length];
            int sum = 0;
            int i = 0;
            int j = 0;
            int k = 0;
            int ans[] = new int[m];
            while (mid >= sum && j < nums.length) {
                
                sum += nums[j];
                if (sum > mid) {
                    sum = 0;
                    k = 0;
                    i++;
                    continue;
                }    
                arr[i][k++] = nums[j++];
            } /*
            for (int[] row : arr){
                System.out.println(Arrays.toString(row));
            }*/
            if (i + 1 <= m) {
                e = mid;
            }
            else if (i + 1 > m) {
                s = mid + 1;
            }
            if (s == e) return s;
            }
    return 0    ;
    }
    
    public static int Sum(int[] a) {
        int sum = 0;
        for(int i : a) {    
            sum += i;
        }
        return sum; 
    }

}
