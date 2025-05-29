package ro.ulbs.lab2;
//PORB2

import ro.ulbs.paradigme.lab2.api.Node;

public class DoubleChainedNode implements Node {
    private int value;
    private DoubleChainedNode next, prev;

    public DoubleChainedNode(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int val) {
        this.value = val;
    }

    public void setNextNode(DoubleChainedNode n) {
        this.next = n;
    }

    public DoubleChainedNode getNextNode() {
        return next;
    }

    public void setPrevNode(DoubleChainedNode p) {
        this.prev = p;
    }

    public DoubleChainedNode getPrevNode() {
        return prev;
    }
}
