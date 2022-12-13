package kz.home.data.structure.leetcode;
/*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Example 2:
    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.

    Example 2:
    Input: l1 = [0], l2 = [0]
    Output: [0]

    Example 3:
    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]
*/

import java.util.ArrayDeque;
import java.util.Deque;

/*
    Definition for singly-linked list.
    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode = addTwoNumbers(new ListNode(9), new ListNode(4));
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> firstList = new ArrayDeque<>();
        Deque<Integer> secondList = new ArrayDeque<>();
        Deque<Integer> resList = new ArrayDeque<>();
        ListNode result = null;
        int remainder = 0;
        do {
            firstList.push(l1.val);
            l1 = l1.next;
        } while (l1 != null);
        do {
            secondList.push(l2.val);
            l2 = l2.next;
        } while (l2 != null);

        while (true) {
            int a = 0;
            int b = 0;
            int sum = 0;
            int rem = 0;
            if (firstList.peek() != null)
                a = firstList.pollLast();
            if (secondList.peek() != null)
                b = secondList.pollLast();
            sum = a + b + remainder;
            if (sum >= 10) {
                sum = sum % 10;
                rem = 1;
            }
            resList.push(sum);
            remainder = rem;

            if (firstList.peek() == null && secondList.peek() == null)
                break;
        }

        if (remainder > 0) result = new ListNode(remainder);

        while (true) {
            if (result == null)
                result = new ListNode(resList.pop());
            else {
                var temp = new ListNode(resList.pop());
                temp.next = result;
                result = temp;
            }

            if (resList.peek() == null)
                break;
        }

        return result;
    }
}

class ListNode {
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
