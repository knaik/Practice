class Node{
    int val;
    Node next;

    public Node(){
        val = 0;
        next = null;
    }

    public Node(int i){
        val = i;
        next = null;
    }

    public Node(int i, Node nn){
        val = i;
        next = nn;
    }

    public void setNext(Node nn){
        next = nn;
    }

    public Node getNext(){
        return next;
    }
}