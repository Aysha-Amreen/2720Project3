package tree;

/**
 * Node.
 */

public class Node<T extends Comparable<T>> {
    private T item;
    private Node<T> leftChild;
    private Node<T> rightChild;
    private Node<T> parent;

    private int height = 1;

    /** Creates a node with the given element. */
    public Node(T t, Node<T> node) {
        item = t;
        parent = node;
    }

    // Accessor methods
    /** Returns the item stored at the node. */
    public T getItem() {
        return item;
    }

    /** Returns the height of the node. */
    public int getHeight() {
        return height;
    }

    /** Returns the left child node (or null if no such node). */
    public Node<T> getLeftChild() {
        return leftChild;
    }

    /** Returns the right child node (or null if no such node). */
    public Node<T> getRightChild() {
        return rightChild;
    }

    /** Returns the parent node (or null if no such node). */
    public Node<T> getParent() {
        return parent;
    }

    // Modifier methods

    /** Set the item of the node. */
    public void setItem(T t) {
        item = t;
    }

    /** Set the item of the node. */
    public void setHeight(int h) {
        height = h;
    }

    /** Set the left child node. */
    public void setLeftChild(Node<T> node) {
        leftChild = node;
    }

    /** Set the right child node. */
    public void setRightChild(Node<T> node) {
        rightChild = node;
    }

    /** Set the parent node. */
    public void setParent(Node<T> node) {
        parent = node;
    }
}
