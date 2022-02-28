package Leetcode.KKDSA.BinarySearch;
import java.util.*;
public class Sqrt_precision {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("%.3f",sqrt(sc.nextInt(), 3));
    }

    public static double sqrt(int n, int p) {
        double root  = 0.0;

        int s = 0;
        int e = n;
        int mid = s + (e - s) / 2;
        while(s <= e){
            mid = s + (e - s) / 2;
            if (mid * mid > n) {
                e = mid - 1;
            }
            else if (mid * mid < n) {
                s = mid + 1;
            }
            else {
                root = mid;
                return root;
            }
        }
        root = e;
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }
}
