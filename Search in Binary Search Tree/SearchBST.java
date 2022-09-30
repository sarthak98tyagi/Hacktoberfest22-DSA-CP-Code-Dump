
class SearchBST{

    public static Node search(Node root, int val) {
        if(root==null)
            return root;
        if(root.val==val)
            return root;
        if(root.val>val)
            return search(root.left,val);
        else
            return search(root.right,val);
    }

    public static void main(String[] args){
        Node root = new Node(10);
        Node n1 = new Node(5);
        Node n2 = new Node(1);
        Node n3 = new Node(7);
        Node n4 = new Node(15);
        Node n5 = new Node(12);
        Node n6 = new Node(18);

        root.left=n1;
        n1.left=n2;
        n1.right=n3;
        root.right=n4;
        n4.left=n5;
        n4.right=n6;

        /*
                10
               /   \
              5     15
             / \    / \
            1   7  12  18
        */
        int value = 7;
        Node answer = search(root,value);
        if(answer==null)
            System.out.println("Node with value "+value+" does not exists in binary search tree");
        else
            System.out.println("Node with value "+value+" found in binary search tree");
        
    }
}