package 美团;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop_times = Integer.parseInt(sc.nextLine());//T
        int[] flavor = new int[loop_times];
        for (int i = 0; i < loop_times; i++) {
            int n = sc.nextInt();
            flavor[i] = n;
        }
        if (loop_times == 1){
            System.out.print(flavor[0]);
        }
        System.out.print(happy(flavor));
    }

    private static int happy(int[] nums){
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && nums[j] > max){
                    max = nums[j];
                }
            }
            sum += max;
        }
        return sum;
    }
}
