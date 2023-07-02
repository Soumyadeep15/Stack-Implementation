public class Stack {
    private Node top;
    private int count = 0;
    private boolean isEmpty() {
        return count == 0;
    }

    public void push(Object data) {
       if(isEmpty()) {
        top = new Node(data, null);
        count++;
        return;
       }
       top = new Node(data, top);
       count++;
    }

    public Object pop() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        Object data = top.data;
        top = top.next;
        return data;
    }

    public Object peek() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        return top.data;
    }

    public int size() {
        return count;
    }

}
