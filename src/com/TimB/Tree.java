package com.TimB;

public class Tree {
    private TreeNode root;


    public TreeNode get(int value) {
        //if there is a root, call get()
        // to search for root value in tree
        if(root != null){
            return root.get(value);
        }
       //if no value found return null
       //tree is null and value won't be in tree
       return null;
    }
    //delete leaf node
    public void delete(int value){
    root = delete(root, value);
    }
    private TreeNode delete(TreeNode subtreeRoot, int value){
        if(subtreeRoot == null){
            return null;
        }
        if(value < subtreeRoot.getData()){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if (value > subtreeRoot.getData()){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else{
            //left node, set left or right to null, and replace with left or right
            //node to delete has 0 or 1 child
            if(subtreeRoot.getLeftChild() == null){
               return subtreeRoot.getRightChild();
            }
            else if(subtreeRoot.getRightChild() == null){
                return subtreeRoot.getLeftChild();
            }
        }
        //if node to delete is not found return the original node
        return subtreeRoot;
    }

    public void insert(int value){
        //check for a root, if null the value will be the root
        //else the root will call method insert on TreeNode.java
        // and the value will be added to left or right
        if(root == null){
            root = new TreeNode(value);
        }else{
            root.insert(value);
        }
    }
    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }
    //if root is null, return minimum integer value, else return root min
    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else{
            return root.min();
        }
    }
    //if root is null, return max integer value, else return root max
    public int max(){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        else{
            return root.max();
        }
    }

}
