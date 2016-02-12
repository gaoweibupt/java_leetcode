package java_leetcode;

import java.util.Stack;

import java_leetcode.SwapNodesInParis.ListNode;

/**
* @author : gaoweibupt
* Date:2016年2月12日下午2:25:31
*/
public class ReverseNodesInKGroup {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	 public ListNode reverseKGroup(ListNode head, int k) {
	        if (k <= 1 || head == null)return head;
	        ListNode result = head;
	        while(head != null &&head.next != null){
	        	ListNode temp = head;
	        	Stack<Integer> s = new Stack<>();
	        	int i = 0;
	        	for (i = 0; i < k; i++){
	        		s.push(head.val);
	        		head = head.next;
	        		if (head == null)break;
	        	}
	        	if (head == null && i != k - 1)break;
	        	head = temp;
	        	for (i =0; i < k; i++){
	        		head.val = s.pop();
	        		head = head.next;
	        	}
	        }
	        return result;
	 }
}
