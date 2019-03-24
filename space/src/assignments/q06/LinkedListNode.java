package assignments.q06;

public class LinkedListNode {
    private int value;
    private LinkedListNode nextNode;

    public LinkedListNode() {
    }

    public LinkedListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }
}
