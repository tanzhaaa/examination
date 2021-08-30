package 春招.华为;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ranges = new int[n];
        for(int i = 0; i < n; i++){
            ranges[i] = sc.nextInt();
        }
        System.out.println(myHowManyJumps(ranges));
    }

    public static int myHowManyJumps(int[] nums){
        int myCurPos = nums.length - 1;
        int myStep = 0;
        while(myCurPos > 0){
            for (int i = 0; i < myCurPos; i++) {
                if(i + nums[i] >= myCurPos){
                    myStep ++;
                    myCurPos = i;
                    break;
                }
            }
        }
        return myStep;
    }
}
