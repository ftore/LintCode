package datastructures.linkedlist;

public class RemoveDuplicatesFromSortedList {
	
	/**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null && head.next == null) {
			return head;
		}
		
		ListNode prev = head;
		
		while(prev != null && prev.next != null) {
			if(prev.val == prev.next.val) {
				prev.next = prev.next.next;
			} else {
				prev = prev.next;
			}
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
