// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world peple!");
    System.out.println("This feels awesome and interseting");
    System.out.println("if feels to me that I should stick to java for backend roles and stick to what we choose to do, rather than changing goals and posts here and there");



        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        imagerotation(matrix);
        for(int i=0;i<matrix.length;i++)
          for(int j=0;j<matrix[0].length;j++)
            System.out.print(matrix[i][j]+" ");

    int mat = 
    

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