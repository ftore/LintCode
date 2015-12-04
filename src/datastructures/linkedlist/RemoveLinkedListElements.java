package datastructures.linkedlist;

public class RemoveLinkedListElements {
	/**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
	public static ListNode removeElements(ListNode head, int val) {
		// Write your code here
		
		// check and remove val from ther head if there is any
		while (head != null && head.val == val) {
			head = head.next;
		}

		if (head == null)
			return null;
		
		// current worker list
		ListNode newNode = new ListNode(head.val);
				
		// new head node to be returned
		ListNode newHead = newNode;
		
		// we already added current head val into newNode
		head = head.next;

		while (head != null) {
			if (head.val != val) {
				newNode.next = new ListNode(head.val);
				newNode = newNode.next;
			}
			head = head.next;
		}

		return newHead;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode tracedHead = head;
		
		head.next = new ListNode(2);
		head = head.next;
		head.next = new ListNode(6);
		head = head.next;
		head.next = new ListNode(3);
		head = head.next;
		head.next = new ListNode(4);
		head = head.next;
		head.next = new ListNode(5);
		head = head.next;
		head.next = new ListNode(6);
		head = head.next;
		
		tracedHead = removeElements(tracedHead, 6);
		
		while(tracedHead != null) {
			System.out.println(tracedHead.val);
			tracedHead = tracedHead.next;
		}
	}
}
