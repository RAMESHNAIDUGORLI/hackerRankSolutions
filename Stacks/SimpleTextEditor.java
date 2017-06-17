import java.util.*;
import java.io.*;

class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = "";
		Stack<String> stack = new Stack<String>();
		///Stack<String> stack = new Stack<String>();
		int op, k;
		int Q = sc.nextInt();
		for ( int i = 0; i < Q; i++){
			op = sc.nextInt();
			if(op == 1){
				s = s+sc.next();
				stack.push(s);
			}else if( op == 2){
				k = sc.nextInt();
				s = s.substring(0, (s.length()-k));
				stack.push(s);
			}else if(op == 3){
				k = sc.nextInt();
				System.out.println(s.charAt(k-1));
			}else if(op == 4){
				stack.pop();
				s = stack.peek();
			}
		}
		
	}
}
