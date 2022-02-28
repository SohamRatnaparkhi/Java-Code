package KKDSA.Recursion;

public class ReturnNthFibo {

    /*
    STEPS
    1. Identify the recursion breed of problem
    2. Identify the recursion relation of problem
    3. Draw the recursion tree
    4. Study the left and right recursion calls
    5. Study how functions are being called in stack
    6. Find the terminating condition.
    
    
    */
    public static void main(String[] args){
        System.out.println(fibo(8));
    }
    public static int fibo(int n){

        // This is tail recursion method
        if (n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
