package org.example;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/merge-two-sorted-lists/description/*/
public class MergeTwoSortedLists {
    public static void main(String[] args) {
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode nodeWeWillBeWorkingWith = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                nodeWeWillBeWorkingWith.next = list1;
                list1 = list1.next;
            } else {
                nodeWeWillBeWorkingWith.next = list2;
                list2 = list2.next;
            }
            nodeWeWillBeWorkingWith = nodeWeWillBeWorkingWith.next;
        }
        /*At some point one of the two lists will have 0 elements left to check, but the other
         * will have more than 0.
         * The code below addresses this situation.*/
        if (list1 != null) {
            nodeWeWillBeWorkingWith.next = list1;
        }
        else if(list2 != null){
            nodeWeWillBeWorkingWith.next = list2;
        }
        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}