package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTree<T> {

    public List<T> preOrderList = new ArrayList<>();
    public List<T> inOrderList = new ArrayList<>();
    public List<T> postOrderList = new ArrayList<>();
    List<Node> listBreath = new ArrayList<Node>();
    List<Integer> orderList = new ArrayList<>();
    public Node<T> root;

    public BinaryTree() {
    }

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public List<T> preOrder(Node<T> root) {
        try {
            preOrderList.add(root.value);
            if (root.leftChild != null) preOrder(root.leftChild);
            if (root.rightChild != null) preOrder(root.rightChild);
        } catch (NullPointerException exception) {

            System.out.println(exception.getMessage());
        }
        return preOrderList;
    }

    public List<T> inOrder(Node<T> root) {

        try {
            if (root.leftChild != null) inOrder(root.leftChild);
            inOrderList.add(root.value);
            if (root.rightChild != null) inOrder(root.rightChild);
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        return inOrderList;
    }

    public List<T> postOrder(Node<T> root) {
        try {
            if (root.leftChild != null) postOrder(root.leftChild);
            if (root.rightChild != null) postOrder(root.rightChild);
            postOrderList.add(root.value);
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        return postOrderList;
    }

    public Integer getMax() {

        if (root == null) {
            return 0;
        } else {
            List<Integer> maxArray = preOrder((Node) root);
            return Collections.max(maxArray);
        }
    }


    public ArrayList<Integer> breadthFirstTree(Node tree){

        listBreath.add(tree);
        while (listBreath.size()!=0) {
            Node node= listBreath.get(0);
            orderList.add((Integer) node.value);
            listBreath.remove(0);
            if(node.leftChild != null){
                listBreath.add(node.leftChild);
            }
            if(node.rightChild != null){
                listBreath.add(node.rightChild);
            }

        }
        return (ArrayList<Integer>) orderList;
    }

//    public BinaryTree <Integer> fizzBuzz(BinaryTree treeIntegers){
//        BinaryTree <Integer> returnedTree=new BinaryTree<>();
//        List <Integer> returnArray=treeIntegers.preOrder(treeIntegers.root);
//        for(Integer item:returnArray){
//            if(item%3==0){
//                returnedTree.
//            }
//        }
//
//
//
//
//    }




    @Override
    public String toString() {
        if (preOrderList.isEmpty() && inOrderList.isEmpty() && postOrderList.isEmpty()) return "Empty List";
        return "preOrderList=" + preOrderList +
                ", inOrderList=" + inOrderList +
                ", postOrderList=" + postOrderList;
    }



}