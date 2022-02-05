package KKDSA;

public class ShuffleString {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,2,1,3};
       String s =  restoreString("codeleet", arr);
        System.out.println(s);
    }
    public static String restoreString(String s, int[] indices) {
        String ans = "";
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            
            for (int j = 0; j < indices.length; j++) {
                if(indices[j] == x) {
                    char c =   s.charAt(j);
                    ans += c;
                    x++;
                    break;
                }
            }
        }
        return ans;
    }
}
