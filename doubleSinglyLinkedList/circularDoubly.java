
public class circularDoubly {
  public class Node {
    Node pre, next;
    int data;
    Node(int data){
      this.data = data;
      this.next = null;
      this.pre = null;
    }
  }

  Node head = null;

  public void creaeNode(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      head.next = head;
    }
    else{
      Node temp = head;
      while(temp.next != head){
        temp = temp.next;
      }
      newNode.pre = temp;
      temp.next = newNode;    
      newNode.next = head;
    }
  }
  public void display(){
    if(head == null){
      System.out.println("nothing inside the list");
      return;
    }
    else{
      Node temp = head;
      do{
        System.out.print(temp.data +" --> ");
        temp = temp.next;
      }
      while(temp != head);
      System.out.print("(Head)\n");
    }
  }
  
  public static void main(String[] args) {
    circularDoubly dcl = new circularDoubly();
    dcl.creaeNode(5);
    dcl.creaeNode(6);
    dcl.creaeNode(7);
    
    dcl.creaeNode(8);
    dcl.creaeNode(9);
    dcl.display();
    dcl.creaeNode(8);
    dcl.creaeNode(9);
    dcl.display();
  }
}
