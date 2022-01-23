import java.util.*;
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {10,15,1,3,6,8};
        System.out.println(Arrays.toString(Insert_sort(arr)));

    }
    public static int[] Insert_sort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if (arr[j] > arr[j - 1]) {
                    break;
                }
                else if (arr[j] < arr[j - 1]){
                    //swap(arr[j], arr[j - 1]);
                    int t = arr[j]; 
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                }

            }
        }

        return arr;
    }
    
}
