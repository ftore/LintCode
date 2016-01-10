package datastructures.linkedlist;

public class DeleteNodeInMiddleOfSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode curr = new ListNode(1);
		ListNode node = curr;
		
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(3);
		curr = curr.next;
		curr.next = new ListNode(4);
		curr = curr.next;
		
		deleteNode(node);
		
		System.out.println(node);
	}
	
	/**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
	public static void deleteNode(ListNode node) {
		// write your code here
		node.val = node.next.val;
		node.next = node.next.next;
	}

}

