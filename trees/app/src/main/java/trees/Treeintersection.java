package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Treeintersection {
    HashMap<Integer , Integer> returnValues=new HashMap<>();
    ArrayList<Integer> returnValuee=new ArrayList<>();

    public ArrayList<Integer> duplicateValues(BinarySearch tree1, BinarySearch tree2){
     List<Integer> list1=tree1.preOrder(tree1.root);
     List<Integer> list2=tree2.preOrder(tree2.root);

     for(Integer item :list1){
         returnValues.put(item,item);
     }
     for(Integer item:list2){
         System.out.println(item);
         if(returnValues.containsValue(item)){
             System.out.println(item);
             returnValuee.add(item);
         }else {
             returnValues.put(item,item);
         }
     }

return returnValuee;
    }
}
