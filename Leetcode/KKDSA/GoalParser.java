package KKDSA;

public class GoalParser {
    public static void main(String[] args){
        System.out.print(interpret("(al)G(al)()()G"));
    }
    public static String interpret(String s) {
        String ans = "";
        for(int i = 0; i < s.length() - 3; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            char c3 = s.charAt(i + 2);
            char c4 = s.charAt(i + 3);
            if(c1 == 'G')  ans += c1;
            else if(c1 == 40 && c2 == 41){
                ans += "o";
                i += 2 - 1;
            }
            else if(c1 == 40 && c4 == 41 && c2 == 'a' && c3 == 'l') {
                ans += "al"; 
                i += 4 - 1;
            }
        }
        return ans;
    }
}
