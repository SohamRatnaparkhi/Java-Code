package Patterns;

public class Floyds_tri 
{
    public static void main(String[] args)
    {
        int n = 5;
        int x = 1;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" " + x++);
            }
            System.out.println();
        }
    }
}
