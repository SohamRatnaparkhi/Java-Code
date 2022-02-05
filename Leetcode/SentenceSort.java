public class SentenceSort {
    public static void main(String[] args){
        String s = "is2 sentence4 This1 a3";
        String ans = sortSentence(s);
        System.out.println(ans);
    }
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String ans = "";
        int t = 0;
        for(int i = 0; i < words.length; i++){
            int a = words[i].charAt(words[i].length() - 1) - 49;
            if (a == t){
                ans += words[i].substring(0, words[i].length() - 1) + " ";
                t++;
                i = -1;
            }
        }
        return ans;
    }
}
