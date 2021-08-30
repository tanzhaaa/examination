package 春招.三六零;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String _n;
        try {
            _n = in.nextLine();
        } catch (Exception e) {
            _n = null;
        }

        if(_n == null || isHuiwen(_n)){

            System.out.println("0");
        }else {
            System.out.println("300");
        }
    }


    static boolean isHuiwen(String s){
        boolean isHuiwen = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(s.length() -1- i)){
                isHuiwen = true;
            }else {
                return false;
            }
        }
        return isHuiwen;
    }
}
