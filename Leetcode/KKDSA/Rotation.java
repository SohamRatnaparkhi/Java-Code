package KKDSA;
import java.util.*;

public class Rotation {
    public static void main(String[] args){
        int[][] mat = { 
                        {0,0,0},
                        {0,1,0},
                        {1,1,1}
                      };
        int[][] target = { 
                        {1,1,1},
                        {0,1,0},
                        {0,0,0}
                      };
        System.out.println(findRotation(mat, target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int rotation = 0;
        if (check_same(mat, target)) {
            return true;
        }
        while (rotation < 4) {
            int[][] rotated_mat = rotate(mat);
            if (check_same(rotated_mat, target) == true) {
                return true;
            }
            rotation += 1;
            mat = rotated_mat;
        }
        return false;
    }

    public static boolean check_same(int[][] mat, int[][] target) {

        //return Arrays.equals(mat,target);
        
        for (int i = 0; i < mat.length; i++) {
            if (Arrays.equals(mat[i],target[i]) == false) {
                return false;
            }
        }

        return true;
    }

    public static int[] generate_col(int[][] mat, int c, int l) {
        int col[] = new int[l];
        for(int i = 0; i < l; i++){
            col[i] = mat[i][c];
        }
        reverse(col);
        return col;
    }

    public static void reverse(int[] col) {
        int ub = 0;
        int lb = col.length - 1;
        while(ub < lb){
            swap(ub, lb, col);
            ub++;
            lb--;
        }
        
    }
    public static void swap(int ub, int lb, int[] col) {
        int t = col[ub];
        col[ub] = col[lb];
        col[lb] = t;
    }
    public static int[][] rotate(int[][] mat) {
        int[][] rot = new int[mat.length][mat.length];
        int l = mat.length;
        for (int i = 0; i < mat.length; i++) {
            int[] col = generate_col(mat, i, l);
            for(int j = 0; j < mat[i].length; j++) {
                rot[i][j] = col[j];
            }
        }
        return rot;
    }
}
