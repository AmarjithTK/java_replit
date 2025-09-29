// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import dsa.linkedlist.*;

public class Main {
  public static void main(String[] args) {

    // llv1.llpractice();

    System.out.println("hello world");

    reversefromend.main(null);

    

  }

  private static boolean searchinsortedmatrix(int matrix[][], int target) {
    int m = matrix.length;
    int n = matrix[0].length;

    int i = 0;
    int j = n - 1;
    while (i < m && j >= 0) {
      if (matrix[i][j] == target) {
        return true;
      } else if (matrix[i][j] > target) {
        j--;
      } else {
        i++;
      }

    }

    return false;
  }

  private static void imagerotation(int matrix[][]) {

    int m = matrix.length;
    int n = matrix[0].length;
    int temp = 0;

    for (int i = 0; i < m; i++) {
      for (int j = i + 1; j < n; j++) {

        temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;

      }
    }

    // swap

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n / 2; j++) {
        temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - 1 - j];
        matrix[i][n - 1 - j] = temp;
      }
    }

  }



}

