package Patterns;
import java.util.*;

public class inverted_half_pyr 
{
    public static void main(String argv[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++)
        {
            for (int j = x; j > i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
