public class PallindromeSplit {
    public static void main(String[] args){
        String a = "pvhmupgqeltozftlmfjjde";
        String b = "yjgpzbezspnnpszebzmhvp";
        System.out.println(checkPalindromeFormation(a, b));
    }
    public static boolean checkPalindromeFormation(String a, String b) {
        if(a.length() == 1){
            return true;
        }
        String ap = "", as = "", bp = "", bs = "";
        int x = (int) Math.ceil(a.length() / 2);
            if (a.length() % 2 == 0) {
            // Even 
            ap = a.substring(0, x);
            as = a.substring(x);
            bp = b.substring(0, x);
            bs = b.substring(x);
            }
            else {
                ap = a.substring(0, x);
                as = a.substring(x + 1);
                bp = b.substring(0, x);
                bs = b.substring(x + 1);
            }
            //aprefix + bsuffix 
            int start = 0;
            int end = bs.length() - 1;
            boolean check1 = true;
            while (start < end + bs.length()) {
                if (ap.charAt(start) != bs.charAt(end)) {
                    check1 = false;
                    break;
                }

                start ++;
                end --;

            }
            if (check1 ==  false) {
                //bprefix + asuffix
                int s = 0;
                int e = as.length() - 1;
                while (s < e + as.length()) {

                    if(bp.charAt(s) != as.charAt(e)){
                        return false;
                    }
                    s++;
                    e--;
                }
            }
            
        //}
    
        return true;
    }
}
