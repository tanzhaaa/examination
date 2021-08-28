package 携程;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        String _n;
        try {
            _n = in.nextLine();
        } catch (Exception e) {
            _n = null;
        }

        res = buildingHouse(_n);
        System.out.println(res);
    }


    static String buildingHouse(String n) {
        String res = "";
        if (n.length() == 0 || n.equals(" "))   return "N";
        int months = 0;
        if (n.charAt(0) == '-') return "O";

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (! Character.isDigit(c)){
                return "N";
            }else{
                months *= 10;
                int num = Integer.parseInt(String.valueOf(c));
                months += num;
            }
        }
        if(months > 12 || months < 1){
            return "O";
        }

        int [] cur = new int[1];
        res = bHouse(res, months,cur);
        return res;
    }

    static String bHouse(String n, int months, int[] lastNewHouse){
        StringBuilder res = new StringBuilder(n);
        if(months == 0) return n;

        int [] newHouse = new int[n.length() * 3];


        if (n.length() == 0) {
            int[] test = new int[1];
            return bHouse("R", months - 1, test);
        }

        for (int i = lastNewHouse.length - 1; i >= 0; i--) {
            int pos = lastNewHouse[i];
            res.insert(pos,'G');
            res.insert(pos + 2,'R');
            int newPos = lastNewHouse[i] + i*2;
            newHouse[newPos] = 1;
            newHouse[newPos + 2] = 1;
        }
        int [] tmp = new int[lastNewHouse.length * 2];
        int cnt = 0;
        for (int i = 0; i < newHouse.length; i++) {
            if (newHouse[i] != 0){
                tmp[cnt] = i;
                cnt++;
            }
        }

        return bHouse(res.toString(), months - 1, tmp);
    }
}
