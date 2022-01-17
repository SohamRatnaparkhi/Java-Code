package Leetcode.KKDSA;

import javax.print.attribute.standard.NumberOfDocuments;

public class MountainSearch {
    public static void main(String[] args) {
        int[] nums = {1,5,2};
        int target = 0;

        System.out.println(findInMountainArray(target, nums));
    }

    public static int findInMountainArray(int target, int[] arr) {
        int ans = -1;
        int p = findPeakElement(arr);
        if (p > target){
            ans = binarysearch_desc(arr, target);
        }
        else {
            ans = binarysearch_asc(arr, target);
        }

        return ans;
    }

    public static int findPeakElement(int[] nums) {
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
    public static int binarysearch_asc(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
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

    public static int binarysearch_desc(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (arr[mid] < target) {
                e = mid - 1;
            }
            else if (arr[mid] > target) {
                s = mid + 1;
            }
            else {
                return mid;
            }
            
        }
        return -1;
    }

}
