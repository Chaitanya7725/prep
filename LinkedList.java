import java.util.Arrays;

class Node {
    int i;
    Node next;
}

class Linked {

    public Node insert(int i, Node node) {
        if (node == null)
            return getNewNode(i);
        else
            node.next = insert(i, node.next);
        return node;
    }

    private Node getNewNode(int i) {
        Node a = new Node();
        a.i = i;
        a.next = null;
        return a;
    }

}

public class LinkedList {

    public static void main(String[] args) {

        Node root = null;
        Linked a = new Linked();
        root = a.insert(12, root);
    }
}
