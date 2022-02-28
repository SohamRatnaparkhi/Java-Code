package KKDSA.Maths;
import java.util.*;
public class PrimeAndSieve {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
    public static boolean isPrime(int n) {
        // No need to check till n because after sqrt(n) there are all repeations

        for(int i = 2; i * i <= n; i++){
            if (n % i == 0) return false;
        }

        return true;
    }

    public static String sievePrimeGenerator(int n, boolean[] primes){
        /**
         * n = number uptill which prime nos are to be generated
         * primes initially has all elements false by default
         * LOGIC
         * Instead of checking wheather all nums are prime - we remove(make them True) the multiples of prime nos less than sqrt of n
         * Remaining ones which are False are Prime and True are non Prime
         * 
         * COMPLEXITY - O(N * log(log(n)))
         */
        ArrayList<Integer> ans = new ArrayList<Integer>(5);
        for(int i = 2; i * i <= n; i++){
            if(!primes[i]){
                for(int j = i * 2; j <= n; j += i){
                    primes[j] = true;
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            if(!primes[i]){
                ans.add(i);
            }
        }
        return ans.toString();
    }
}
 