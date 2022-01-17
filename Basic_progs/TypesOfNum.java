package Basic_progs;
import java.util.*;
public class TypesOfNum 
{
    static boolean is_prime(int n)
    {
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            return false;
        }
        return true;
    }
    static int[] generate_prime(int n)
    {   
        int arr[] = new int [n];
        int x = 0;
        for (int i = 0; i < n; i++)
        {
            if (is_prime(i))
            {
                arr[x] = i;
                x++;
            }

        }
        return arr;
    }
    static int factorial(int n)
    {   
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f *= i;
        }
        return f;
    }
    static int reverse_num(int n)
    {
        int rev = 0;
        while (n != 0)
        {
            int d = n % 10;
            n /= 10;
            rev = rev * 10 + d;
        }
        return rev;
    }
    static boolean is_pallindrome(int n)
    {
        if (n == reverse_num(n))
            return true;
        else
            return false;
    }
    public static void main(String[]args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter \"close\" to terminate program.");
        String e = "";
        do
        {
            System.out.print("Enter P to check for pallindrome.\nEnter f to find factorial\nEnter Pr to check for prime\nEnter Prg to generate prime.\nEnter R to reverse a number\nEnter \"close\" to terminate program.\nChoice :- ");
            String in = sc.next();

            switch(in)
            {
                case "P":
                    int n = sc.nextInt();
                    if (is_pallindrome(n)) 
                    {
                        System.out.printf("%d is Pallindrome\n", n);
                    }
                    else
                    {
                        System.out.printf("%d is not Pallindrome\n", n);
                    }
                    break;
                case "Pr":
                    int m = sc.nextInt();
                    if (is_prime(m)) 
                    {
                        System.out.printf("%d is Prime\n", m);
                    }
                    else
                    {
                        System.out.printf("%d is not Prime\n", m);
                    }
                    break;
                case "Prg":
                    int x = sc.nextInt();
                    int arr[] = generate_prime(x);
                    for (int i =0; i < x; i++) 
                    {   if(arr[i] != 0)
                            System.out.printf("%d\n", arr[i]);
                    }
                    System.out.println("_______");
                    break;
                case "R" :
                    int r = sc.nextInt();
                    System.out.printf("%d\n", reverse_num(r));
                    break;
                case "f" :
                    int f = sc.nextInt();
                    System.out.printf("%d\n", factorial(f));
                    break;
                case "close":
                    exit(0);
                    break;
                default :
                    System.out.println("Enter correct key(case sensitive)");
                }
                        
        }
        while (e != "close");

    }
    public static void exit(int i) {
        exit(i);
    }
}
