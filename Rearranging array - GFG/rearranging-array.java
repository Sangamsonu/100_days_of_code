//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            int answer[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n, answer);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static void Rearrange(int a[], int n, int answer[])
    {
        Arrays.sort(a);
        int low = 0; 
        int high = n-1;
        int k =0;
        while(low <=  high){
            answer[k] = a[low];
            k++;
            low++;
            if(low <= high){
                answer[k] = a[high];
                k++;
                high--;
            }
        }
    }
}
