package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com
 * Date: 2015年11月17日下午8:45:27
 */




public class AddTwoNumbers {
	class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode result = node;
        int flag = 0;
        while (l1 != null || l2 != null){
        		if (l1 == null){
        			node.next = new ListNode((l2.val + flag) % 10);
        			flag = (l2.val + flag) / 10;
        			l2 = l2.next;
        			node = node.next;
        		}else if (l2 == null){
        			node.next = new ListNode((l1.val + flag) % 10);
        			flag = (l1.val + flag) / 10;
        			l1 = l1.next;
        			node = node.next;
        		}else{
        			node.next = new ListNode((l1.val + l2.val + flag) % 10);
        			flag = (l1.val + l2.val + flag) / 10;
        			l1 = l1.next;
        			l2 = l2.next;
        			node = node.next;
        		}
          }
        if (flag != 0){
        	node.next = new ListNode(flag);
        }
        return result.next;
        
    }
}