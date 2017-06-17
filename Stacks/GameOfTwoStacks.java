import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfTwoStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i = 0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            int result = gameOfToStacks(a, b, x);
			System.out.println(result);
        }
    }
	public static int gameOfToStacks(int [] a, int [] b, int x){
		int n1 = a.length;
		int n2 = b.length;
		int i = 0, j = 0, sum = 0, count = 0;
		while(i < n1 && (sum + a[i]) <= x){
			sum = a[i] + sum;
			i++;
		} 
		count = i;
		while( j < n2 &&  i >= 0){
			sum = b[j] + sum;
			j++;
			while(sum > x && i > 0){
				i--;
				sum = sum - a[i];
			}
			if( sum <= x && (i + j) > count){
			count = i + j;
		}
		}
		return count;
		/*int height1, height2;
		height1 = height2 = 0;
		Stack<Integer> a1 = new Stack<Integer>();
		//Stack<Integer> b1 = new Stack<Integer>();
		for(int i = n1 - 1; i >= 0; i--){
			//System.out.println("rameshnaidu");
			height1 = height1 + a[i];
			a1.push(a[i]);
		}
		for(int i = n2 - 1; i >= 0; i--){
			height2 = height2 + a[i];
			b1.push(b[i]);
			//System.out.println("ram");
		}
		int sum = 0;
		int count = 0;
		for(int i = n - 1; i >= 0; i--){
			if(x > sum){
				if( !a1.isEmpty() && !b1.isEmpty()){
					int ae = a1.pop();
					int be = b1. pop();
					if ( ae > be){
						sum = sum + be;
						a1.push(ae);
						//count++;
					}
					else {
						sum = sum + ae;
						a1.push(be);
						//count++;
					}
					/*if(height1 > height2) {
						int ae = a1.pop();
						sum = sum + ae;
						height1 = height1 - ae;
					}
					else{
						int be = b1.pop();
						sum = sum + be;
						height1 = height1 - be;
					}
				}
				else if(!a1.isEmpty() && b1.isEmpty()){
					int ae = a1.pop();
					sum = sum + ae;
					//count++;
				}
				else if (a1.isEmpty() && !b1.isEmpty()){
					int be = b1.pop();
					sum = sum + be;
					
				}
				count++;
			}
		}
		return count;*/
	}
}
