import java.util.*;

public class Solution {
	
	public static Boolean pallindrome(int l,int r,String s)
	{
		if(l>=r)
			return true;
		if(s.charAt(l)!=s.charAt(r))
			return false;
		return  pallindrome(l+1,r-1,s);
	}
	
	
    public static Boolean isPalindrome(String s) {
		 
        return pallindrome(0,s.length()-1,s);
    }


     public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(isPalindrome(s))
                System.out.println(1);
                else
                System.out.println(0);


		
	}

}
