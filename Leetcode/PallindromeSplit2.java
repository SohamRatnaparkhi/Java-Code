import java.util.ArrayList;

public class PallindromeSplit2 {
    public static void main(String[] args){
        String a = "abda";
        String b = "acmc";
        System.out.println(checkPalindromeFormation(a, b));
    }
    public static boolean checkPalindromeFormation(String a, String b) {
        if(a.length() == 1){
            return true;
        }

        int s = 0;
        int e = a.length() - 1; 
        String f = "", g = "", h = "", j = "";
        boolean check = false;
        while(s <= e){
            char c1 = a.charAt(s++);
            f += c1;
            char c2 = b.charAt(e--);
            g += c2;
            if(c1 != c2){
                check = true;
                break;
            }
            else{
                if(f.equals(g)){
                    return true;
                }
                else{
                    continue;
                }
            }
        }
        if (check){
            int s2 = 0;
            int e2 = b.length() - 1; 
            
            while(s2 <= e2){
                char c1 = b.charAt(s2++);
                h += c1;
                char c2 = a.charAt(e2--);
                j += c2;
                if(c1 != c2){
                    return false;
                }
                else{
                    if(h.equals(j)){
                        return true;
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        return false;
        
    }
}
