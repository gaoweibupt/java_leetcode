package java_leetcode;
/**
* @author : gaoweibupt
* Date:2016年2月2日下午8:13:58
*/
public class MergeTwoSortedLists {
	
	 //Definition for singly-linked list.
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)return l2;
        if (l2 == null)return l1;
        ListNode head;
        ListNode result;
        if (l1.val < l2.val){
        	head = l1;
        	l1 = l1.next;
        	result = head;
        }
        else{
        	head = l2;
        	l2 = l2.next;
        	result = head;
        }
        while(l1 != null && l2 != null){
        	if (l1.val < l2.val){
        		head.next = l1;
        		head = head.next;
        		l1 = l1.next;
        	}
        	else{
        		head.next = l2;
        		head = head.next;
        		l2 = l2.next;
        	}
        }
        if (l1 != null){
        	head.next = l1;
        }
        else{
        	head.next = l2;
        }
        return result;
    }
}
