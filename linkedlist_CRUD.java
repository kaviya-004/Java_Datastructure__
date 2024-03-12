class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class LinkedList {
    ListNode head;

    // Create
    void insert(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Read
    void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Update
    void update(int index, int newVal) {
        ListNode temp = head;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        if (temp != null) {
            temp.val = newVal;
        }
    }

    // Delete
    void delete(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode temp = head;
        int i = 0;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}

public class LL_CRUD {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);

        System.out.println("Original Linked List:");
        list.display();

        list.update(1, 4);
        
        System.out.println("Linked List after updating value at index 1 to 4:");
        list.display();

        list.delete(1);

        System.out.println("Linked List after deleting node at index 1:");
        list.display();
    }
}
