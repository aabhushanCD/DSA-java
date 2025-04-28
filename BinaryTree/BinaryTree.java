public class BinaryTree {

  public class Node {
      Node left, right;
      int data;

      Node(int data) {
          this.left = null;
          this.right = null;
          this.data = data;
      }
  }

  Node root = null;

  public void Insert(int value) {
      root = Insert(root, value);
  }

  public Node Insert(Node current, int value) {
      if (current == null) {
          return new Node(value);
      }
      if (value <= current.data) {
          current.left = Insert(current.left, value);
      } else {
          current.right = Insert(current.right, value);
      }
      return current;
  }

  // Correct inorder traversal
  public void inOrder(Node current) {
      if (current != null) {
          inOrder(current.left);
          System.out.print(current.data + " ");
          inOrder(current.right);
      }
  }

  public void inOrderTraversal() {
      inOrder(root);   // start from root
  }

  public static void main(String[] args) {
      int[] array = {5, 3, 45, 67, 2, 34, 5};
      BinaryTree tree1 = new BinaryTree();
      for (int a : array) {
          tree1.Insert(a);
      }
      System.out.println("Inorder Traversal of Tree:");
      tree1.inOrderTraversal();
  }
}
