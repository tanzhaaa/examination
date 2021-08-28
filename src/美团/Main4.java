package 美团;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i = 0;
        int [] nums = new int[n];
        while(i < n){
            nums[i] = sc.nextInt();
            i++;
        }
        int res =  maxSubArray(n, nums);

    }

    private static int maxSubArray(int n, int[] nums) {
        int[] End = new int[n];
        int[] All = new int[n];
        End[n -1] = nums[n -1];
        All[n -1] = nums[n -1];
        End[0] = All[0] = nums[0];
        for (int i = 0; i < n; i++) {
            End[i] = Integer.max(End[i-1]+ nums[i], nums[i]);
            All[i] = Integer.max(End[i], All[i-1]);
        }
        return All[n -1];
    }
}

/*
3 2
1 2 4
*
* */
