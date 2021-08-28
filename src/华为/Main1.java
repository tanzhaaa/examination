package 华为;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(myReverse(a));
        }
    public static String myReverse(String s){
        StringBuilder myStr = new StringBuilder();
        if(s.length() <= 1) return s;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                int j =i;
                int numOfkuohao = 0;
                for(;j < s.length();j++){
                    if(s.charAt(j) == '(')  numOfkuohao++;
                    if (s.charAt(j) == ')') numOfkuohao--;
                    if(numOfkuohao == 0)    break;
                }
                StringBuilder temperate = new StringBuilder(myReverse(s.substring(i+1,j)));
                for (int k = temperate.length() - 1; k >= 0 ; k--) {
                    myStr.append(temperate.charAt(k));
                    i = j;
                }
            }
            else myStr.append(s.charAt(i));
        }
        return myStr.toString();
    }

}

