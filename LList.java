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


    public static void main(String[] args) {
        LList one = new LList();
        System.out.println(one.start.val);
        System.out.println(one.end);

        
    }

    
}