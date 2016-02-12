package java_leetcode;
/**
* @author : gaoweibupt
* Date:2016年2月10日下午10:51:13
*/
public class MergekSortedLists {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
		return mergeKLists(lists, 0, lists.length);
	}
	public ListNode mergeKLists(ListNode[] lists, int first, int last) {
		if (last == first)return null;
		else if (last - first == 1)return lists[first];
		else if (last - first == 2)return mergeTwoLists(lists[first], lists[last - 1]);
		return mergeTwoLists(mergeKLists(lists, first, (first + last) / 2), mergeKLists(lists, (first + last) / 2, last));  
    }
	
	
	
	/**
	 * 合并两个已经排序的数组
	 * */
	public ListNode mergeTwoLists(ListNode list1, ListNode list2){
		ListNode result = new ListNode(0);
		ListNode head = result;
		if (list1 == null)return list2;
		if (list2 == null)return list1;
		while (list1 != null && list2 != null){
			if (list1.val < list2.val){
				head.next = list1;
				list1= list1.next;
			}
			else{
				head.next = list2;
				list2 = list2.next;
			}
			head = head.next;
		}
		if (list1 != null)head.next = list1;
		if (list2 != null)head.next = list2;
		return result.next;
	}
}
