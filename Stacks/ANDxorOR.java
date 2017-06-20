//In comments code is witout using stack
/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] a = new int[N];
        for(int j = 0; j < N ; j++){
            a[j] = sc.nextInt();
        }
       // Stack<Integer> stack = new Stack<Integer>();
        //stack.push(0);
        int max = 0;
        int result = 0;
        for (int i = 0 ; i < a.length-1 ; i++){
            for (int j = i+1 ; j < a.length ; j++){
                result = returnOperations(a[i] , a[j]);
                if(result > max ){
                    max = result;
                }
                if(a[j] <= a[i] || (j < N-1 && a[j] < a[j+1]) ){
                    break;
                }
            }
        }
        System.out.println(max);
    }
    public static int returnOperations(int M1 , int M2){
        int mAnd = M1&M2;
        //System.out.println(mAnd);
        int mOr = M1|M2;
        //System.out.println(mOr);
        int mXor = mAnd^mOr;
        int m1Xor = M1^M2;
        int result = mXor&m1Xor;
        //System.out.println(result);
        return result;
    }
}*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] a = new int[N+1];
        for(int j = 0; j < N ; j++){
            a[j] = sc.nextInt();
        }
       Stack<Integer> stack = new Stack<Integer>();
        //stack.push(0);
        int max = 0;
        for (int i = 0 ; i < N ; i++){
            while(true){
                if(stack.isEmpty()){
                    stack.push(a[i]);
                    break;
                }else if(stack.peek() < a[i]){
                    int si = returnOperations(stack.peek(), a[i]);
                    if(max < si){
                        max = si;
                    }
                    stack.push(a[i]);
                    break;
                } else{
                    stack.pop();
                }
            }
        }
        stack = new Stack<Integer>();
        for (int i = N-1 ; i >= 0 ; i--){
            while(true){
                if(stack.isEmpty()){
                    stack.push(a[i]);
                    break;
                }else if(stack.peek() < a[i]){
                    int si = returnOperations(stack.peek(), a[i]);
                    if(max < si){
                        max = si;
                    }
                    stack.push(a[i]);
                    break;
                } else{
                    stack.pop();
                }
			}
        }
    System.out.println(max);
    }
    public static int returnOperations(int M1 , int M2){
        // you can directly use M1^M2 (equation converted to M1^M2)
        int mAnd = M1&M2;
        //System.out.println(mAnd);
        int mOr = M1|M2;
        //System.out.println(mOr);
        int mXor = mAnd^mOr;
        int m1Xor = M1^M2;
        int result = mXor&m1Xor;
        //System.out.println(result);
        return result;
    }
}
