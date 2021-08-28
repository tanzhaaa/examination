package 网易互娱;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] id = new int[n];
        String[] name = new String[n];
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            id[i] = sc.nextInt();
            name[i] = sc.next();
            if(map.containsKey(name[i])){
                if (! map.get(name[i]).equals(id[i])){
                    count ++;
                }
            }else {
                map.put(name[i], id[i]);
            }
        }
        System.out.println(count);
    }
}
