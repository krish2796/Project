
package tma3;

    public class Binarytree {

        public Node createNewNode(int k){
            Node a= new Node();
            a.data=k;
            a.left=null;
            a.right=null;
            return a;    
        }

        public int getTotalnumberofnodes(Node node){ // implementing total number of nodes

           if (node==null){
               return 0;
            }

           return 1 + getTotalnumberofnodes(node.left) + getTotalnumberofnodes(node.right);

       } 
    
   public void preorder(Node node){          // implementing preorder for binary tree
        
        if(node == null){
            return;
        }
        System.out.println(node.data +" ");
        preorder(node.left);
        preorder(node.right);
        
    } 
     
    
    public void postorder(Node node){  
     if(node == null){
            return;
        }
     preorder(node.left);
     preorder(node.right);
     System.out.println(node.data +" ");
        
        
    }
}
