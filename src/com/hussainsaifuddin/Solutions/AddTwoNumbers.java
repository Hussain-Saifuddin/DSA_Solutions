package com.hussainsaifuddin.Solutions;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode head = null;
    public ListNode tail = null;

    public void addNode(int val){
        ListNode node = new ListNode(val);

        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }
}


public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        l1.addNode(9);
        ListNode l2 = new ListNode();
        l2.addNode(9);
        l2.addNode(9);
        l2.addNode(9);
        l2.addNode(9);
        ListNode sum = Solution(l1,l2);
        while(sum!=null){
            System.out.println(sum.val);
            sum = sum.next;
        }
    }

    public static ListNode Solution(ListNode l1, ListNode l2){
        ListNode current1 = l1.head;
        ListNode current2 = l2.head;
        ListNode sum = new ListNode();
        int carry = 0;
        int remainder = 0;
        int total=0;
        while(current1!=null || current2!=null){
            if(current1!=null){
                current1.val = current1.val + carry;
            }else if(current2!=null){
                current2.val = current2.val + carry;
            }
            if(current1!=null && current2!=null){
                total = current1.val + current2.val;
            }else if(current1!=null){
                total = current1.val;
            }else{
                total = current2.val;
            }
            if(total/10 !=0){
                carry = total/10;
                remainder = total%10;
                sum.addNode(remainder);
            } else{
                sum.addNode(total);
            }
            if(current1!=null) current1 = current1.next;
            if(current2!=null) current2 = current2.next;
            if(current1==null && current2==null && carry!=0){
                sum.addNode(carry);
            }
        }
        return sum.head;
    }

}
