import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QueueWithTwoStacks {
    final static Stack<Integer> S1 = new Stack<Integer>();
    final static Stack<Integer> S2 = new Stack<Integer>();
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int operator = sc.nextInt();
            if(operator == 1){
				int value = sc.nextInt();
                enque(value);
            }else if (operator == 2 ){
                deque();
            }else if (operator == 3 ){
                int front = front();
                System.out.println(front);
            }
        }
    }
    public static void enque(int value){
        S1.push(value);
        //System.out.println(S1.peek());
    }
    public static void deque(){
       if(S2.isEmpty()){
            while(!S1.isEmpty()){
                //System.out.println(S1.peek());
                S2.push(S1.pop());
                //System.out.println(S2.peek());
            }
        }
       S2.pop();

            		//S2.pop();
    }
   public static int front(){
        if(S2.isEmpty()){
            while(!S1.isEmpty()){
                //System.out.println(S1.peek());
                S2.push(S1.pop());
                //System.out.println(S2.peek());
            }
		}
        return S2.peek();
    }
}
