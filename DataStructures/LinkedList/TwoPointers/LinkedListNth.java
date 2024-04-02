
class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }

    public void removeKth(int k) {
        Node tmp = head;
        if (k == 1 && head != null) {
            head = tmp.next;
        } else {
            int i = 2;
            while (i < k - 1) {
                i++;
                if (tmp == null) {
                    System.out.println("Incorrect kth position for the given linkedlist");
                    return;
                }
                tmp = tmp.next;
            }
            // 1,2
            if (tmp.next != null)
                tmp.next = tmp.next.next;
        }

    }

    public void printLinkedList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ->");
            tmp = tmp.next;
        }
        System.out.println("Null");
    }
}

public class LinkedListNth {

    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        lst.insert(4);
        lst.insert(6);
        lst.insert(17);
        lst.insert(2);
        lst.insert(9);
        lst.insert(25);
        lst.printLinkedList();
        lst.removeKth(8);
        lst.printLinkedList();
        lst.removeKth(4);
        lst.printLinkedList();
    }
}