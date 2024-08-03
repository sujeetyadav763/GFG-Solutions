class Solution:
   def celebrity(self, mat):
    n=len(mat)
    for i in range(n):
        isCel=not any(mat[i])
        if isCel:
            isCel=all(mat[j][i] for j in range(n) if j!=i)
        if isCel:
            return i
    return -1

#{ 
 # Driver Code Starts
# Main function to handle input and output
if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        n = int(input())
        M = []
        for _ in range(n):
            M.append(list(map(int, input().split())))

        ob = Solution()
        print(ob.celebrity(M))

# } Driver Code Ends