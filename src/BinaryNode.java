 class BinaryNode<T> {
    T data;
    BinaryNode<T> Left;
    BinaryNode<T> Right;
    BinaryNode<T> R1right;
    public BinaryNode(T data){
        this.data=data;
    }
}
class Test{
    public static void main(String[] args) {
        BinaryNode<Integer> root = new BinaryNode<>(15);
        BinaryNode<Integer>Rleft = new BinaryNode<>(10);
        BinaryNode<Integer>Rright = new BinaryNode<>(20);
        root.Left=Rleft;
        root.Right=Rright;
        Print(root);
    }

public static void Print(BinaryNode root){
        if(root==null){
            return;
        }
    System.out.println(root.data);
        Print(root.Left);
        Print(root.Right);
    }
}
