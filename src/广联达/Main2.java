package 广联达;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder mySb = new StringBuilder();
        char[][] myArr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            myArr[i] = s.toCharArray();
        }
        int myU = 0,myD = myArr.length-1;
        int myL = 0,myR = myArr[0].length - 1;
        while (true){
            for (int i = myL; i <= myR; i++) {
                if(String.valueOf(myArr[myU][i]).equals("0")){
                    break;
                }else {
                    mySb.append(myArr[myU][i]);
                }
            }
            if(++myU > myD) break;

            for (int i = myU; i <=myD ; i++) {
                if (String.valueOf(myArr[i][myR]).equals("0")){
                    break;
                }else {
                    mySb.append(myArr[i][myR]);
                }
            }
            if(myL> -- myR) break;

            for (int i = myR; i >=myL ; i--) {
                if (String.valueOf(myArr[myD][i]).equals("0")){
                    break;
                }else {
                    mySb.append(myArr[myD][i]);
                }
            }
            if (myU > --myD)    break;

            for (int i = myD; i >=myU ; i--) {
                if (String.valueOf(myArr[i][myL]).equals("0")){
                    break;
                }else {
                    mySb.append(myArr[i][myL]);
                }
            }
            if(++myL > myR) break;
        }
        System.out.println(mySb.toString());

    }
}
