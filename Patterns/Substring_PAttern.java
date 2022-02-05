import java.util.*;
public class Substring_PAttern {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String s = "ABCDEFG";
        int l = s.length();
        int e = l;
        int a = 1;
        for(int i = 0; i < l; i++) {
            if (i == 0) {
                System.out.print(generate_sub_straight(s, 0 , e--));
                System.out.println(generate_sub_reverse(s, e - 1, 0));
            }
            else{
                String first = generate_sub_straight(s, 0 , e--);
                System.out.print(first); // cout << first
                if (i != 0) {
                    for(int sp = 0; sp < a; sp ++) {
                        System.out.print(" "); // cout << " "
                    }
                    a += 2;
                }
                String end = generate_sub_reverse(s, e, 0);
                System.out.println(end); // cout << end << endl
                
            }
        }
    }
    public static String generate_sub_straight(String s, int start, int end){
        String ans = "";
        for (int i = start; i < end; i++){
            ans += s.charAt(i); // in c++ -------->  ans += s[i]
        }
        return ans;
    }
    public static String generate_sub_reverse(String s, int start, int end){
        String ans = "";
        for (int i = start; i > end - 1; i--){
            ans += s.charAt(i); // in c++ -------->  ans += s[i]
        }
        return ans;
    }
}
