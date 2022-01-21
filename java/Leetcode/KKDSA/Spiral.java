package Leetcode.KKDSA;

import java.util.*;
class Spiral {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>(5);
        int elements = matrix.length * matrix[0].length;
        int cnt = 0, ro = 0, rc = matrix.length - 1, cs = 0, ce = matrix[0].length - 1, rps = 0, rpe = matrix[0].length - 1;
        String game = "on";
        while (cnt <= elements) {
            /* r = 0, 
            c = matrix[0].length 
            rc  = matrix.length */
            for (int i = rps; i <= rpe; i++) {
                ans.add(matrix[ro][i]);
                cnt++;
                if (cnt >= elements){
                    game = "off";
                    break;
                }
            }
            if(game == "off") break;
            for(int i = ro + 1; i < rc; i++) {
                ans.add(matrix[i][ce]);
                cnt++;
                if (cnt >= elements){
                    game = "off";
                    break;
                }
            }
            if(game == "off") break;
            for (int i = rpe; i >= rps; i--) {
                ans.add(matrix[rc][i]);
                cnt++;
                if (cnt >= elements){
                    game = "off";
                    break;
                }
            }
            if(game == "off") break;
            for(int i = rc - 1; i > ro; i--) {
                ans.add(matrix[i][cs]);
                cnt++;
                if (cnt >= elements){
                    game = "off";
                    break;
                }
            }
            if(game == "off") break;
            ro++;
            rc--;
            cs++;
            ce--;
            rps++;
            rpe--;
        }
        
        return ans;
    }
    /** 
    public ArrayList<Integer> row_return(int[][] matrix, int r) {
        ArrayList<Integer> row = new ArrayList<Integer>(5);
        
        for (int i = 0; i < matrix[r].length; i++) {
            row.add(matrix[r][i]);
        }

        return row;
    }

    public ArrayList<Integer> col_return(int[][] matrix, int c, int s, int e) {
        ArrayList<Integer> col = new ArrayList<Integer>(5);
        
       for(int i = s + 1; i < e; i++) {
           col.add(matrix[i][c]);
       }

        return col;
    }
    **/
    public static void main(String[] args) {

        int[][] matrix = {
                          {1, 2, 3,4,5},
                          {6,7,8,9,10},
                          {11,12,13,14,15},
                          {16,17,18,19,20}
                        };
        System.out.println(spiralOrder(matrix));

    }
}