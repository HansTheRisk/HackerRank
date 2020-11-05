import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		String opening = "({[";
        String closing = ")}]";
        
        loop:
        while (sc.hasNext()) {
            String input = sc.next();
            char[] array = input.toCharArray();
            Stack<Character> stack = new Stack();
            
            for(char c : array) {
                if(opening.contains(String.valueOf(c)))
                    stack.push(c);
                else {
                    if(stack.empty()) {
                        System.out.println("false"); 
                        continue loop;
                    } else {
                        int index = closing.indexOf(String.valueOf(c));
                        if(stack.peek() == opening.charAt(index)) {
                            stack.pop();
                        } else {
                            System.out.println("false"); 
                            continue loop;
                        }  
                    }
                }    
            }
            System.out.println((stack.empty()) ? "true" : "false");
        }    
    
	}
}
