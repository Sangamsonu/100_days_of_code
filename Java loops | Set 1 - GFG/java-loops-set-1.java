//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {
            int N = scn.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> sum = ob.getSum(N);
            System.out.println(sum.get(0)+" "+sum.get(1));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> getSum(int N){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
      
        int sum =0;
        int sum1 = 0;
        int i = 1;
        while(i <=N){
            if(i % 2 == 0){
                sum += i;
            }else{
                sum1 += i;
            }
          i++; 
        }
        list.add(sum);
         list.add(sum1);
        return list;
     }
}