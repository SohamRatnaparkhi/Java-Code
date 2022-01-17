package Basic_progs;

import java.util.*;

public class ArrayListPractise 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        int n = (sc.nextInt());
        for (int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
