package Leetcode.KKDSA;

public class SmallestLetterGreraterThanTagret {
    public static void main() {
        
    }
    public char nextGreatestLetter(char[] letters, char target) {

        int s = 0;
        int e = letters.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (letters[mid] > target) {
                e = mid - 1;
            }
            else if (letters[mid] < target) {
                s = mid + 1;
            }
            //System.out.printf("s = %d, mid = %d, end = %d \n", s, mid, e);
            
        }
        return letters[(int)s % letters.length];  
    }
}
