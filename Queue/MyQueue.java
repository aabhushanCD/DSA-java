import java.util.Scanner;

public class MyQueue {

  int[] array = new int[10];
  int head = 0;
  int current = -1;
  public void EnQueue(int a){
    if(current >= array.length-1){
    System.out.println("Queue over flow");
    return;
    }
    else{
      current++;
      array[current] = a;
      System.out.println("added in queue is: " + a);
    }
  }
  public void DeQueue() {
    if (head > current) {
        System.out.println("Queue Underflow — No items to dequeue.");
        head = 0;
        current = -1;
        return;
    }
    
    System.out.println("Item removed: " + array[head]);
    head++;  // Move head to next element
}
  public void Display(){
    System.out.println("All items in the Queue are:\n");
    for(int i=head; i<=current; i++ ){
      System.out.println(array[i]);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    MyQueue qu = new MyQueue();
    

    while(true){
    System.out.println("choose the following:\n 1) Add number in queue \n 2) Remove Number from Queue\n 3) Display all array");
    int choice = sc.nextInt();

    switch(choice){
      case 1:
      int num = sc.nextInt();
      qu.EnQueue(num);
      break;

      case 2:
      qu.DeQueue();
      break;

      case 3:
      qu.Display();
      break;

      default:
      sc.close();
      System.out.println("Wrong input !");
    }

    }
  }
}
