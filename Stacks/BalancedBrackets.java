import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
    static final int MAX=1000;
	char [] a=new char[MAX];//maximum size of stack
	static int top;
    BalancedBrackets(){
        top = -1 ;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BalancedBrackets sc = new BalancedBrackets();
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            boolean result = sc.balancedBrackets(s);
            if(result){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
   boolean isEmpty(){
		return (top<0);
	}
	boolean push(char x){
		if(top>MAX){
			//System.out.println("stack is overflow");
			return false;
		}
		else{
			a[++top]=x;
			return true;
		}
	}
	char pop(){
		if(top<0){
			//System.out.println("stack is underflow");
			return 0;
		}
		else{
			char x = a[top--];
			return x;
		}
	}
    boolean balancedBrackets(String s){
        for(int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                push(c);
            }
            else if(c == ')'){
                if(isEmpty()){
                    return false;
                }else if(pop() != '('){
                    return false;
                }
			}
            else if(c == '}'){
                 if(isEmpty()){
                        return false;
                 }else if(pop() != '{'){
                        return false;
                    }
                }
            else if(c == ']'){
                 if(isEmpty()){
                        return false;
                 }else if(pop() != '['){
                        return false;
                    }
            }
        }
		return (isEmpty());
    }
}
