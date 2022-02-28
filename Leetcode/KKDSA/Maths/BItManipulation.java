package KKDSA.Maths;

public class BItManipulation {
    public static void main(String[] args){
        // System.out.println(is_odd_even(53));
        // System.out.println(find_ith_bit(182, 5));
        // System.out.println(set_ith_bit(182, 4));
        // System.out.println(reset_ith_bit(182, 4));
        System.out.println(nandn_1(14));
    }
    public static String is_odd_even(int n){
        int ans = n & 1; // Ans will store the last digit in binary form
        return (ans == 1 ? "odd" : "even");
    } 

    public static int find_unique(int[] arr){

        /*
            Concept used - XOR with 0 gives same number and XOR of 2 same numbers gives 0
        */

        int unique = 0;

        for(int n: arr){
            unique = unique ^ n;
        }

        return unique;
    }

    public static String find_ith_bit(int n, int i){
        // METHOD 1
        /*
            CONCEPT - 2^i -> generates a number with 1 at ith bit and rest all 0
            Ex - 8 = 2^3 = 100
         */
        System.out.println(n + " - " +Dec_to_Binary(n));
        int ans = n & (int)Math.pow(2, i);

        // METHOD 2
        /**
         * CONCEPT - 1 << (i - 1) = 10000(i-1 times)
         */
        int x = 1 << (i - 1);
        System.out.println(x + " - " +Dec_to_Binary(x));
        ans = n & (1 << (i - 1));
        System.out.println(ans + " - " +Dec_to_Binary(ans));
        ans = ans >> (i - 1 );
        return Dec_to_Binary(ans);
    }

    public static String set_ith_bit(int n, int i) {
        int ans = n | (1 << (i - 1));
        return Dec_to_Binary(ans);
    }

    public static String reset_ith_bit(int n, int i){
        int mask = ~(1 << (i - 1));
        int ans = n & mask;
        return Dec_to_Binary(ans);

    }

    public static String unset_rightmost1(int n){
        int ans = n & (-n);
        return Dec_to_Binary(ans);
    }

    public static int nandn_1(int n){
        System.out.println(Dec_to_Binary(n));
        int i  =0;
        while(n > 0){
            i++;
            System.out.println("n - 1 ->" + (Dec_to_Binary(n - 1)));
            n = n & (n - 1);
            System.out.println(Dec_to_Binary(n));
        }
        return i;
    }

    public static String Dec_to_Binary(int n){
        StringBuilder sb = new StringBuilder("");
        while(n > 0){
            sb.append(n % 2);
            n /= 2;
        }   
        sb.reverse();
        return sb.toString();
    }
}
