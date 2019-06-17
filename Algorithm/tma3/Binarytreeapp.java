
package tma3;


public class Binarytreeapp {
    
    public static void main(String[] args) {
         Binarytree a = new Binarytree(); 
         Node root=a.createNewNode(10);
         root.left = a.createNewNode(5);
         root.right = a.createNewNode(20);
         root.left.left = a.createNewNode(4);     
         root.left.left.left = a.createNewNode(0);
         root.left.right= a.createNewNode(6);
         root.left.right.right= a.createNewNode(7);
         root.left.right.right.right= a.createNewNode(8);
         root.right.right=a.createNewNode(30);
         root.right.left=a.createNewNode(15);
         root.right.left.left=a.createNewNode(13);
         
         
         
        System.out.println("Total number of nodes: " + a.getTotalnumberofnodes(root)); // Display total number of nodes
         
         System.out.println("Preordr: ");                     
         a.preorder(root);                           // Display  preorder  
         System.out.println("");  
         
         
         System.out.println("Postorder: ");         
        a.postorder(root);                        // Display  postorder             
         System.out.println("");
         
    }
     
     
    
    
    
    
}
