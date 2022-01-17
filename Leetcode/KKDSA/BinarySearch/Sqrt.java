package Leetcode.KKDSA.BinarySearch;
import java.util.*;;
public class Sqrt {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(sqrt(sc.nextInt()));
    }
    
    public static long sqrt(int x) {
        long s = 0;
        long e = x;

        while(s < e) {
            long mid = s + (e - s) / 2;
            long sq = mid * mid;
            long sq2 = (mid + 1) * (mid + 1);
            if (sq2 <= x){
                s = mid + 1;
            }
            else if (sq2 > x){
                e = mid;
            }
            
        }
        return s;
        
    }
}
