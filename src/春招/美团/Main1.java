package 春招.美团;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfT = Integer.parseInt(sc.nextLine());//T
        int loop_times = 0;
        while(loop_times < numOfT){
            int n = Integer.parseInt(sc.nextLine());
            int[] TestNum = new int[n];
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                TestNum[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            if (!HuiWenshuOrNot(TestNum)) {
                changeTheArray(TestNum);
            }
            System.out.println(Arrays.toString(TestNum));
            loop_times++;
        }
    }

    public static void changeTheArray(int[] input){
        for (int i = 0; i < input.length; i++) {
            if(input[i] != 0) {
                input[i] = 0;
                break;
            }
        }
    }

    public static boolean HuiWenshuOrNot(int[] Array_of_arr){
        int startOfArray = 0;
        int endOfArray = Array_of_arr.length - 1;
        int countChange = 0;
        int leftNeedToChange = 0;
        int rightNeedToChange = 0;
        while(startOfArray < endOfArray){
            if(Array_of_arr[startOfArray]!= Array_of_arr[endOfArray]){
                countChange++;
                leftNeedToChange = startOfArray;
                rightNeedToChange = endOfArray;
                if(countChange > 1){
                    return false;
                }
            }
            startOfArray++;
            endOfArray--;
        }
        Array_of_arr[leftNeedToChange] = Math.min(Array_of_arr[leftNeedToChange], Array_of_arr[rightNeedToChange]);
        Array_of_arr[rightNeedToChange] = Math.min(Array_of_arr[rightNeedToChange], Array_of_arr[leftNeedToChange]);
        return true;
    }
}

/*
*
2
5
00011
5
11210

* */
