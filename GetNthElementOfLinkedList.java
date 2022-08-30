/*
Write a function to get Nth node in a Linked List
*/
#iterative approach-
  public class GetElement {
    Node1 head;
    public class Node1{
        int data;
        Node1 next;
        Node1(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int getNth(int index){
        Node1 current=head;//for iterating assign the head to a new variable
        int count=0;//initialize the count variable to 0
        //now iterate till the last node appears
        while (current!=null){
            //if the element is found at the mentioned index than print the data of the current data
            if (count==index){
                return current.data;

            }
            count++;//increase the count variable
            current=current.next;
        }
        assert(false);//if the element is not found then print false 
        return 0;
    }
    public void insert(int data){
        Node1 n1=new Node1(data);
        n1.next=head;
        head=n1;
    }

    public static void main(String[] args) {
        GetElement obj=new GetElement();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        System.out.println("element found at index:"+obj.getNth(2));
    }
}
