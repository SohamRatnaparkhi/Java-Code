package Leetcode.KKDSA.BinarySearch;

public class BS {
    public static void main(String[] args) throws Exception {

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
    public static int Order_Agnostic_BinarySeach(int[] arr, int target) {
        if(arr[0] > arr[1] ){
            // Descending order
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
        else {
            // Ascending order
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
    }
}
