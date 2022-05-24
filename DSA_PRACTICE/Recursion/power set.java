
import java.util.*;

class sol {
    
    
        public static String[] powerset(String str)
        {
            if(str.length()==0)
            {
               String ans[]={""};
               return ans ; 
            }
              
              
             String smallans[]=powerset(str.substring(1));
             String ans[]=new String[2*smallans.length];
             int k=0;
              for(int i=0;i<smallans.length;i++)
              {
                  ans[k]=str.charAt(0)+smallans[i];
                  k++;
              }
              
              for(int i=0;i<smallans.length;i++)
              {
                  ans[k]=smallans[i];
                  k++;
              }
              
              return ans;
        }
    
    
    public static void main(String[] args) {
        String s="abc";
        String sol[]=powerset(s);
        Arrays.sort(sol);
        for(int i=0;i<sol.length;i++)
        {
            System.out.print(sol[i]+" ");
        }
    }
}
