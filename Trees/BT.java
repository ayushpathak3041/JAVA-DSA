import java.util.Scanner;
public class BT{ 
    private Node root;
    public BT(){
    }
    private static class Node{// Node class insied main class
    int value ;
    Node left;
    Node right;

    public Node(int value){
        this.value=value;
    }
}
   

    // insert value
    public void populate(Scanner sc){// yha hum root node bna rhe hai ok
        System.out.println("ENter root Node:");
        int value = sc.nextInt();
        root = new Node(value);// root node 
        populate( sc , root);// then calling a function 
    }
    private void populate(Scanner sc , Node node){// yha pe recursion hai aur yha pe hi node bn rha left right ka
        System.out.println("Do you want to Add left:"+ node.value);
        boolean left = sc.nextBoolean();
          if(left){
            System.out.println("ENter the value of left of"+ node.value);
            int value = sc.nextInt();
            node.left=new Node(value);
            populate(sc, node.left);// loop ki tarah hum har baar uper leke ja rhe call ker de rhe 
          }

          System.out.println("Do you want to Add right:"+node.value);
        boolean right = sc.nextBoolean();
          if(right){
            System.out.println("ENter the value of right of"+node.value);
            int value = sc.nextInt();
            node.right=new Node(value);
            populate(sc, node.right);// loop ki tarah uper leke jaake call ker de rhe fir niche aayega 
          }
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    public void prettyDisplay(Node node,int level){
        if(node==null){
            return;
        }
        // GO to RIGHT
        prettyDisplay(node.right,level+1);
        // PRINT NODE
        if(level!=0){
            for(int i =0;i<level-1;i++){
                System.out.println("|\t\t");           
             }
             System.out.println("--------->"+node.value);
        }else{
            System.out.println(node.value);
        }
        // Go to Left
        prettyDisplay(node.left,level+1);

    }
    // preOrder treversal------------
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
       if(node==null){
        return;
       }
       System.out.print(node.value+" ");// node preint then left 
       preOrder(node.left);
       preOrder(node.right);
       // (print root --> root.left --> if parent node print ---> node.left if child then print -->node.right print

    }
    /// InOrder---------
    public void InOrder(){
        InOrder(root);
    }
      public void InOrder(Node node){
       if(node==null){
        return;
       }
       // node preint then left 
       InOrder(node.left);
       System.out.print(node.value+" ");
       InOrder(node.right);
    }   

    // PostOrder------------
      public void postOrder(){
        postOrder(root);
    }
      public void postOrder(Node node){
       if(node==null){
        return;
       }
       // node preint then left 
       postOrder(node.left);
       postOrder(node.right);
       System.out.print(node.value+" ");
    }   
}
