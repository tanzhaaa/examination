package 春招.三六零;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String _n;
        try {
            _n = in.nextLine();
        } catch (Exception e) {
            _n = null;
        }
        int res = 0;
        if(_n == null || _n.length() == 0 || _n.length() == 1){
            System.out.println(0);
        }else {
            System.out.println(leastTimes(_n));
        }
    }

    static int leastTimes(String s){
        int times = 0;

        int Atime = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'){
                Atime ++;
            }else if(s.charAt(i) == 'b' && Atime > 0){
                times += ((long) Math.pow(2, Atime) - 1) % 1000000007;
                times %= 1000000007;

            }
        }
        return times;
    }



}
