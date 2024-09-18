//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution{
    static boolean ispar(String str){
        Stack <Character> st=new Stack<>();
        int i=0;
        int n=str.length();
        while(i<n){
            if(str.charAt(i)=='(' || str.charAt(i)=='{'|| str.charAt(i)=='['){
                st.add(str.charAt(i));
            }else {
                char ch=str.charAt(i);
                if(st.size()>0){
                    if(ch==')'){
                        if(st.peek()=='('){
                            st.pop();
                        }else return false;
                    }else if(ch=='}'){
                        if(st.peek()=='{'){
                            st.pop();
                        }else return false;
                        
                    }else {
                        if(st.peek()=='['){
                            st.pop();
                        }else return false;
                        
                    }
                }else {
                    return false;
                }
            }
            i++;
        }
        
        if(st.size()>0)return false;
        else return true;
    }
}