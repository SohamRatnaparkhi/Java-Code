package Recursion;

public class check_sorted {
    public static void main(String[] args){
        int a[] = {1,2,3,4,24,6,7,8};
        int x = check(a, 0);
        if(x == -1) System.out.println(true);
        else System.out.println(false);
    }
    public static int check(int[] a, int i){
        if (a.length - 1 == i) return -1;
        else if (a[i] > a[i + 1]) return -2;
        else if (a[i] <= a[i + 1]) return check(a, ++i);
        return 0;
    }
}
