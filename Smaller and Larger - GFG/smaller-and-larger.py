#User function Template for python3
class Solution:

	def getMoreAndLess(self,arr, n, x):
		# code here
        smaller = 0;
        larger = 0;
        
        for i in arr:
            if i <= x:
                smaller += 1
            if i >= x:
                larger += 1
        return smaller,larger

#{ 
 # Driver Code Starts
#Initial Template for Python 3



if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, x = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.getMoreAndLess(arr, n, x)
        print(str(ans[0]) + " " + str(ans[1]))
        tc -= 1

# } Driver Code Ends