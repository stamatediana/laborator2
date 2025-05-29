package ro.ulbs.lab2;
//PROB2
import ro.ulbs.paradigme.lab2.api.Node;

public interface MyList {
    boolean isSorted();
    void addValue(int value);
    void listNodes();
    Node getNodeByValue(int value);
    void removeNodeByValue(int value);
}
