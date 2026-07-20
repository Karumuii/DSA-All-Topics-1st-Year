package ForFinalsz;

public class BinarySearchTree_Sample {

    static BinarySearchTree root;

    static class BinarySearchTree { // Holds the Entire Tree

        BinarySearchTree left;
        BinarySearchTree right;
        int data;

        BinarySearchTree(int data) {
            this.data = data;
        }
    }

    void insert(int value) { // Mangayog Value
        root = insertNode(root, value);
    }

    BinarySearchTree insertNode(BinarySearchTree node, int value) { //Based sa insert na ibutang, verify if empty and if yes butangan niyag value if naay sulod i identify niya whether left or right
        //                      Node = BinarySearchTree, new Name 
        if (node == null) {
            return new BinarySearchTree(value);
        }

        if (value < node.data) {
            System.out.println(value + " goes to LEFT of " + node.data);
            node.left = insertNode(node.left, value);
        } else if (value > node.data) {
            System.out.println(value + " goes to RIGHT of " + node.data);
            node.right = insertNode(node.right, value);
        }
        return node;
    }

    void display(BinarySearchTree node) {
        // Recursive:

        if (node == null) {
            return;
        }
        // if false:
        display(node.left);
        System.out.print(node.data + " ");
        display(node.right);

    }

    public static void main(String[] args) {
        BinarySearchTree_Sample kahoy = new BinarySearchTree_Sample();
        kahoy.insert(45);
        kahoy.insert(15);
        kahoy.insert(79);
        kahoy.insert(90);
        kahoy.insert(1);
        kahoy.insert(10);

        kahoy.display(kahoy.root);
    }
}
