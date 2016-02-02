package datastructures.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedListII {
	
	/**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head == null) return null;
        ArrayList<Integer> duplicatesList = getDuplicates(head);
        for(int i : duplicatesList) {
            head = delete(head, i);
        }
        
        return head;
    }
    
    public static ArrayList<Integer> getDuplicates(ListNode head) {
        Map<Integer, Integer> numList = new HashMap<>();
        
        ListNode curr = head;
        
        while(curr != null) {
            if(numList.containsKey(curr.val)) {
                numList.put(curr.val, numList.get(curr.val) + 1);
            } else {
                numList.put(curr.val, 1);
            }
            curr = curr.next;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : numList.entrySet()) {
            if(entry.getValue() > 1) {
                result.add(entry.getValue());
            }
        }
        return result;
    }
    
    public static ListNode delete(ListNode head, int key) {
        ListNode curr = head;
        ListNode newHead = null;
        ListNode currNewHead = null;
        
        while(curr != null) {
            if(curr.val != key) {
                if(newHead == null) {
                    newHead = new ListNode(curr.val);
                    currNewHead = newHead;
                } else {
                    currNewHead.next = new ListNode(curr.val);
                    currNewHead = currNewHead.next;
                }
            }
        }
        
        return newHead;
    }
    
	public ListNode removeduplicate(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode previous = head;
		ListNode current = head.next;
		ListNode tmp;

		while (current != null) {
			tmp = current.next;
			if (previous.val == current.val) {
				if (previous == head) {
					head = tmp;
				}
				previous = tmp;
				current = tmp.next;
			} else {
				previous = current;
				current = tmp;
			}
		}

		return head;
	}

	public static void main(String[] args) {
		
	}

}
