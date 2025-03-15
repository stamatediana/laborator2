package ro.ulbs.lab2;
import ro.ulbs.lab2.Node;

public class SimpleChainedNode implements Node {
    private int value;
    private SimpleChainedNode nextNode;

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(SimpleChainedNode nextNode) {
        this.nextNode = nextNode;
    }

    public SimpleChainedNode getNextNode() {
        return nextNode;
    }
}
