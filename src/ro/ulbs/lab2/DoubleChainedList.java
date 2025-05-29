package ro.ulbs.lab2;


import ro.ulbs.paradigme.lab2.api.Node;
//import ro.ulbs.paradigme.lab2.api.MyList;

public class DoubleChainedList implements MyList {
    private DoubleChainedNode head = null;

    @Override
    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        DoubleChainedNode current = head;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }
        current.setNextNode(newNode);
        newNode.setPrevNode(current);
    }

    @Override
    public void listNodes() {
        DoubleChainedNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }

    @Override
    public Node getNodeByValue(int value) {
        DoubleChainedNode current = head;
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
        DoubleChainedNode current = head;
        while (current != null && current.getValue() != value) {
            current = current.getNextNode();
        }
        if (current == null) return;

        if (current.getPrevNode() != null) {
            current.getPrevNode().setNextNode(current.getNextNode());
        } else {
            head = current.getNextNode();
        }

        if (current.getNextNode() != null) {
            current.getNextNode().setPrevNode(current.getPrevNode());
        }
    }

    @Override
    public boolean isSorted() {
        DoubleChainedNode current = head;
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
        DoubleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }
}
