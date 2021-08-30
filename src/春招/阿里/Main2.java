package 春招.阿里;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int index = 0; index < T; index++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            int [] num = new int[n];
            int [][] road = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(j != k){
                        road[j][k] = Integer.MAX_VALUE;
                    }
                }
            }

            for(int j = 0; j < m; j++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int w= sc.nextInt();
                road[l][r] = w;
            }


            // todo: 注意i，j，k的位置
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <n; j++) {
                        int temp = (road[i][k] == Integer.MAX_VALUE || road[k][j] == Integer.MAX_VALUE) ? Integer.MAX_VALUE : road[i][k] + road[k][j];
                        if(road[i][j] > temp){
                            road[i][j] = temp;
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i != j && road[i][j] <= d){
                        num[i]++;
                    }
                }
            }
            int value = Integer.MAX_VALUE;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if(num[i] < value){
                    value = num[i];
                    ans = i;
                }else if(num[i] == value){
                    ans=i;
                }
            }

            System.out.println(ans);
        }
    }
}

