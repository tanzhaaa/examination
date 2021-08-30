package 春招.阿里;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long temp;
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            temp = in.nextLong();
            sum+= temp;
            max = Math.max(max,temp);
        }
        long res = Math.max( 2*sum/n + 1, max);

        System.out.println(res);


    }
}

/*
5
1 1 1 5 1
* */