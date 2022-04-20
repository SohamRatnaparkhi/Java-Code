package Recursion;

public class sum_dig {
    public static void main(String[] args){
        System.out.println(dig(1234));
    }
    public static int dig(int n){
        if (n == 0){
            return 0;
        }
        int d = n % 10;
        return d + dig(n/10);
    }

}

