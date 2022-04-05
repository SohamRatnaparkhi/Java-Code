

public class BUtterfly 
{
    public static void main(String[] args)
    {
        int n = 4;
        int x = n * 2 - 2;
        int y = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int j = x; j > 0; j--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
            x -= 2;
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print("*");
            }
            
            for (int j = 0; j < y; j++)
            {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--)
            {
                System.out.print("*");
            }
            System.out.println("");
            y += 2;
        }
    }
}
