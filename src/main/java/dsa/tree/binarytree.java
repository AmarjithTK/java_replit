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

  public void printTree() {
    printTreeRecursive(root, 0);
  }

  private void printTreeRecursive(cording node, int level) {
    if (node == null) return;

    // print right subtree first
    printTreeRecursive(node.right, level + 1);

    // print current node with indentation
    for (int i = 0; i < level; i++) {
      System.out.print("    "); // 4 spaces per level
    }
    System.out.println(node.data);

    // print left subtree
    printTreeRecursive(node.left, level + 1);
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

  public void printpreorder(cording cord){
    printpreorderRecursive(cord);
    System.out.println();
  }

  private void printpreorderRecursive(cording cord){
    if(cord!=null){
      System.out.println(cord.data+" ");
      printpreorderRecursive(cord.left);
      printpreorderRecursive(cord.right);

    }
  }


  


  public void printpostorder(cording cord){
    printpostorderRecursive(cord);
  }

  private void printpostorderRecursive(cording cord){
    if(cord!=null){
      printpostorderRecursive(cord.left);
      printpostorderRecursive(cord.right);
      System.out.println(cord.data+"");
    }
  }

  public void insert(int data){
    root=insertRecursive(root,data);
  }

  private cording insertRecursive(cording cord,int data){


  if(cord==null){
    return new cording(data);
  }

    if(data<cord.data){
      cord.left=insertRecursive(cord.left,data);
    }
    else if(data>cord.data){
   
    cord.right=insertRecursive(cord.right,data);
    }

    

  return cord;
    


    
  }


  

  public static void main(String[] args){
    binarytree tree = new binarytree();
    tree.root = new cording(1);
    tree.root.left = new cording(2);
    tree.root.right = new cording(3);
    tree.root.left.left = new cording(4);
    // add elements to tree in dynamic way witout this much left.left thingy, i want to add 
    // elements to tree in dynamic way
    tree.printinorder(tree.root);
    tree.printpreorder(tree.root);
    tree.printpostorder(tree.root);
    
    int[] values = {50, 30, 70, 20, 40, 60, 80};


      for(int val:values){
        tree.insert(val);
      }


    tree.printTree();

    

    


    
   
  }

}