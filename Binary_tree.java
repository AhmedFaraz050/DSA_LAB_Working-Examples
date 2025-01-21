class Node{
int key;
Node left,right;

public Node(int item) {
    key=item;
    left = right = null;
}
}

class BinaryTree {
    Node root;
    
    BinaryTree(int key) {
        root = new Node(key);
    }
    
    BinaryTree(){
        root = null;
    }
    
    void printPreorder(Node node) {
        if(node==null) 
            return;
        
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    
    void printInorder(Node node) {
        if(node==null) {
            printInorder(node.left);
            System.out.print(node.key+ " ");
            printInorder(node.right);
        }
    }
    
    void printPostorder(Node node){
        if(node==null) {
            return;
        }
        
        printPostorder(node.left);
         printPostorder(node.right);
         System.out.print(node.key + " ");
    }
}

public class Binary_tree {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        
        tree.root=new Node(1);
        Node a = new Node(2);
        tree.root.left=a;
        
        Node b = new Node(3);
        tree.root.left=b;
        
        a.left=new Node(4);
        a.right=new Node(5);
        
        System.out.println("Pre-order");
        tree.printPreorder(tree.root);
        System.out.println("\nPost Order");
        tree.printPostorder(tree.root);
        System.out.println("\nIn Order"); 
        tree.printInorder(tree.root);
        
        
        
    }
}