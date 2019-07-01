package niuke;

import java.util.ArrayList;

public class Three {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> values = new ArrayList<>();
        if(listNode == null){
            return values;
        }else{
            ListNode nextNode = listNode.next;
            listNode.next = null;

            while(nextNode != null){
                ListNode temp = nextNode.next;
                nextNode.next = listNode;
                listNode = nextNode;
                nextNode = temp;
            }
            while(listNode != null){
                values.add(listNode.val);
                listNode = listNode.next;
            }
            return values;
        }

    }

    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        for(int i = 1; i < 10; i++){
            ListNode temp = new ListNode(i);
            temp.next = head.next;
            head.next = temp;

        }
        ListNode p = head;
        while(p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
        ArrayList<Integer> list = printListFromTailToHead(head);
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
