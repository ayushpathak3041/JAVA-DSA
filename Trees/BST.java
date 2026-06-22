public class BST {
    public BST(){

    }

    /// copy paste to BST
    private class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Check if tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Insert value
    public void insert(int value) {// pehle call pe root node bnta hai 
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {// when you check .left/right then you will find null 

        // Create new node if null position found(her nod eyha se bnega)
        if (node == null) {
            return new Node(value);// root = insert(value,root) ke baad humara jo root hai wo to null hai chekc hoga yha pe 
        }

        // Go left
        if (value < node.value) {
            node.left = insert(value, node.left);// yha mila left right so null milega uske baad then add hoga 
        }

        // Go right
        if (value > node.value) {
            node.right = insert(value, node.right);// yha bhi node.lef me null add 
        }

        return node;
    }

    // Search value
    public boolean find(int value) {
        return find(value, root);
    }

    private boolean find(int value, Node node) {

        if (node == null) {
            return false;
        }

        if (value == node.value) {
            return true;
        }

        if (value < node.value) {
            return find(value, node.left);
        }

        return find(value, node.right);
    }

    // Height of tree
    public int height() {
        return height(root);
    }

    private int height(Node node) {

        if (node == null) {
            return -1;
        }

        return Math.max(
                height(node.left),
                height(node.right)
        ) + 1;
    }

    // Display tree
    public void display() {
        display(root, "Root Node : ");
    }

    private void display(Node node, String details) {

        if (node == null) {
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    // Inorder Traversal
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {

        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
    // Check if complete tree is balanced
public boolean balanced() {

    // Root se check start karenge
    return balanced(root);
}

private boolean balanced(Node node) {

    // Null node always balanced hota hai
    if (node == null) {
        return true;
    }

    // Current node ka balance factor nikal rahe hain
    // Height difference 1 se zyada nahi hona chahiye

    return Math.abs(height(node.left) - height(node.right)) <= 1

            // Left subtree bhi balanced hona chahiye
            && balanced(node.left)

            // Right subtree bhi balanced hona chahiye
            && balanced(node.right);
}
// User sorted array pass karega
public void populateSorted(int[] nums) {

    populateSorted(nums, 0, nums.length);
}

private void populateSorted(int[] nums, int start, int end) {

    // Jab range khatam ho jaye
    // recursion stop

    if (start >= end) {
        return;
    }

    // Middle element nikal rahe hain
    // Ye current subtree ka root banega

    int mid = (start + end) / 2;

    // Middle value insert kar do

    insert(nums[mid]);

    // Left half se left subtree banega

    populateSorted(nums, start, mid);

    // Right half se right subtree banega

    populateSorted(nums, mid + 1, end);
}
// Root Left Right
public void preorder() {
    preorder(root);
    System.out.println();
}

private void preorder(Node node) {

    if (node == null) {
        return;
    }

    System.out.print(node.value + " ");

    preorder(node.left);

    preorder(node.right);
}
// Left Right Root
public void postorder() {
    postorder(root);
    System.out.println();
}

private void postorder(Node node) {

    if (node == null) {
        return;
    }

    postorder(node.left);

    postorder(node.right);

    System.out.print(node.value + " ");
}
public void prettyDisplay() {
    prettyDisplay(root, 0);
}

private void prettyDisplay(Node node, int level) {

    if (node == null) {
        return;
    }

    // Right subtree pehle print
    prettyDisplay(node.right, level + 1);

    if (level != 0) {

        for (int i = 0; i < level - 1; i++) {

            // Indentation create kar rahe hain
            System.out.print("|\t\t");
        }

        System.out.println("--------->" + node.value);

    } else {

        // Root print
        System.out.println(node.value);
    }

    // Left subtree print
    prettyDisplay(node.left, level + 1);
}
}














// // Insert value
// public void insert(int value) {

//     // Ye public method hai jo user call karega.
//     // Pehli baar root null hoga.
//     // Recursive function jo node return karega,
//     // usse root mein store kar denge.

//     root = insert(value, root);
// }

// private Node insert(int value, Node node) {

//     // Har recursive call mein hum current node par khade hote hain.
//     // Hum check karte hain ki value ko left jaana hai ya right.

//     // Base Case:
//     // Agar current position null hai,
//     // iska matlab hume insert karne ki jagah mil gayi.

//     if (node == null) {

//         // Naya node banao aur return kar do.
//         // First insertion mein ye node root banega.
//         // Baad mein ye parent ke left ya right mein attach hoga.

//         return new Node(value);
//     }

//     // Agar insert karne wali value current node se chhoti hai
//     // to BST rule ke hisab se left subtree mein jayegi.

//     if (value < node.value) {

//         // Recursively left side mein jao.
//         // Jab null milega to naya node create hoga.
//         // Return hote waqt us node ko node.left mein attach kar denge.

//         node.left = insert(value, node.left);
//     }

//     // Agar value current node se badi hai
//     // to BST rule ke hisab se right subtree mein jayegi.

//     if (value > node.value) {

//         // Recursively right side mein jao.
//         // Jab null milega to naya node create hoga.
//         // Return hote waqt us node ko node.right mein attach kar denge.

//         node.right = insert(value, node.right);
//     }

//     // Current node ko return kar rahe hain.
//     // Ye bahut important hai.
//     // Isse recursion unwind hote waqt poora tree reconnect rehta hai.

//     return node;
// }