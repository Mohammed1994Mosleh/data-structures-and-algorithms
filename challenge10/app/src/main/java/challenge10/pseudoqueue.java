package challenge10;

public class pseudoqueue<T> {
    Stack <T> stack1=new Stack<T>();
    Stack <T> stack2=new Stack<T>();

    public void enqueue(T value){
        stack1.push(value);

    }

   public Node  dequeue(){
   Node returnNode;
   returnNode=null;
       System.out.println("hifrompse");
        if(! stack1.isEmpty()){
            while(! stack1.isEmpty()){
                System.out.println("hi from while");
                stack2.push((T) stack1.pop());
                System.out.println("2nd");
            }
            returnNode=stack2.pop();
            System.out.println(stack2.isEmpty());
            while (!stack2.isEmpty()){
                System.out.println("3rd");
                stack1.push((T) stack2.pop());

            }
           // returnNode=stack2.pop();
          //  return stack2.pop();
        }

return returnNode;
   }


}
