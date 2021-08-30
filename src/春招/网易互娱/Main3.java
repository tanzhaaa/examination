package 春招.网易互娱;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zushu = sc.nextInt();
        while(zushu-- > 0){
            int N_rec = sc.nextInt();
            HashSet<Integer> hadPresent = new HashSet<>();
            LinkedList<Integer> youxushuzu = new LinkedList<>();
            int [][] records = new int[100000][2];
            for (int i = 0; i < N_rec; i++) {
                int num = sc.nextInt();
                int marks = sc.nextInt();
                if (marks > records[num][1]){
                    Integer last_mark = records[num][1];
                    records[num][1] = marks;

                    youxushuzu.add(marks);
                    youxushuzu.remove(last_mark);

                    if (hadPresent.contains(num))   continue;

                    youxushuzu.sort(Comparator.comparingInt(o -> o));
                    int size = youxushuzu.size();
                    int mid;
                    if(! (youxushuzu.size() % 2 == 0)){
                        //单数
                        mid = youxushuzu.get(size/2) *2;
                    }else{//双数
                        int left = youxushuzu.get(size/2);
                        int right = youxushuzu.get(size/2 - 1);
                        mid = left + right;
                    }
                    if(mid == 2 * marks){
                        hadPresent.add(num);
                    }
                }
            }
            System.out.println(hadPresent.size());
        }
    }
}

