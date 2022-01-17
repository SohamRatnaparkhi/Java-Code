package Leetcode.KKDSA.BinarySearch;

import java.util.*;

public class CeilingandFloorOfNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array - ");
        for (int i = 0; i < n; i++) {
            arr[i]  = sc.nextInt();
        }
        System.out.print("Enter target - ");
        int target = sc.nextInt();
        System.out.println("Ceiling - " + ceiling(arr,target));
        System.out.println("Floor - " + floor(arr,target));
    }
    public static int ceiling(int[] arr, int target) {
        // Assuming ascending array

        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            else if (arr[mid] > target) {
                e = mid - 1;
            }
            else if (arr[mid] < target) {
                s = mid + 1;
            }
            //System.out.printf("s = %d, mid = %d, end = %d \n", s, mid, e);
            
        }
        return arr[s];  
    }
    public static int floor(int[] arr, int target) {
        // Assuming ascending array

        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            else if (arr[mid] > target) {
                e = mid - 1;
            }
            else if (arr[mid] < target) {
                s = mid + 1;
            }
            //System.out.printf("s = %d, mid = %d, end = %d \n", s, mid, e);
            
        }
        return arr[e];
    }  
    
}
