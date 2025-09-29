package dsa.linkedlist;

public class reversefromend{

   public static void main(String[] args){
       node head = new node(1);
       head.next = new node(2);
       head.next.next = new node(3);
       head.next.next.next = new node(4);
       head.next.next.next.next = new node(5);
       head.next.next.next.next.next = new node(6);
       head.next.next.next.next.next.next = new node(7);
       head.next.next.next.next.next.next.next = new node(8);
       head.next.next.next.next.next.next.next.next = new node(9);

       print(head);
      removefromend(head, 5);
      print(head);
     

     
   }

    public static void removefromend(node head, int k){

      node dummy = new node(-1);
      dummy.next = head;

      node fast = dummy;
      node slow = dummy;

      for(int i=0; i<=k; i++){
        fast=fast.next;
      }

      while(fast!=null){
        fast=fast.next;
        slow=slow.next;
      }
      slow.next=slow.next.next;


      
    }
  public static void print(node head){
      while(head!=null){
        System.out.println(head.data);
        head=head.next;
      }
  }

  
}