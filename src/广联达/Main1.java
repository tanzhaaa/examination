package 广联达;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            boolean hasAns = false;
            int len = sc.nextInt();

            if(len %2 != 0){
                System.out.println("NO");
                continue;
            }
            HashMap<Integer,Integer> nums = new HashMap<>();
//            int[] nums = new int[len];
            for (int i = 0; i < len; i++) {
                int num = sc.nextInt();
                if(nums.containsKey(num))   nums.put(num,nums.get(num)+1);
                else nums.put(num,1);
            }
            int i = 0;
            int[] times = new int[nums.size()];
            for (Map.Entry<Integer,Integer> entry : nums.entrySet()){

                times[i++] = entry.getValue();
            }

            hasAns = hasAns(times, 0,0,0,0,0);

            if(hasAns) System.out.println("YES");
            if(!hasAns) System.out.println("NO");
        }
    }

    static boolean hasAns(int[] times,int i, int sum1, int sum2, int choose1,int choose2){
        if (i== times.length) return sum1 == sum2;

        boolean has1=false,has2=false;
        int max = times.length / 2;
        if (i<times.length){
            if (choose1 < max)
                has1 = hasAns(times,i+1,sum1+times[i],sum2,choose1+1,choose2);
            if (choose2 < max)
                has2 = hasAns(times,i+1, sum1,sum2+times[i],choose1,choose2+1);
        }
        return has1||has2;
    }
}
