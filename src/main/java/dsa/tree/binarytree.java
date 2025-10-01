package dsa.tree;

public class binarytree {

  private static class cording {
    int data;
    cording left;
    cording right;

    public cording(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

  }

  private cording root;

  public binarytree() {
    this.root = null;
  }

  public void printinorder(cording cord) {
    printinorderRecursive(cord);
    System.out.println();
  }

  private void printinorderRecursive(cording cord) {
    if (cord == null) {
      return;
    }

    printinorderRecursive(cord.left);
    System.out.println(cord.data + " ");
    printinorderRecursive(cord.right);

  }

}