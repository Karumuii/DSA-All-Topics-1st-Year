package ForFinalsz;
// 5/8/26
public class BinaryTree_Sample {
    
    BinTree root;

    static class BinTree{
        BinTree left;
        BinTree right;
        int data;

        BinTree(int data){ //Constructor
            this.data = data;
        }

    }
    void createTreee(){
        BinTree first = new BinTree(1);
        BinTree second = new BinTree(2);
        BinTree third = new BinTree(3);
        BinTree fourth = new BinTree(4);
        BinTree fifth = new BinTree(5);
        
      /*    First sample:
        root = third;
        third.left = first;
        third.right = second;

        first.right = fifth;
        second.left = fourth;
        */

        root = first;
        first.left = fifth;
        first.right = third;

        fifth.left = fourth;
        fifth.right = second;
    }
    void display(BinTree node){
        //Recursive

        // Base case
        if (node == null){
            return;
        } 
        // if false:
        //      Progress
        display(node.left);
        System.out.print(node.data + " ");
        display(node.right);
    }
    
    public static void main(String[] args) {
         BinaryTree_Sample biTree = new BinaryTree_Sample();
          biTree.createTreee();
          biTree.display(biTree.root);
         
/*
        Node of Binary Tree :
        left, right, data
          
          
   Tuesday Activity: 
      Concept Binary Tree and Binary Search Tree

      Binary Tree and Binary Search Tree Coding sa Friday

*/ 
         
         
    }
}
