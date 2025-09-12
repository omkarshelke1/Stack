import java.util.Stack;
import java.util.Scanner;
public class ReverseStringUsingStack

{
    public static String reverseString(String str)
    {
        Stack<Character> s = new Stack<>();
        
        int index = 0;
        while(index < str.length())
        {
            s.push(str.charAt(index));
            index++;
        }
        
        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty())
        {
            Character ch = s.pop();
            sb.append(ch);
        }
        
        return sb.toString();
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter String:");
		String reverse = reverseString(sc.nextLine());
		System.out.println("Reversed String: "+reverse);
	}
}