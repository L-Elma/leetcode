public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public int getNodeNum(ListNode head){
        int numA=0;
        ListNode headTmp = head;
        while(headTmp!=null){
            headTmp=headTmp.next;
            numA++;
        }
        return numA;
    }
    public ListNode getIntersectionNode2(ListNode headA,int numA, ListNode headB,int numB){
        //numA>numB
        ListNode tmpA=headA;
        ListNode tmpB=headB;
        for(int i=numA-numB;i>0;i--){
            tmpA=tmpA.next;
        }
        for(int i=0;i<numB;i++){
            if(tmpA==tmpB){
                return tmpA;
            }
            tmpA=tmpA.next;
            tmpB=tmpB.next;
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int numA=this.getNodeNum(headA);
        int numB=this.getNodeNum(headB);
        return numA>numB?this.getIntersectionNode2(headA, numA, headB, numB):this.getIntersectionNode2(headB, numB, headA, numA);
    }
}