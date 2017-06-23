


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Waiter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Stack<Integer> stack = new Stack<Integer>();
        //nPrimes();
		//prime[] = nPrimes(prime);
		ArrayList<Stack<Integer>> A = new ArrayList<Stack<Integer>>();
		ArrayList<Stack<Integer>> B = new ArrayList<Stack<Integer>>();
		Stack<Integer> aStack      = null;
		Stack<Integer> bStack      = null;
		int N = sc.nextInt();
        int Q = sc.nextInt();
        int prime[] = nPrimes(Q);
		for(int q = 0; q <= Q; q++){
			A.add(new Stack<Integer>());
			B.add(new Stack<Integer>());
		}
		Stack<Integer> stack = A.get(0);
		for(int i = 0; i < N; i++){
			stack.push(sc.nextInt());
		}
		for(int i = 0; i < Q ; i++){
			stack = A.get(i);
			while(!stack.isEmpty()){
				int plate = stack.pop();
				if((plate % prime[i]) == 0){
					bStack = B.get(i+1);
					bStack.push(plate);
					//System.out.println("rameshnaidu"+bStack.peek());
				}
				else{
					aStack = A.get(i+1);
					aStack.push(plate);
				}
			}
		}
		for(int i = 1; i < B.size(); i++){
			bStack = B.get(i);
			while(!bStack.isEmpty()){
				System.out.println(bStack.pop());
			}
		}
		for(int i = 0; i < A.size(); i++){
			aStack = A.get(i);
			while(!aStack.isEmpty()){
				System.out.println(aStack.pop());
			}
		}
	}
	public static int[] nPrimes(int Q){
		int i = 3, count, c,counter=1;
	    int [] prime = new int[Q+1];
		prime[0]=2;
	 
		for ( count = 2 ; count <= Q ;  )
		{
		  for ( c = 2 ; c <= i-1 ; c++ )
		  {
			 if ( i%c == 0 )
				break;
		  }
		  if ( c == i )
		  {
			  prime[counter++]=i;
			 count++;
		  }
		  i++;
		}
        return prime;
    }
}
