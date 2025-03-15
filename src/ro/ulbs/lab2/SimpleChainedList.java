package ro.ulbs.lab2;

import ro.ulbs.lab2.MyList;
import ro.ulbs.lab2.Node;
import ro.ulbs.lab2.SimpleChainedNode;

public class SimpleChainedList implements MyList {
    private SimpleChainedNode head;

    @Override
    public void addValue(int value) {
        SimpleChainedNode newNode = new SimpleChainedNode();
        newNode.setValue(value);
        if (head == null) {
            head = newNode;
        } else {
            SimpleChainedNode current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
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
        if (head != null && head.getValue() == value) {
            head = head.getNextNode();
            return;
        }
        SimpleChainedNode current = head;
        while (current != null && current.getNextNode() != null) {
            if (current.getNextNode().getValue() == value) {
                current.setNextNode(current.getNextNode().getNextNode());
                return;
            }
            current = current.getNextNode();
        }
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
    public boolean isSorted() {
        if (head == null) return true;

        SimpleChainedNode current = head;
        while (current.getNextNode() != null) {
            if (current.getValue() > current.getNextNode().getValue()) {
                return false;
            }
            current = current.getNextNode();
        }
        return true;
    }

    @Override
    public int sumNodes() {
        int sum = 0;
        SimpleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }
}
