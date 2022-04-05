
import java.util.*;

public class rotateleft {
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5,6,7};
        rotate(ar,2,7);

    }
    static void rotate(int ar[], int d, int n){
        int arr[] = new int[n];
        n--;
        for(int i = 0; i < d; i++) {
            arr[n - i] = ar[i];
        }
        int x = 0;
        for (int i = d; i <= n; i++) {
            arr[x++] = ar[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
