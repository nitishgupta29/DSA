/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        List<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        ListNode n = new ListNode(arr.get(0));
        head =n;
        temp=head;
        for(int i=1;i<arr.size();i++){
            ListNode n1 = new ListNode(arr.get(i));
            temp.next=n1;
            temp=temp.next;
        }
        return head;
    }
}