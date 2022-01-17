package Leetcode.KKDSA;
import java.sql.Array;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] shift(int[] nums, int[] x, int i, int c){
        int array[] = new int[c + 1];
        array[i] = nums[i];
        int l = 0;
        for(int j = 0; j < x.length; j++){
            if (j != i) {
                array[j] = x[l];
                l++;
            }
        }
        return array;   
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int cnt = 0;
        int[] target = new int[nums.length];
        
        for(int i : index) {
            int[] x = new int[cnt + 1];
            x = shift(nums, x, i, cnt);
            cnt++;
            target = x;
        }
        return target;
    }
}