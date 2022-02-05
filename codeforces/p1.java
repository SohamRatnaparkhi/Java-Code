import java.util.*;
public class p1 {
    public static void main(String[] args){
        int matrix[][] = new int[5][5];
        Scanner sc = new Scanner(System.in); // input 
        int x = 0, y = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    x = i;
                    y = j;
                }
            }
        }
        int ans = absolute(2, x) + absolute(2, y);
        System.out.println(ans);
    }
    public static int absolute(int x, int y){
        int d = x - y;
        if (d < 0){
            return -d;
        }
        return d;
    }
}
/* 
  0 1 2 3 4 5 6 7 8
0 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
2 0 0 0 0 0 0 0 0 0
3 0 0 0 0 0 0 0 0 0            x = 6   y = 6         target --- 4 , 4
4 0 0 0 0 @ 0 0 0 0
5 0 0 0 0 0 0 0 0 0
6 0 0 0 0 0 0 1 0 0
7 0 0 0 0 0 0 0 0 0
8 0 0 0 0 0 0 0 0 0


6 - 5  cnt = 1
5 - 4  cnt = 2

6 - 5  cnt = 3
5 - 4  cnt = 4

*/