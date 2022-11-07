package linkedlist;

public class MergeSortedLists {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(3);
		ListNode ln3 = new ListNode(5);
		ListNode ln4 = new ListNode(7);
		ListNode ln5 = new ListNode(2);
		ListNode ln6 = new ListNode(4);
		ListNode ln7 = new ListNode(6);
		ListNode ln8 = new ListNode(8);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln5.next = ln6;
		ln6.next = ln7;
		ln7.next = ln8;
		System.out.println(mergeTwoLists(ln1, ln5));
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode h1 = list1;
		ListNode h2 = list2;
		while(h1 != null && h2 != null) {
			
		}
		
		return list2;
    }

}
