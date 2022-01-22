package HackerEarth;
import java.util.*;

public class MaxBorders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[][] matrix = new String[n][m];
            for (int r = 0;  r < n; r++){
                for(int c = 0; c < m; c++){
                    matrix[r][c] = sc.next();
                }
            } 
            int ans = find_border_black(matrix);
            System.out.println(ans);
        }

    }
    
    public static int find_border_black(String[][] matrix){
        String black = "#";
        String white = ".";
        int max = 0;
        for (int i = 0; i < matrix.length; i++){
            String[] row = matrix[i];
            int ans = 0;
            int black_1 = 0;
            int white_s = 0;
            
            for (int j = 0; j < row.length; j++){  
                //System.out.println(row[j]);           
                if(row[j].compareTo(black) == 0){
                    black_1 = j;
                    break;
                }
            }
            for(int b = black_1; b < row.length; b++){
                if (row[b].compareTo(white) == 0){
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
