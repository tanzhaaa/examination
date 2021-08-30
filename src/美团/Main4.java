package 美团;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String no = sc.nextLine();
        int days = Integer.parseInt(sc.nextLine());
        int [] x = new int[days];
        int [] y = new int[days];
        int [] r = new int[days];

        for (int i = 0; i < days; i++) {
            x[i] = sc.nextInt(); // x
            y[i] = sc.nextInt(); //y
            r[i] = sc.nextInt();
            if (i == days-1){
                continue;
            }
            no = sc.nextLine();
        }
        int [][] seed = new int[n][m];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (inCircle(j,k,x[i],y[i],r[i])){
                        seed[j][k] = 0;
                    }else {
                        seed[j][k] ++;
                        if (i == days-1){
                            sum+=seed[j][k];
                        }
                    }
                }
            }
        }
        System.out.println(sum+1);
    }

    private static boolean inCircle(int a, int b, int x, int y, int r){
        if (a==x && b == y){
            return true;
        }
        int ax = a-x+1;
        int by = b-y+1;
        int in = ax*ax + by*by;
        if (in <= r*r){
            return true;
        }
        return false;
    }
}
