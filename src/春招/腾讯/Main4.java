package 春招.腾讯;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            boolean isSame = false;
            String s1 = sc.next();
            String s2 = sc.next();
            if(s1 == null || s2 == null || s1.equals("") || s2.equals("")){
                System.out.println("NO");
                continue;
            }
            if(s1.length() == s2.length()) isSame = sameString(s1,s2);
            if(isSame){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    static boolean sameString(String s1, String s2){
        boolean isSame = false;
        int length = s1.length();

        if (s1.equals(s2))  isSame = true;

        else if (length %2 == 0){
            int mid = length /2;
            String left_s1 = s1.substring(0,mid);
            String left_s2 = s2.substring(0,mid);
            String right_s1 = s1.substring(mid);
            String right_s2 = s2.substring(mid);
            if((sameString(left_s1,left_s2) && sameString(right_s1,right_s2))
                    || (sameString(left_s1,right_s2) && sameString(left_s2, right_s1)))
                isSame = true;
        }

        return isSame;
    }
}
