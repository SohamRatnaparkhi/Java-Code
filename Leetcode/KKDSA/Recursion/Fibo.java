package KKDSA.Recursion;

public class Fibo {
    // PRint nth term of fibo series
    public static void main(String[] args){
        fibo(0, 1, 0, 8);
    }
    public static void fibo(int a, int b, int i, int n){
        // This is not a tail recursion, it is noraml recursion
        if (i == n + 1){
            return;
        }
        int c = a + b;
        if (i == n)
        System.out.println("Nth term is - "+c);
        else
        System.out.println(c);
        a = b;
        b = c;
        //i++;
        fibo(a, b, ++i, n);

    }
}
