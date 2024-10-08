#User function Template for python3

class Solution:
   def countMin(self, str):
    n=len(str)
    dp= [[None]*(n+1) for _ in range(n+1)]
    for i in range(n+1):
        for j in range(n+1):
            if i==0 or j==0:
                dp[i][j]=0
            else:
                if str[i-1]==str[n-j]:
                    dp[i][j]=1+dp[i-1][j-1]
                else:
                    dp[i][j]=max(dp[i-1][j],dp[i][j-1])
    return n-dp[n][n]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        Str = input()

        solObj = Solution()

        print(solObj.countMin(Str))

# } Driver Code Ends