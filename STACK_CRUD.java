import java.util.EmptyStackException;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class Stack {
    ListNode top;

    // Push
    void push(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int val = top.val;
        top = top.next;
        return val;
    }

    // Peek
    int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.val;
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == null;
    }
}

public class stack_CRUD {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popped element: " + stack.pop());
        
        System.out.println("Top element: " + stack.peek());
        
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
