import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean isPalindrome(String s){
        int i = 0; 
        int j = s.length() - 1;
        while(i<=j){
            int left = s.charAt(i);
            int right = s.charAt(j);
            
            if(left!=right){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

	public static void solution(String str){
		//write your code here
		int n = str.length();
		for(int st =0;st<n;st++){
		    for(int end = st; end<n;end++){
		        String ss = str.substring(st, end+1);
		        if(isPalindrome(ss)){
		            System.out.println(ss);
		        }
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}