package dsa.stack;


public class llstack{

  public static void main(String[] args){
      llstack stacker = new llstack();
      stacker.push(1);
      stacker.push(2);

      System.out.println(stacker.pop());
      stacker.push(3);
    stacker.push(4);
    stacker.push(5);
    stacker.push(6);

    System.out.println("element from stack is peeking "+stacker.peek());
    
  
  }
  

  public static class cord{
    private int data;
    private cord next;
    public cord(int data){
      this.data=data;
      this.next=null;
    }

    
    
  }

  private cord top;
  private int size;


  public llstack(){
    top=null;
    size=0;
  }

  // @param value;

  public void push(int value){
    cord newcord= new cord(value);
    newcord.next=top;
    top=newcord;
    size++;
  }

  public int pop(){
    if(top==null){
      return -1;
    }
    int result=top.data;
    top=top.next;
    size--;
    return result;
  }


    public int peek(){
      if(top==null){
        return -1;
      }

      return top.data;
      
    }

   public boolean isempty(){
     // if(size==0)
     return size==0;
   }

  public int size(){
    return size;
  }

  
  






  
}