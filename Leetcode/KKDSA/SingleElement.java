package KKDSA;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int s = 0;
        if (nums.length == 1) return nums[0];
        int e = nums.length - 1;
        int m = 0;
        while(s <= e) {
            m = s + (e - s) / 2;
            int d = e - m;
            if (nums[m] == nums[m + 1]) {
                if (d % 2 == 0) {
                    // Move left
                    s = m + 2;
                }
                else {
                    // Move right
                    e = m - 1;
                }
            }
            else if(nums[m] == nums[m - 1]) {
                if (d % 2 == 0) {
                    // Move left
                    e = m - 2;
                }
                else {
                    // move right
                    s = m + 1;
                }
            }
            else {
                return nums[m];
            }
        }

        return nums[m];
    }
}
