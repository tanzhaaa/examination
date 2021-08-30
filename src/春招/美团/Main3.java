package 春招.美团;

import java.util.HashMap;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] nums = new int[n];
        int [] query = new int[m];

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            query[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(! map1.containsKey(nums[i])){
               map1.put(nums[i],i);
            }else{
                map2.put(nums[i], i);
            }
        }
        for (int i = 0; i < m; i++) {
            if(map1.containsKey(query[i])){
                System.out.print(map1.get(query[i])+1);
                System.out.print(" ");
                if(map2.get(query[i]) == null){
                    System.out.println(map1.get(query[i])+1);
                }else{
                    System.out.println(map2.get(query[i])+1);
                }

            }else{
                System.out.println(0);
            }
        }
    }
}

/*
*
*
*
* 6 4
2 3 1 2 3 3
1
2
3
4
* */