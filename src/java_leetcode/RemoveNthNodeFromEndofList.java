package java_leetcode;
/**
* @author : gaoweibupt
* Date:2016年1月27日下午8:53:33
*/



public class RemoveNthNodeFromEndofList {
	class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode bptr = head;
    	ListNode fptr = head;
    	ListNode ptr = head;
    	for (int i = 0; i < n; i++){
    		bptr = bptr.next;
    	}
    	if (bptr == null) return ptr.next;
    	
    	while(bptr != null){
    		bptr = bptr.next;
    		ptr = fptr;
    		fptr = fptr.next;
    	}
    	ptr.next = fptr.next;
    	return head;
    }

}

