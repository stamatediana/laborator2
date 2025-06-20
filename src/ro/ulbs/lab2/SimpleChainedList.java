package ro.ulbs.lab2;
//PROB2
import ro.ulbs.lab2.SimpleChainedNode;
import ro.ulbs.paradigme.lab2.api.Node;
//import ro.ulbs.paradigme.lab2.api.MyList;

public class SimpleChainedList implements  MyList {
    private SimpleChainedNode head = null;

    @Override
    public void addValue(int value) {
        SimpleChainedNode newNode = new SimpleChainedNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        SimpleChainedNode current = head;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }
        current.setNextNode(newNode);
    }

    @Override
    public void listNodes() {
        SimpleChainedNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }

    @Override
    public Node getNodeByValue(int value) {
        SimpleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public void removeNodeByValue(int value) {
        if (head == null) return;
        if (head.getValue() == value) {
            head = head.getNextNode();
            return;
        }

        SimpleChainedNode current = head;
        while (current.getNextNode() != null && current.getNextNode().getValue() != value) {
            current = current.getNextNode();
        }

        if (current.getNextNode() != null) {
            current.setNextNode(current.getNextNode().getNextNode());
        }
    }

    @Override
    public boolean isSorted() {
        SimpleChainedNode current = head;
        while (current != null && current.getNextNode() != null) {
            if (current.getValue() > current.getNextNode().getValue()) {
                return false;
            }
            current = current.getNextNode();
        }
        return true;
    }

    public int sumValues() {
        int sum = 0;
        SimpleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }
}
