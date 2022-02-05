import java.util.*;

public class p4 {
    public static void main(String[] args){
        int[] arr = {-199, 192};
        int n = 2;
        int k = 1;
        System.out.println(Arrays.toString(solver(arr, n, k)));
    }
    
    public static int[] solver(int a[], int n, int k){
        //int[] ans = new int[n];
        //int max = 0;
        for(int i = 0; i < k; i++){
            int d = max_return(a);
            for(int j = 0; j < n; j++){	
                a[j] = d - a[j];
            }
        }
        
        return a;
    }
    public static int max_return(int[]arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
        