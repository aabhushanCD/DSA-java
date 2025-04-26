import java.lang.*;
    public class LL{

      public class Node{
        Node link;
        public int data;

      }
      Node head = null;
      public void createNode(int data){
        Node newNode = new Node();
        newNode.link = null;
        newNode.data = data;
        if(head == null){
          head = newNode;
        }else {
          Node temp = head;
          while(temp.link != null){
            temp  = temp.link;
          }
          temp.link = newNode;
        }
        }

        public void Display(){
          if(head == null){
            System.out.println("Not created a linked list");
            return;
          }
          Node temp = head;
          while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.link;
          }
          System.out.println("null");
        }

        public static void main(String[] args){
          LL link_list = new LL();
          link_list.createNode(10);
          link_list.createNode(20);
          link_list.createNode(30);
          link_list.createNode(40);
          link_list.createNode(50);
          link_list.Display();
        }
      }
