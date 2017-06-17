import java.io.*;
import java.util.*;

class TransformToPalindrome{
	
	public static void main(String args[]){
		String s = "geekkeeg";
		int count = 0;
		int n = s.length();
		boolean flag = false;
		for(int i = 0; i < n/2; i++){
			if(s.charAt(i) == s.charAt(n-(i+1))){
				flag =true;
				continue;
			}
			else{
				//System.out.println("not palindrome");
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("palindrome"); 
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}