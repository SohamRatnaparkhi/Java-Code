package Codechef;

import java.util.*;

public class CALPWR 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) 
        {
            String name = sc.next();
            char[] ch = name.toCharArray();
            Arrays.sort(ch);
            //String n = String.valueOf(ch);
            //System.out.println(n);
            int k = 1, sum = 0;
            for (char c : ch)
            {
                char x = Character.valueOf(c);
                int v  = c - 96;
                sum += (k * v);
                k++;
            }
            System.out.println(sum);

        }
    }
}
