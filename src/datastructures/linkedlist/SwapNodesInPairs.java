package datastructures.linkedlist;

public class SwapNodesInPairs {
	/**
     * @param head a ListNode
     * @return a ListNode
     */
	public static ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null)
			return head;
		
		ListNode trackedHead = new ListNode(0);
		trackedHead.next = head;
		ListNode curr = trackedHead;
		
		// use two tmp variables to track previous and next nodes of each pair
		while(curr.next != null && curr.next.next != null) {
			// use tmp1 to track first node
			ListNode tmp1 = curr;
			curr = curr.next;
			tmp1.next = curr.next;
			
			// use tmp2 to track next node of the pair
			ListNode tmp2 = curr.next.next;
			curr.next.next = curr;
			curr.next = tmp2;
		}
		
		return trackedHead.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode trackedHead = head;
		
		head.next = new ListNode(2);
		head = head.next;
		head.next = new ListNode(3);
		head = head.next;
		head.next = new ListNode(4);
		head = head.next;
		
		trackedHead = swapPairs(trackedHead);
		
		while(trackedHead != null) {
			System.out.println(trackedHead.val);
			trackedHead = trackedHead.next;
		}
		
	}
}
