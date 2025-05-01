import java.lang.reflect.Array;
import java.util.Scanner;

public class BinaryTree {

public class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}

Node root = null;

public void Insert(int value) {
    root = Insert(root, value);
}

public Node Insert(Node current, int value) {
    if (current == null) {
        return new Node(value);
    }
    if (value <= current.data) {
        current.left = Insert(current.left, value);
    } else {
        current.right = Insert(current.right, value);
    }
    return current;
} 

// BFS implementation
    public class MyQueue{
        int front=0;
        int rear=0;
        Node[] array = new Node[100];

    public boolean isEmpty(){
        return front == rear;
    }
    public void enqueue(Node node){
        if(rear == array.length){
            System.out.println("Queue is full");
            return;
        }
        array[rear++] = node;
    }

    public Node dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return array[front++];
        }
    }


// DFS search 

public class MyStack{
    int top = -1;
    Node[] array = new Node[100];
    
    public void PushStack(Node node){
        if(top == array.length-1){
            System.out.println("Stack is full");
            return;
        }
        array[++top] = node;
    }
    public Node PopStack(){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
    return array[top--];
    }
}

public void DFS() {
    if(root == null){
        System.out.println("No element in Tree DFS error");
        return;
    }
MyStack stack1 = new MyStack();
stack1.PushStack(root);
    while(stack1.top != -1){
        Node current = stack1.PopStack();
        System.out.print(current.data + " ");
        if(current.right != null){ 
            stack1.PushStack(current.right);
        }
        if(current.left !=  null){
            stack1.PushStack(current.left);
        }
    } 
}


// Correct inorder traversal
public void inOrder(Node current) {
    if (current != null) {
        inOrder(current.left);
        System.out.print(current.data + " ");
        inOrder(current.right);
    }
}
public void preOrder(Node current){
    if(current != null){
        System.out.print(current.data + " ");
        preOrder(current.left);
        preOrder(current.right);
    }
}
public void preOrderTraversal(){
    preOrder(root);
}

public void inOrderTraversal() {
    inOrder(root);   // start from root
}

public void postOrderTraversal(){
    postOrder(root);
}
public void postOrder(Node current){
    if(current != null){
        postOrder(current.left);
        postOrder(current.right);
        System.out.print(current.data + " ");
    }
}
public boolean search(int value){
    return search(root, value);
}
public boolean search (Node current, int value){
    if(current == null){
        return false;
    }
    if(current.data == value){
        return true;
    }
    else if(current.data > value){
        return search(current.left, value);
    }
    else if(current.data < value){
        return search(current.right, value);
    }
    return false;
}

//  Breadth first Search
public void levelOrder(){
    if(root == null)return;
    MyQueue q = new MyQueue();
    q.enqueue(root);

    while(!q.isEmpty()){
        Node current = q.dequeue();
        System.out.print(current.data + " ");
        if(current.left != null)  q.enqueue(current.left);
        if(current.right !=null) q.enqueue(current.right);
    
    }

}

public static void main(String[] args) {
    int[] array = {5, 3, 45, 67, 2, 34, 5};
    BinaryTree tree1 = new BinaryTree();
    Scanner input = new Scanner(System.in);
    
    for (int a : array) {
        tree1.Insert(a);
    }
    System.out.println();
    System.out.println("Inorder Traversal of Tree:");
    tree1.inOrderTraversal();
    System.out.println();
    System.out.println("preOrder Traversal of Tree");
    tree1.preOrderTraversal();
    System.out.println();
    System.out.println("postOrder Traversal of Tree");
    tree1.postOrderTraversal();
    System.out.println();
    System.out.println("\nLevel Order Traversal:");
    tree1.levelOrder();
    System.out.println("\n DFS:");
    tree1.DFS();

    while(true){
        System.out.print("\nEnter the number to search in tree: ");
        int search  = input.nextInt();
        if(search == -1){
            System.out.println("Exiting...");
            break;
        }
        if(tree1.search(search)){
            System.out.println("There is " + search + " in the tree");
        }else{
            System.out.println("There is not " + search + " in the tree");
        }
    } 
    input.close();
    }
}
