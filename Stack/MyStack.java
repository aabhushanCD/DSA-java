
import java.util.Scanner;

public class MyStack {
  int[] array = new int[20];
  int top = -1;

  public void push(int a){
    if(top == 9){
      System.out.println("Nothing is in stack");
      return;
    }
    else{
      top++;
      array[top] = a;
      System.out.println("Pushed: " + a);
    }
  }
  public void pop(){
    if(top < -1){
      System.out.println("Stack is enpty cannot pop");
      return;
    }
    else{
      System.out.println("poped item :" + array[top]);
      array[top] = 0;
      top--;
    }
  }
  public void peek(){
  if(!(top < 0)){
    System.out.println("Current index is in: " + top + "and Value is :" + array[top]);
  }
}
  public void Display(){
  System.out.println("Stack Contains:");
    for(int i= 0; i<= top; i++){
      System.out.println(array[i]);
    }
  }
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  MyStack st = new MyStack();
  while(true){
  System.out.println("Plese choose number: \n 1) Display all stack items \n 2) Push number\n 3) Pop numbers \n 4)Peek number");
  int choice = sc.nextInt();

  switch(choice){
    case 1:
    st.Display();
    break;
    
    case 2:
    System.out.println("Enter the number to push onto the stack:");
    int number = sc.nextInt();
    st.push(number);
    break;

    case 3:
    st.pop();
    break;

    case 4:
    st.peek();
    break;

    default:
    sc.close();
    System.out.println("Sorry please Enter the above valid number");
    return;
  }
}
  }
}
