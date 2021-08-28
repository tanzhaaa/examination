//package 腾讯;
//
//import java.util.*;
//
//public class Main3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int testNum = sc.nextInt();
//        while (testNum-- > 0){
//            int games = sc.nextInt();
//            int res = 0;
//            int maxTime = 0;
//            int [] marks = new int[games]; //[0]是时间 [1]是积分
//            ArrayList<List<Integer>> timeToMark = new ArrayList<List<Integer>>();
//            for (int i = 0; i < games; i++) {
//                int cur_time = sc.nextInt();
//                maxTime = Math.max(cur_time, maxTime);
//                marks[i] = cur_time;
//            }
//            for (int i = 0; i < games; i++) {
//                int cur_mark = sc.nextInt();
//                ArrayList<Integer> tmp = new ArrayList<>();
//                tmp.add(marks[i]);
//                tmp.add(cur_mark);
//                timeToMark.add(tmp);
//            }
//            timeToMark.sort((o1, o2) -> o2.get(1) - o1.get(1));
//
//            int [] hasGame = new int[maxTime+1];
//            Hash<Integer> hasTime = new HashSet<>();
//
//
//            int timeSlot = 0;
//            for (int i = 0; i < timeToMark.size(); i++) {
//                int curTime = timeToMark.get(i).get(0);
//                if(hasTime.containsKey(curTime) ){
//                    boolean hasPos = false;
//                    for (int j = curTime; j > 0;j--) {
//                        if (hasGame[j] == 0){
//                            hasGame[j] = 1;
//                            timeSlot ++;
//                            hasPos = true;
//                            break;
//                        }
//                    }
//                    if(!hasPos) res += timeToMark.get(i).get(1);
//                }
//                else {
//                    hasTime.put(curTime)
//                    timeSlot++;
//                }
//
//                if(i > maxTime && timeSlot > maxTime){
//                    break;
//                }
//            }
//            System.out.println(res);
//        }
//    }
//}
//
//
///*
//
//2
//8
//3 1 1 3 3 5 7 7
//3 6 7 4 1 1 6 7
//3
//1 1 1
//3 4 6
//* */