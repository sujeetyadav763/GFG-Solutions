#User function Template for python3

class Solution:
    
    #Function to find the maximum number of meetings that can
  def maximumMeetings(self,n,start,end):
    meetings = list(zip(start, end))
    meetings.sort(key=lambda x: (x[1], x[0]))
    ans, end = 0, -1
    
    for s, e in meetings:
        if end == -1 or s > end:
            ans += 1
            end = e
    
    return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3
import atexit
import io
import sys

#Contributed by : Nagendra Jha

if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases) :
        n = int(input())
        start = list(map(int,input().strip().split()))
        end = list(map(int,input().strip().split()))
        ob=Solution()
        print(ob.maximumMeetings(n,start,end))
# } Driver Code Ends