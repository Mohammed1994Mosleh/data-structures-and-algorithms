package trees;

import java.util.List;

public class FizzBuzz {
    BinarySearch <String> returnedTree=new BinarySearch();
    Queue <Integer> queue1=new Queue<>();


    public BinarySearch  fizzBuzz(BinarySearch treeIntegers){
        List<Integer> returnArray=treeIntegers.preOrder(treeIntegers.root);

        if(treeIntegers.root!=null){
            String returnedString="";

            for (Integer item:returnArray){
                Node <Integer> newNode=new Node<>(item);
                queue1.enqueue(newNode);
            }
            while (!queue1.isEmpty()){
              returnedTree.addForqueue(queue1.dequeue());
            }
        }
    }

    public void addForqueue(String returnString){




    }

}
