public class LLTest{
	
	public static void main(String[] args){
		LinkedList one = new LinkedList();
		//LinkedList.Node head = LinkedList.head(); //have a pointer node to head
		one.add(" one");
		one.add(" two");
		
		
		System.out.println(one);
	    one.findMid();
		one.add(" three");
		one.add(" four");
		one.add(" five");
		one.add(" six");
		System.out.println(one);
	    one.findMid();
		one.add(" seven");
		System.out.println(one);
	    one.findMid();
		one.nthNode(1);
		one.nthNode(3);
		one.nthNode(20);
		one.nthNode(-2);
		one.nthFromEnd(2);
		one.nthFromEnd(0);
		one.nthFromEnd(7);
	}

}

class LinkedList{
	Node head;
	Node tail;
	
	public LinkedList(){
		this.head = new Node("head");
		tail = head;
	}
	
	public Node head(){
		return head;
	}

	public void add(Node node){
		tail.next = node;
		tail = node;
	}
	
	public void add(String str){
		Node temp = new Node(str);
		tail.next = temp;
		tail = temp;
	}
	
	public void findMid(){
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println(slow.data);
	}

	public void nthNode(int n){
		int count = 1;
		Node curr = head;
		
		if(n < 1){
			return;
		}
		while (count != n && curr != null){
			curr = curr.next;
			count++;
		}
		if (count == n){
			System.out.println("it's "+curr.data);
		}
		if (curr == null){
			System.out.println("reached end of list");
		}
		return;
		
	}
	
	public void nthFromEnd(int n){
		Node fast = head;
		Node main = head;
		
		int temp = n;
		while(fast != null && temp  > 0){
			fast = fast.next;
			temp--;
		}
		while (fast.next != null){
			fast = fast.next;
			main = main.next;
		}
		System.out.println(n + " from the end is " + main.data);
	}
	
	public String toString(){
		String temp = "";
		
		Node curr = head;
		while (curr.next != null){
			temp += curr.data;
			curr = curr.next;
		}
		temp += curr.data;
		return temp;
	}

	public static class Node{
		String data;
		Node next;
		
		public Node(String data){
			this.data = data;
		}
		
		public String data(){
			return this.data;
		}
		
		public void setData(String data){
			this.data = data;
		}
		
		public Node next(){
			return next;
		}
		
		public void setNext(Node next){
			this.next = next;
		}
		
		public String toString(){
			return this.data;
		}
	}
}