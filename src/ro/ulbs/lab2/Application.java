package ro.ulbs.lab2;

//import ro.ulbs.paradigme.lab2.Simplechained.SimpleChainedList;
//import ro.ulbs.paradigme.lab2.Doublechained.DoubleChainedList;

public class Application {
    public static void main(String[] args) {
        MyList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) simpleList.addValue(i);
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);
        System.out.print("Simple list: ");
        simpleList.listNodes();
        System.out.println("Is sorted: " + simpleList.isSorted());
        System.out.println("Sum: " + ((SimpleChainedList) simpleList).sumValues());

        MyList doubleList = new DoubleChainedList();
        for (int i = 1; i <= 10; i++) doubleList.addValue(i);
        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);
        System.out.print("Double list: ");
        doubleList.listNodes();
        System.out.println("Is sorted: " + doubleList.isSorted());
        System.out.println("Sum: " + ((DoubleChainedList) doubleList).sumValues());
    }
}
