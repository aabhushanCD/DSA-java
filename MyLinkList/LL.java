import java.lang.*;
    public class LL{

      public class Node{
        Node link;
        public int data;

        Node(int data){
          this.data = data;
          this.link = null;
        }

      }
      Node head = null;
      public void createNode(int data){
        Node newNode = new Node(data);
        
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

        public void atFirst(int data){
          Node newNode = new Node(data);
            if( head == null){
              newNode = head;
            }else{
              newNode.link = head;
              head = newNode;
            }
          }
        
          public void Search(int data){

            
              Node temp = head;
              while(temp != null){
                if(temp.data == data){
                  System.out.println("found your data:" + temp.data);
                  return;
                }
                temp = temp.link;
              }
              System.out.println(data + ": is Not found in the linked list");
            
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
          System.out.println();
          link_list.atFirst(5);
          link_list.atFirst(4);
          link_list.atFirst(3);
          link_list.atFirst(2);
          link_list.atFirst(1);

          link_list.Search(6);
          link_list.Search(5); 
          link_list.Display();
        }
      }
