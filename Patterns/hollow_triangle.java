package Patterns;
import java.util.* ;

public class hollow_triangle 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows and then columns.");
        int rows = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 0; i < rows; i++) 
        {
            if(i == 0 || i == rows - 1) 
            {
                for (int j = 0; j < col; j++) 
                {
                    System.out.print("*");
                }
            } 
               

            else 
            {
                for (int j = 0; j < col; j++) 
                {
                    if(j == 0 || j == col - 1) 
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");    
                    }
                }
            }

            System.out.println();
        }

    }
}
