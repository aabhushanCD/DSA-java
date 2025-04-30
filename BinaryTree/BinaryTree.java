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


    while(true){
    System.out.print("\nEnter the number to search in tree: ");
    int search  = input.nextInt();

    if(tree1.search(search)){
        System.out.println("There is " + search + " in the tree");
    }else{
        System.out.println("There is not " + search + " in the tree");
    }
}
}
}
