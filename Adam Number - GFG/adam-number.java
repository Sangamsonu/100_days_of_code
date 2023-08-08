//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.checkAdamOrNot(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String checkAdamOrNot(int n) {
        int a = square(n);
        int b = reverse(n);
        int c = square(b);
        int d = reverse(c);
        
        if(a == d){
            return "YES";
        }else{
            return "NO";
        }
        
    }
    
    static int reverse(int n){
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
    
    static int square(int n){
        return n * n;
    }
    
    
}