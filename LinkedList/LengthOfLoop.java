/*
Find length of Loop
Given a linked list of size N. The task is to complete the function countNodesinLoop() that checks whether a given Linked List contains a loop or not and if the loop is present then return the count of nodes in a loop or else return 0. C is the position of the node to which the last node is connected. If it is 0 then no loop.
*/
#code-
  class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow=head,fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return count(slow);
            }
            
        }
        return 0;
    }
    static int count(Node n){
        int res=1;
        Node temp=n;
        while(temp.next!=n){
            res++;
            temp=temp.next;
        }
        return res;
    }
}
