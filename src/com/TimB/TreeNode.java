package com.TimB;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    //constructor
    public TreeNode(int data){
        this.data = data;
    }
    public void insert(int value){
        //handle duplicate data, just return out of loop
        if(value == data){
            return;
        }
        //if value received is less than data, going to left
        //if null create a node or call insert method to add value to left
        if(value < data){
            if(leftChild == null){
                leftChild = new TreeNode(value);
            }else{
                leftChild.insert(value);
            }
        }
        //else going to the right to check if null and create new node
        // or call insert method to add data to right
        else{
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }else{
                rightChild.insert(value);
            }
        }
    }

    //traverse in order from smallest node to largest including the root
    public void traverseInOrder(){
        if(leftChild != null){
            leftChild.traverseInOrder();

        }
        System.out.println(data + " , ");
        //node if left child is null
        if(rightChild != null){
            rightChild.traverseInOrder();
        }
    }
    //
    public int min(){
        if(leftChild == null){
            return data;
        }else{
            return leftChild.min();
        }
    }
    //max
    public int max(){
        if(rightChild == null){
            return data;
        }
        else{
            return rightChild.max();
        }
    }


    //getting a specific value from Tree
    public TreeNode get(int value){
        //if value is found and equals data, return
        if(value == data){
            return this;
        }
        //if value is less than data, search to the left
        //if left tree exist loop through, same for right
        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        }else{
            if(rightChild != null){
                return rightChild.get(value);
            }
        }
        //if no match to value return null
        return null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
