// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
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
    dummy=dummy.next;

    // head and dummy are the same;
    
    while(head!=null){
      System.out.println(head.data+" is the data ");
      head=head.next;
    }

    int value=10;

    

    
  }


  private static boolean searchinsortedmatrix(int matrix[][],int target){
      int m = matrix.length;
    int n = matrix[0].length;

      int i = 0;
        int j=n-1;
      while(i<m && j>=0){
      if(matrix[i][j]==target){
        return true;
      }
      else if(matrix[i][j]>target){
        j--;
    }
      else{
        i++;
      }
  
  }

    return false;
  }

  

  private static void imagerotation(int matrix[][]){

    int m = matrix.length;
    int n = matrix[0].length;
    int temp = 0;

    for(int i=0;i<m;i++){
      for(int j=i+1;j<n;j++){


        temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;

        
      }
    }


    // swap


    for(int i=0;i<m;i++){
      for(int j=0;j<n/2;j++){
        temp = matrix[i][j];
      matrix[i][j] = matrix[i][n-1-j];
      matrix[i][n-1-j] = temp;}
    }
    
      
  }

  private static void addiction() {
    // System.out.println("moobile addiction is bad for you, learn AVRT and other
    // urge surfing");
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}

// class solution()