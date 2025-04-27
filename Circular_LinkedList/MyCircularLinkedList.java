
public class MyCircularLinkedList{

  public class Node{
    Node link;
    int data;
    Node(int data){
      this.data = data;
      this.link = null;
    }
}
    Node head = null;
    public boolean isHeadNull(){
      return head == null;
    }
    public void createNode(int data){
      Node newNode = new Node(data);
      if(isHeadNull()){
        head = newNode;
        newNode.link = head;
      }else{
      Node temp = head; 
      while(temp.link != head){
        temp = temp.link;
      }
      temp.link = newNode;
      newNode.link = head;
    }
    }
    public void firstInsert(int data){
      Node newNode = new Node(data);
      if(isHeadNull()){
        head = newNode;
        newNode.link = head;
      }
      else{
        Node temp = head;
      while(temp.link != head){
        temp = temp.link;
      }
      newNode.link = head;
      temp.link = newNode;
      head = newNode;
      }
    }
    public void display(){
      if(isHeadNull()){
        System.out.println("not any items in linked list");
        return;
      }
      else{
        Node temp = head;
        do{
          System.out.print(temp.data + "--> ");
          temp = temp.link;
        }
        while(temp != head);
        System.out.println("(head)");
      }
    }
public static void main(String[] args) {
  MyCircularLinkedList cs = new MyCircularLinkedList();
  cs.createNode(1);
  cs.createNode(2);
  cs.createNode(3);
  cs.createNode(4);
  cs.firstInsert(0);
  cs.createNode(5);
  cs.display();
  cs.createNode(6);
  cs.firstInsert(-1);
  cs.createNode(7);
  cs.createNode(8);
  cs.display();
}
}
