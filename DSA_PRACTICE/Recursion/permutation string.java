import java.util.*;

public class Solution {
    
        public static void permute(ArrayList<String>ans,String str,int pos,int len)
        {
            if(pos==len)
                ans.add(str);
            else
            {
                for(int i=pos;i<len;i++)
                {
                    str=swap(str,pos,i);
                    permute(ans,str,pos+1,len);
                    str=swap(str,pos,i);
                }
            }
        }
    
     public static String swap(String s, int i, int j)
    {
        char temp;
        char[] strArray = s.toCharArray();
        temp = strArray[i] ;
        strArray[i] = strArray[j];
        strArray[j] = temp;
        return String.valueOf(strArray);
    }
    
    
	public static ArrayList<String> generatePermutations(String str) {
		
        ArrayList<String>ans=new ArrayList<>();
        int n=str.length();
        permute(ans,str,0,n);
        Collections.sort(ans);
         return ans;
        
        
        
        
	}
}
