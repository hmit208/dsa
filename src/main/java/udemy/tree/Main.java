package udemy.tree;

public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traverseInOrder();
        System.out.println();

//        System.out.println(intTree.get(27));;
//        System.out.println(intTree.get(17));;
//        System.out.println(intTree.get(8888));;

        System.out.println("min: " + intTree.min());
        System.out.println("max: " + intTree.max());

        intTree.delete(888);

        intTree.traverseInOrder();
        System.out.println();
    }
}
