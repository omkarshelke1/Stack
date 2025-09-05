class Stack
{
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    
    void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    int pop()
    {
        if(head == null){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    
    void display()
    {
        Node top = head;
        while(top != null)
        {
            System.out.println(top.data);
            top = top.next;
        }
        
    }
    
    void peek()
    {
        System.out.println(head.data);
    }
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.display();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.display();
		
	}
}