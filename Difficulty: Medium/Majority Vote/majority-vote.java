//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    
    // Function to find the majority elements in the array
    // A majority element in this context is any element that appears more than n/3 times, 
    // where n is the size of the input list 'nums'.
    public List<Integer> findMajority(List<Integer> nums) {
        
        // List to store the majority elements
        List<Integer> result = new ArrayList<>();
        
        // Map to store the frequency of each element in the list
        Map<Integer, Integer> freq = new TreeMap<>();
        
        // Iterate through each element in the list 'nums'
        for (int votes : nums) {
            // Update the frequency map. If the element already exists, increment its value by 1, 
            // otherwise set it to 1 (default 0 + 1).
            freq.put(votes, freq.getOrDefault(votes, 0) + 1);
        }
        
        // Calculate the threshold for being a majority element (n/3)
        int target = nums.size() / 3;
        
        // Iterate through each entry in the frequency map
        for (Map.Entry<Integer, Integer> entries : freq.entrySet()) {
            // If the frequency of the current element is greater than n/3, it's a majority element
            if (entries.getValue() > target) {
                // Add the element (key) to the result list
                result.add(entries.getKey());
            }
        }
        
        // If no majority element is found, add -1 to the result list to indicate that
        if (result.isEmpty()) result.add(-1);
        
        // Return the list of majority elements (or -1 if none found)
        return result;
    }
}