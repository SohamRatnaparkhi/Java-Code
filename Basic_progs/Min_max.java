package Basic_progs;
import java.util.*;

public class Min_max 
{
    public static int max(int a, int b, int c)
    {
        if (a > b && a > c) return a;
        else if (c > b && c > a) return c;
        else if (b > a && b > c) return b;
        else return 0;

    }
    public static void main(String argv[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] =  new int[3];
        for (int i = 0; i < 3; i++)
        {
            arr[i] = sc.nextInt();
        }
        int r = max(arr[0], arr[1], arr[2]);
        System.out.println("Max = " + r);
        int g = min(arr[0], arr[1], arr[2]);
        System.out.println("Min = " + g);
        
    }  
    static int min(int a, int b, int c)
    {
        if (a < b && a < c) return a;
        else if (c < b && c < a) return c;
        else if (b < a && b < c) return b;
        else return 0;

    }
    
}