package KKDSA.Recursion;

public class BInarySearch {
    public static void main(String[] args){
        int[] nums = {2,5,77,89,101,123,124,130};
        int e = nums.length - 1;
        int target = 43;
        System.out.println(binary_Search(0, e, nums, target));
    }
    public static int binary_Search(int s, int e, int[] nums, int target){
        if (s > e){
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (nums[mid] < target){
            s = mid + 1;
        }
        else if(nums[mid] > target){
            e = mid - 1;
        }
        else{
            return mid;
        }
        
        return binary_Search(s, e, nums, target);
    }
}
