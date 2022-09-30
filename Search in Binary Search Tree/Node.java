class Node{
    int val;
    Node left;
    Node right;

    public Node(int val){
        this.val=val;
    }

    public Node(Node left, Node right, int val){
        this.left=left;
        this.right=right;
        this.val=val;
    }
}