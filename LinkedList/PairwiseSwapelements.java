class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node p1=head,p2=head.next,p3=p2.next;
        p1.next=p3;
        p2.next=p1;
        if(p3!=null){
            p1.next=pairwiseSwap(p3);
        }
        return p2;
    }
}
