public class LList{
    Node start;
    Node end;
    int size;

    public LList()
    {
        start = new Node(3);
        end = null;
        start.next  = end;
        size = 1;
    }

    public void addNode(Node nn){
        Node curr = start;
        Node temp = new Node(nn.val);

        while(curr.next != null ){
            curr = curr.next;
        }
        curr.setNext(temp);
        //  nn.next = end;
        //end = end.next;
    }

    public static void main(String[] args) {
        LList one = new LList();
        System.out.println(one.start.val);
        System.out.println(one.end);
        one.addNode(new Node(33));
        System.out.println(one.start.next.val);
        System.out.println(one.start.next.next);
        one.addNode(new Node(34));
        System.out.println(one.start.next.val);
        System.out.println(one.start.next.next);
        System.out.println(one.start.next.next.val);
        System.out.println(one.start.next.next.next);

        
    }

    
}