public class p3 {
    public static void main(String[] args){
        int[] t = {1, 2, 3, 12, 12345, 15116544,387420489};
        for (int i : t) {
            System.out.println(solver(i));
        }
        
    }
    public static int solver(int n){
        //int cnt = 0;
        if(n==1){
            return 0;
        } 
        else if (n*2%6!=0){
            return -1;
        } 
        else {
    
            int cnt=0;
            while(true) {
                if (n%6 == 0){
                    n=n/6;
                    cnt++;
                } 
                else if (n*2%6!=0){
                    return -1;
                }
                else {
                    n=n*2;
                    cnt++;
                }
            
                if (n==1){
                    return cnt;
                    //break;
                }
            }
        }
    }
}