package leet02.add_two_numbers;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(3);
        ListNode list2 = new ListNode(4, list1);
        ListNode list3 = new ListNode(2, list2);

        List<Integer> listNum1 = new LinkedList<>();
        ListNode cur = list3;       // start node
        do {
            System.out.println(cur.val);
            listNum1.add(cur.val);
            cur = cur.next;
        } while ( cur != null);

        // List 를 역순으로 정렬
        Collections.reverse(listNum1);
        //int num1 = Integer.parseInt(listNum1);
        int num1 = 0;
        for (int i=0; i < listNum1.size(); i++) {
            num1 *= 10;
            num1 += listNum1.get(i);
        }
        System.out.println(num1);
    }
}
