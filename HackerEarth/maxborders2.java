package HackerEarth;
import java.util.*;
public class maxborders2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++){
            int n = 0;
            int m = 0;
            int inp[] = new int[2];
            inp[0] = n = sc.nextInt();
            inp[1] = m = sc.nextInt();
            String[] matrix = new String[n];
            for(int j = 0; j < n; j++){
                matrix[j] = sc.next();
            }
            int ans = find_border_black(matrix);
            System.out.println(ans);
            
        }

    }

    public static int find_border_black(String[] matrix) {
        String black = "#";
        String white = ".";
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            String row = matrix[i];
            int ans = 0;
            int black_1 = 0;
            int white_s = 0;
            for(int j = 0; j < row.length(); j++) {
                String c = row.charAt(j) + "";
                if(c.compareTo(black) == 0){
                    black_1 = j;
                    break;
                }
            }
            for (int b = black_1; b < row.length(); b++) {
                String c = row.charAt(b) + "";
                if(c.compareTo(white) == 0){
                    white_s = b;
                    break;
                }
            }
            ans = white_s - black_1;
            if (ans > max){
                max = ans;
            }
        }
        return max;
    }
}
