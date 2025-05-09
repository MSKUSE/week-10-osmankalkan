public class StackLinkList implements Stack {

    StackItem top;
    @Override
    public void push(Object item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }

    @Override
    public Object pop() {
        Object tempdata = top.getData();
        top = top.getNext();
        return tempdata ;

    }

    @Override
    public void peek() {
        System.out.println("Top is " + this.top.getData());
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }
}
