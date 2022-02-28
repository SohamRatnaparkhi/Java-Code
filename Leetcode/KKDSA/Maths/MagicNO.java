package KKDSA.Maths;

public class MagicNO {
    public static void main(String[] args) {

    }
    public static int nth_magic_no(int n){
        int base = 5;
        int ans = 0;
        while(n > 0){
            int l = n & 1;
            n = n >> 1;

            ans = ans + (l * base);
            base *= 5;
        }
        return ans;
    }
}
