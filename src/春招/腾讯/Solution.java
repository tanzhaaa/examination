package 春招.腾讯;


class ListNode {
   int val;
    ListNode next = null;
}


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param S ListNode类 val表示权值，next指向下一个元素
     * @return ListNode类
     */
    public ListNode solve (ListNode S) {
        ListNode cur = S;
        ListNode next = null;
        ListNode head = S;
        while (cur.next != null){
            next = cur.next;
            if(next.val < cur.val)  head = next;
            cur = next;
        }
        ListNode lastHead = null;
        while (S != head){
            S.next = lastHead;
            next.next = S;
            next = S;
            S = lastHead;
        }
        return S;
    }
}
