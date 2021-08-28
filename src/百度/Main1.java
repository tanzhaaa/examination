package 百度;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String num = in.nextLine();
//        int n = Integer.parseInt(num);
        int n = Integer.parseInt(in.nextLine());
        String zifuchuan = in.nextLine();
        int [] dy_pr = new int[n];
        Arrays.fill(dy_pr, 100104);
        TreeSet<Tree_Node>[] tree_set = new TreeSet[10];
        dy_pr[0] = 0;
        for (int i = 0; i < 10; i++) {
            tree_set[i] = new TreeSet<>(new Comparator<Tree_Node>() {
                @Override
                public int compare(Tree_Node o1, Tree_Node o2) {
                    return o1.value - o2.value;
                }
            });
        }
        Tree_Node new_tree_node = new Tree_Node(0,0);
        tree_set[zifuchuan.charAt(0) - '0'].add(new_tree_node);
        for (int i = 1; i < n; i++) {
            int num_of_first = zifuchuan.charAt(i) - '0';
            if(tree_set[num_of_first].size() != 0){
                Tree_Node tree_i =tree_set[num_of_first].first();
                int index_of_i = tree_i.index;
                dy_pr[i] = Math.min(dy_pr[index_of_i] + 1,dy_pr[i]);
            }
            dy_pr[i] = Math.min(dy_pr[i - 1] +1, dy_pr[i]);
            tree_set[num_of_first].add(new Tree_Node(i, dy_pr[i]));
        }

        System.out.println(dy_pr[n-1]);




    }
}

class Tree_Node {
    int value;
    int index;

    public Tree_Node(int index, int value){
        this.value = value;
        this.index = index;
    }
}


