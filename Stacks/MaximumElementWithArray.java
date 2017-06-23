import java.io.*;
import java.util.*;

public class Solution {
	static int top =0;
	//Scanner sc = new Scanner(System.in);
	//static final int MAX=1000;
	//int [] a=new int[MAX];
	Solution(){
		top=-1;
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int N = sc.nextInt();
		int [] a = new int[N+1];
		for(int i = 0; i < N; i++){
			int operation = sc.nextInt();			
			if(operation == 1){
				int value = sc.nextInt();
				s.push(value , N , a);
			}
			else if(operation == 2){
				s.pop();
			}
			else if(operation == 3){
				s.max(a);
			}
		}
		
    }
	public void push( int value, int N, int a[] ){
		if( top > N) {
			System.out.println("stack overflow");
		}
		else{
			a[++top] = value;
		}
	}
	public void pop(){
		if(top < 0){
			System.out.println("stack underflow");
		}
		else{
			top --;
		}
	}
	public void max(int a[]){
		int max= a[0];
		for ( int i = 1; i <= top; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
