#User function Template for python3
class Solution:
    def revStr (ob, S):
        # code here 

        return S[::-1]
#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        S = input()
        
        ob = Solution()
        print(ob.revStr(S))
# } Driver Code Ends