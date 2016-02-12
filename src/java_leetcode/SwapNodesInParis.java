package java_leetcode;

import java_leetcode.MergekSortedLists.ListNode;

/**
* @author : gaoweibupt
* Date:2016年2月12日下午2:06:02
*/
public class SwapNodesInParis {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
    public ListNode swapPairs(ListNode head) {
    	ListNode result = head;
    	while(head != null && head.next != null){
    		int m = head.val;
    		head.val = head.next.val;
    		head.next.val = m;
    		head = head.next.next;
    	}
    	return result;
    }	
}
