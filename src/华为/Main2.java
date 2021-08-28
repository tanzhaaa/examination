package 华为;

import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] speed = new int[n];
        LinkedList<Integer> res = new LinkedList<Integer>();
        for(int i = 0; i < n; i++){
            speed[i] = sc.nextInt();
        }
        double cycleTime = 0.0;
        boolean isAEB = false;
        double AEB_start_time = -1.0;
        double AEB_end_time = -1.0;
        double  last_end = -1.0;
        int last_speed = 0;
        for (int i = 0; i < n; i++) {
            double time = i * 0.5;
            if(cycleTime >= 30.0) cycleTime = 0.0;
            if (cycleTime == 0.0) {
                res.addLast(speed[i]);
            }
            //AEB流程
            if (!isAEB && last_speed - speed[i] >= 9){
                    isAEB = true;
                    AEB_start_time = time;
            }
            if(isAEB && last_speed - speed[i] < 9){
                isAEB = false;
                AEB_end_time = time;
            }
            if (AEB_end_time > 0.0 && AEB_end_time - AEB_start_time >= 2.0){

                int start_post = Math.max((int)(AEB_start_time*2) - 4, 0);
                start_post = Math.max((int)(last_end*2) - 4, start_post);
                int end_post = Math.min((int)(AEB_end_time*2) + 4, n);
                for (int j = start_post; j < end_post; j++) {
                    res.addLast(speed[j]);
                }
                last_end = AEB_end_time;
                AEB_start_time = -1.0;
                AEB_end_time = -1.0;
                cycleTime = 0.0;
            }

            if(last_end == time){
                cycleTime = 0.0;
            }
            last_speed = speed[i];
            cycleTime += 0.5;
        }
        Object [] ans = res.toArray();
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i!= ans.length - 1) System.out.print(",");
        }
    }
}
