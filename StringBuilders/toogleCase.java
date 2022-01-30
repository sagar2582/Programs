import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
		    char ch = str.charAt(i);
		    
		    if(ch >= 'A' && ch <= 'Z'){
		        char t = (char)(ch - 'A' + 'a');
		        sb.append(t);
		    }
		    else{
		        char t = (char)(ch - 'a' + 'A');
		        sb.append(t);
		    }
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}