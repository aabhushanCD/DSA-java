
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

  public void createNode(int data){
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
    dcl.createNode(5);
    dcl.createNode(6);
    dcl.createNode(7);
    
    dcl.createNode(8);
    dcl.createNode(9);
    dcl.display();
    dcl.createNode(8);
    dcl.createNode(9);
    dcl.display();
  }
}
