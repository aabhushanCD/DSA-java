import java.util.Scanner;



import java.lang.*;
public class MyCircular_Queue {
  private int front,rear;
  private int size;
  private int capacity;
  private int[] arr;

  public MyCircular_Queue(int c){
    arr = new int[c];
    capacity = c;
    front = 0;
    size = 0;
  }
  public int getFront(){
    if(size == 0){
      return -1;
    }
    return arr[front];
  }
  public int getRear(){
    if(size == 0){
      return -1;
    }
    return arr[rear];
  }
  public boolean isFull(){
    if(size == capacity){
      return true;
    }
    return false;
  }
  public boolean isEmpty(){
    if(size == 0){
      return true;
    }
    return false;
  }
  public void EnQueue(int a){
  if(isFull()){
    System.out.println("Cannot add queue is full");
    return;
  }
  else{
    rear = (front + size) % capacity;
    arr[rear] = a;
    size++;
  }
  }
  public int DeQueue(){
    if(isEmpty()){
      System.out.println("Cannot deQueue Queue is Empty");
      return 0;
    }
    else{
      int res = arr[front];
      front = (front + 1) % capacity;
      size--;
      return res;
    }

  }
  public void Display(){
    System.out.println("Displaying Queue items");
      for (int i = 0; i < size; i++){
        System.out.println(arr[(front + i) % capacity]);
      }
  }

  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the capacity of your queue");
    int cap = sc.nextInt();
    MyCircular_Queue MyQueue = new MyCircular_Queue(cap);
    
   
    
  
  while(true){
    System.out.println("Enter Your choice: \n 1) EnQueue \n 2) DeQueue \n 3) Display \n 4) getFront \n 5) getRear \n 6) Out");
    int choice = sc.nextInt();
    switch(choice){
      case 1:
      {
      System.out.println("Enter the Number to Add in queue");
      int num = sc.nextInt();
      MyQueue.EnQueue(num);
      break;
      }
  
      case 2:
      {
        int result = MyQueue.DeQueue();
        System.out.println(result + "This item has been removed");
        break;      
      }
      case 3:
      {
        MyQueue.Display();
        break;
      }
      case 4:
      {
        int Front = MyQueue.getFront();
        System.out.println("Front :" + Front  + "\n");
        break;
      }
      case 5:
      {
        int Rear = MyQueue.getRear();
        System.out.println("Front :" + Rear  + "\n");
        break;
      }
      case 6:
      sc.close();
      System.out.println("Terminated!");
      break;
      default:
      System.out.println("Okkkkkkkkkk!!!!!!!!");
    }}
  }
}
