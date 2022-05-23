import java.util.ArrayList;

public class Solution 
{
    
 public static void reverseArrayHelper(int l,int r,ArrayList<Integer>arr)
{
    if(l>=r) return;
    int tmp=arr.get(l);
    arr.set(l,arr.get(r));
    arr.set(r,tmp);
    reverseArrayHelper(l+1,r-1,arr);
}

public static void reverseArray(ArrayList<Integer> arr,int m)
{
    reverseArrayHelper(m+1,arr.size()-1,arr);
}
}
