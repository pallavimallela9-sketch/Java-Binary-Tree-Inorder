import java.util.Scanner;

public class InorderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node createTree(Scanner sc) {

        System.out.print("Enter node value (-1 for no node): ");
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        }

        Node node = new Node(value);

        System.out.println("Enter left child of " + value);
        node.left = createTree(sc);

        System.out.println("Enter right child of " + value);
        node.right = createTree(sc);

        return node;
    }

    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Create Binary Tree");
        Node root = createTree(sc);

        System.out.print("Inorder Traversal: ");
        inorder(root);

        sc.close();
    }
}
