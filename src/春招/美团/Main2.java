package 春招.美团;

import java.util.Scanner;

public class Main2 {
    //找到计策修改使得没有连续FFF
    //得到修改次数，计算最小的和

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long c1 = sc.nextLong();
        long c2 = sc.nextLong();
        String w_l = sc.next();
        long cnt = 0;
        int i = 0;
        while(i < n-2){
            if(w_l.substring(i,i+3).equals("FFF")){
                cnt += Math.min(c1, c2);
                i += 3;
            }else{
                i++;
            }

        }
        System.out.println(cnt);
/*
*
10 7 3
FTFFFTFFFF
*
*
*
* */
    }
}
