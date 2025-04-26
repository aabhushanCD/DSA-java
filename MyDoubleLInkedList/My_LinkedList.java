
public class My_LinkedList {
  public class Node{
    Node back;
    Node front;
    int data;
    Node(int data){
      this.back = null;
      this.front = null;
      this.data = data;
    }
  }
  Node head = null;
  public void createNode(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
    }
    else{
      Node temp = head;
      while(temp.back != null){
        temp = temp.back;
      }
      newNode.front = temp;
      temp.back = newNode;
    }
    System.out.println("New Node is created : " + newNode.data);
  }

public void Display(){
  Node temp = head;
  if(head == null){
    System.out.println("Nothing in the linkedList");
    return;
  }
  else{
    while (temp != null){
      System.out.print(temp.data + "--> ");
      temp = temp.back;  
    }
    System.out.print("null");
  }
}

public static void main(String[] args) {
  My_LinkedList dl = new My_LinkedList();
  dl.createNode(1);
  dl.createNode(2);
  dl.createNode(3);
  dl.createNode(4);
  dl.createNode(5);
  dl.Display();
}
}
