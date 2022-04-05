package Leetcode.KKDSA;
import java.util.*;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] images = { 
                            {1,1,0,0},
                            {1,0,0,1},
                            {0,1,1,1},
                            {1,0,1,0}
                         };
        int[][] ans = flipAndInvertImage(images);
        for (int row = 0; row < images.length; row++) {
            System.out.println(Arrays.toString(ans[row]));
        }

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] flip = FlipImage(image);
        int[][] inverted = InvertImage(flip);

        return inverted;
    }
    public static int[][] InvertImage(int[][] flip) {
        int[][] inverted = new int[flip.length][flip.length];
        for (int i = 0; i < inverted.length; i++) {
            for (int j = 0; j < inverted.length; j++){
                if (flip[i][j] == 1) inverted[i][j] = 0;
                else inverted[i][j] = 1;
            }
        }
        return inverted;
    }
    public static int[][] FlipImage(int[][] image) {
        int ub = image.length - 1;
        int lb = 0;
        while (ub > lb) {
            swap(image, ub, lb);
            --ub;
            lb++;
        }
        return image;
    }
    public static void swap(int[][] image, int ub, int lb) {
        int col1[] = column_generator(image, lb);
        int col2[] = column_generator(image, ub);
        for(int i =0 ; i < col1.length; i++) {
            int t = col1[i];
            col1[i] = col2[i];
            col2[i] = t;
        }
        update_image(image, col1, col2, ub, lb);
    }
    public static void update_image(int[][] image, int[] col1, int[] col2, int ub, int lb) {
            for(int i = 0; i < image.length; i++) {
                image[i][ub] = col2[i];
                image[i][lb] = col1[i];
            }
    }
    public static int[] column_generator(int[][] image, int lb) {
        int col[] = new int[image.length];
        for(int i = 0; i < image.length; i++) {
            col[i] = image[i][lb];
        }
        return col;
    }
}
