package ro.ulbs.lab2;

import ro.ulbs.lab2.Node;

public interface MyList {
    void addValue(int value);
    Node getNodeByValue(int value);
    void removeNodeByValue(int value);
    void listNodes();
    boolean isSorted();
    int sumNodes();
}
