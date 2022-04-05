package Leetcode.KKDSA;

import java.util.*;

public class PeakIndex {
    public static void main(String[] args) {

    }
    public int findPeakElement(int[] nums) {
        int ans = 0;

        int s = 0;
        int e = nums.length - 1;

        while(s < e) {
            int  mid = s + (e - s) / 2;
            if(nums[mid] < nums[mid + 1] ) {
                s = mid + 1;
            }
            else if(nums[mid] > nums[mid + 1] )  {
                e = mid;
            }
            else {
                ans = mid;
                return ans;
            }
        }

        return s;
    }
}
