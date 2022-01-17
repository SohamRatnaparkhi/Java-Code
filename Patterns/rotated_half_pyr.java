package Patterns;
import java.util.*;

public class rotated_half_pyr 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n - 1;
        for (int i = 1; i <= n; i++)
        {
            for (int sp = 0; sp <= x; sp++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
        System.out.println();
        x--;
        }
    }    
}
