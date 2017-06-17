import java.util.*;
import java.lang.*;
import java.io.*;

class LargestRectangle {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for( int i =0; i < T ; i++){
		    int N = sc. nextInt();
		    int [] a = new int[N+1];
		    for(int j = 0; j < N; j++){
		        a[j] = sc.nextInt();
		    }
		    int area = maximumRect(a);
			System.out.println(area);
		}
	}
	public static int maximumRect(int [] a){
	    int N = a.length;
	    int i = 0;
	    int area, maxArea;
	    area = maxArea = 0;
	    Stack<Integer> stack = new Stack<Integer>();
	    while(i < N){
	        if(stack.isEmpty() || a[i] >= a[stack.peek()]){
	            stack.push(i++);
	        }
	        else{
	            int top = stack.pop();
	            if(stack.isEmpty()){
	                area = a[top] * i;
					//System.out.println(area);
	            }
	            else {
	                area = a[top] * (i-stack.peek()-1);
	            }
				if(area > maxArea){
	            maxArea = area;
				}
	        }
	    }
	    while (!stack.isEmpty()){
	        int top = stack.pop();
	       if(stack.isEmpty()){
	           area = a[top] * i;
	       }
			else {
	           area = a[top] * (i-stack.peek()-1);
			} 
	       if(area > maxArea){
	            maxArea = area;
	        }
	    }
	    return maxArea;
	}
}
