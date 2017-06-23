import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int N = sc.nextInt();
		int [] a = new int[N+1];
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> supportStack = new Stack<Integer>();
		for(int i = 0; i < N; i++){
			int operation = sc.nextInt();			
			if(operation == 1){
				int value = sc.nextInt();
				stack.push(value);
                if(supportStack.isEmpty()){
                    supportStack.push(value);
                }
                else if (stack.peek() >= supportStack.peek()){
                    supportStack.push(value);
                }
			}
			else if(operation == 2){
               // System.out.println(stack.peek()+"equals to "+supportStack.peek());
				if(supportStack.peek().equals(stack.peek())){
                    supportStack.pop();
                    stack.pop();
                }
                else{
                    stack.pop();
                }
			}
			else if(operation == 3){
				System.out.println(supportStack.peek());
			}
		}
        
    }
}
