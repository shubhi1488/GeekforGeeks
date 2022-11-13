/*
Check if Linked List is Palindrome
Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.
*/
#code-
  class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        
        Node mid=middle(head);
        Node last=reverse(mid);
        Node curr=last;
        while(last!=null && head!=null){
            if(head.data!=last.data){
                break;
            }
            head=head.next;
            last=last.next;
        }
        reverse(curr);
        return head==null||last==null;
    }    
    Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node prev=null;
        Node present=head;
        Node next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
        if(next!=null){
            next=next.next;
        }    
        }
        return prev;
    }
}
