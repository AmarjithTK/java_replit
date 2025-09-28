package linkedlist;

public class llv1 {
    
    public static void main(String[] args) {
        llpractice();
    }

    public static void llpractice(){
        node dummy = new node(-1);
        node tail = dummy;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int num:arr){
            node temp = new node(num);
            tail.next=temp;
            tail=tail.next;
        }
        
        node head = dummy.next;
        // dummy=dummy.next;

        // head and dummy are the same;

        System.out.println("Original list:");
        while(head!=null){
            System.out.println(head.data+" is the data ");
            head=head.next;
        }

        int value=11; // Changed to 11 since 10 is already in the list

        // Find the last node to add the new value - Fixed NullPointerException
        node temp=dummy.next;
        while(temp.next!=null){  // Fixed: check temp.next instead of temp
            temp=temp.next;
        }

        temp.next= new node(value);

        System.out.println("After adding the value " + value + ":");
        
        // Print the updated list
        head = dummy.next;
        while(head!=null){
            System.out.println(head.data+" is the data ");
            head=head.next;
        }
    }
}