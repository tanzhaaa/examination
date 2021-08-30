package 美团;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n = s1.length();
        int m = s2.length();
        int counts1 = 0, counts2 = 0;
        char chs2 = s2.charAt(counts2);
        for (int i = 0; i <=n; i++) {
            if (i == n){
                if (counts2 == 0){
                    System.out.println(-1);
                    return;
                }
                i = 0;
                continue;
            }
            counts1++;
            char chs1 = s1.charAt(i);
            if (chs1 == chs2){
                counts2++;
                if (counts2 == m){
                    System.out.println(counts1 - counts2 + 1);
                    return;
                }
                chs2 = s2.charAt(counts2);
            }
        }
    }
}
