public class Stack {

    // linked list node class
    private class Node {
        public int value;
        public Node nextNode;

        // node constructor
        public Node(int value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }
    }

    private Node head = null;
    private int size = 0;

    // adds a new node to the stack
    public void push(int value) {
        Node newNode = new Node(value, this.head); // create the new node and assign the current head as a next node
        this.head = newNode; // change the head to the new node
        this.size++; // increase the size of the stack
    }

    // removes the head value of the stack
    public Integer pop() {
        if(this.size != 0) {
            Node currentHead = this.head; // keep track of the head node before removing it
            this.head = this.head.nextNode;
            currentHead.nextNode = null;
            this.size--; // decrease the size of the stack
            return currentHead.value;
        }
        return null;
    }

    // returns the value of the stack's head (null if empty)
    public Integer top() {
        if(this.size != 0) {
            return this.head.value;
        }
        return null;
    }

    // returns the size of the stack
    public int size() {
        return this.size;
    }

    // returns a boolean indicating if the stack is empty
    public boolean isEmpty() {
        return this.size == 0;
    }

    // convert a node to a string
    private static String nodeToString(Node currentNode) {
        if(currentNode.nextNode == null) { // if the current node is the last node
            return currentNode.value + "";
        }
        else {
            return currentNode.value + ", " + nodeToString(currentNode.nextNode); // check next node
        }
    }

    // use nodeToString to convert the whole stack to a string
    @Override
    public String toString() {
        Node currentNode = this.head;

        if(currentNode == null) { // if the first node is null
            return "The list is empty.";
        }
        else {
            return nodeToString(currentNode); // convert current node to string
        }
    }
}
