package ro.ulbs.lab2;
//PROB2
import ro.ulbs.paradigme.lab2.api.Node;

public class SimpleChainedNode implements Node {
    private int value;
    private SimpleChainedNode next;

    public SimpleChainedNode(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(SimpleChainedNode n) {
        this.next = n;
    }

    public SimpleChainedNode getNextNode() {
        return next;
    }
}
