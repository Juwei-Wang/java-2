package assignments.q06;

public class LinkedList {
    private LinkedListNode headNode;

    public void buildDemo() {
        LinkedListNode n1 = new LinkedListNode(6);
        LinkedListNode n2 = new LinkedListNode(7);
        LinkedListNode n3 = new LinkedListNode(3);
        LinkedListNode n4 = new LinkedListNode(8);
        LinkedListNode n5 = new LinkedListNode(4);

        headNode = n1;
        n1.setNextNode(n2);
        n2.setNextNode(n3);
        n3.setNextNode(n4);
        n4.setNextNode(n5);
    }

    public String description() {
        String str = "";
        str += "[";
        LinkedListNode current = headNode;
        while (current != null) {
            str += current.getValue();
            current = current.getNextNode();
            if (current != null) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
