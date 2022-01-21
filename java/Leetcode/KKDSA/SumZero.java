package Leetcode.KKDSA;

import java.util.*;

public class SumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        if (n % 2 == 0) {
            // N is even
            int j =0;
            for (int i = -n / 2; i <= n / 2; i++) {
                if(i != 0){
                    ans[j] = i;
                    j++;
                }
            }           
        }
        else {
            int j =0;
            for (int i = -n / 2; i <= n / 2; i++) {
                
                    ans[j] = i;
                    j++;
            }
        }
        return ans;
    }
    
}
