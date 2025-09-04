import java.util.ArrayList;
import java.util.Scanner;
public class StackUsingArrayList
{
    class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        static boolean isEmpty(){
            if(list.size()==0)
            return true;
            return false;
        }
        static void push(int data){
            list.add(data);
        }
        
        static int pop()
        {
            if(isEmpty()){
                System.out.println("Stack is empty !!!");
                return -1;
            }
            int data = list.get(list.size()-1);
            list.remove(list.size()-1);
            System.out.println("Element "+data+" popped !!!");
            return data;
        }
        
        static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Stack is empty !!!");
                return -1;
            }
            System.out.println("Element at the top is:"+list.get(list.size()-1));
            return list.get(list.size()-1);
        }
        
        static void display()
        {
            if(isEmpty())
            {
                System.out.println("Stack is empty !!!");
                return;
            }
            for(int i=list.size()-1;i>=0;i--)
            {
                System.out.println(list.get(i));
            }
        }
    }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int ch;
	    do{
	        System.out.println("Enter choice: 1.Push 2.Pop 3.Peek 4.Display 5.exit");
		    ch = s.nextInt();
		    switch(ch)
		    {
		        case 1:System.out.println("Enter element:");
		                Stack.push(s.nextInt());
		                break;
		        case 2:Stack.pop();
		                
		                break;
		        case 3:
		            Stack.peek();
		            break;
		        case 4:
		            Stack.display();
		            break;
		        case 5:
		           System.out.println("Thank You!!!");
		           break;
		       default:
		            System.out.println("Enter valid choice !!!");
		    }
	    
		
		}while(ch!=5);
	}
}