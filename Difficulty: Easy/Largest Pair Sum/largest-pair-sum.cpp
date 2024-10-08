//{ Driver Code Starts
// Initial template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
      int pairsum(vector<int> &arr) {
        int Max=-1e9,s_max=-1e9;
        for(auto x : arr){
            if(x > Max){
                s_max=Max;
                Max=x;
            } else if(x > s_max){
                s_max=x;
            }
        }
        return Max+s_max;
    }
};


//{ Driver Code Starts.
int main() {
    int t;

    cin >> t;
    cin.ignore();
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        int n = arr.size();
        Solution ob;
        int r = ob.pairsum(arr);
        cout << r << endl;
    }
    return 0;
}
// } Driver Code Ends