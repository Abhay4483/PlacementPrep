

import java.io.*;
import java.util.*;


class Solution {
	
	
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	
	
	public static void main(String args[]) {
		
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
		if(n<0)
			System.out.println("Error");
		else
			System.out.println(fact(n));
		
		
	}
}
