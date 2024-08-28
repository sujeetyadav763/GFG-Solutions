//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Map.Entry;


// } Driver Code Ends
// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr1[]) {
        // add your code here
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int val:arr1){
                map.put(val,map.getOrDefault(val,0)+1);
            }
            int size=map.size();
            int arr[][]=new int[size][2];
            int idx=0;
            for(Map.Entry<Integer,Integer>e:map.entrySet()){
                arr[idx][0]=e.getKey();
                arr[idx][1]=e.getValue();
                idx++;
            }
            Arrays.sort(arr,(a,b)->{
             int val=Integer.compare(b[1],a[1]);
             if(val==0){
                 return Integer.compare(a[0],b[0]);
             }else{
                 return val;
             }
            });
                
            ArrayList<Integer>res=new ArrayList<>();
            for(int i=0;i<size;i++){
                int freq=arr[i][1];
                for(int j=0;j<freq;j++)
                  res.add(arr[i][0]);
            }
            return res;
        
    }
}

//{ Driver Code Starts.

class Driverclass {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        while (n != 0) {
            String input = sc.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans = new Solution().sortByFreq(arr);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();
            n--;
        }
    }
}

// } Driver Code Ends