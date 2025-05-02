
public class MyAVL {
    public class Node{
        int data;
        Node left, right;
        Node(int data){
          this.data = data;
          this.left = null;
          this.right = null;
        }
    }
    Node root = null;
    public void Insert(int data){
      root = Insert(root, data);
    }
    public Node Insert(Node current,int value){
      if(current == null){
        return new Node(value);
      }
      if(value < current.data){
        current.left = Insert(current.left, value);
      }else{
        current.right = Insert(current.right, value);
      }
        return current;
    }

    public void balance(Node current){
      int rightEdge, leftEdge;
      if(root != null){
        leftEdge++;
        balance(root.left);
      }
      if(root.right != null){
        rightEdge++;
        balance(root.right);
      }
      int result = leftEdge - rightEdge;
      if(result != -1 && result != 0 && result !=1){

      }
    }
    public static void main(String[] args) {
      MyAVL tree = new MyAVL();
      int[] array = {5,7,4,5,9,2};
      for(int a : array){
        tree.Insert(a);   
      }
    }
}