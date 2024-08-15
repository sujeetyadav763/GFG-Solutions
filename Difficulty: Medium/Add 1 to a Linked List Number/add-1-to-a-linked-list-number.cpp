//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    struct Node* next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};

void printList(Node* node) {
    while (node != NULL) {
        cout << node->data % 10;
        node = node->next;
    }
    cout << "\n";
}


// } Driver Code Ends
// User function template for C++

/*

struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }
};

*/

class Solution {
  public:
    Node* addOne(Node* head) {
        // Your Code here
        // return head of list after adding one
         Node* temp = head;
        Node* change = NULL;
        while(temp){
            Node* prev = temp;
            if(temp->next == NULL){
                if(temp->data < 9){
                    temp->data += 1;
                    return head;
                }
                break;
            }
            temp = temp->next;
            if(prev->data!=9 && temp && temp->data==9){
                change = prev;
            }
        }
        if(change==NULL){
            Node* first = new Node(1);
            first->next = head;
            while(head){
                head->data = 0;
                head= head->next;
            }
            return first;
        }
        else{
            change->data += 1;
            change = change->next;
            while(change){
                change->data = 0;
                change= change->next;
            }
            return head;
        }
        return head;
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

        if (arr.empty()) {
            cout << -1 << endl;
            continue;
        }

        int data = arr[0];
        struct Node* head = new Node(data);
        struct Node* tail = head;
        for (int i = 1; i < arr.size(); ++i) {
            data = arr[i];
            tail->next = new Node(data);
            tail = tail->next;
        }
        Solution ob;
        head = ob.addOne(head);
        printList(head);
    }
    return 0;
}

// } Driver Code Ends