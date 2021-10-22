package stackqueue;

public class Stack <T> {
    Node<T> top;
    public Stack (){
        this.top=null;
    }
  public void push(T value){
    Node newNode=new Node(value);
    newNode.next=top;
    top=newNode;
  }

  public Node pop(){
    Node current=top;
    top=top.next;
    current.next=null;
    return current;
    }

    public T  peak(){
        return top.value;
    }

    public boolean isEmpty(){
       // System.out.println(top.value);
      if (top.value !=null){
          return false;
      } else {return true;}

    }

    public String toString (){
        Node current=top;
        String result="";
        while (current !=null){
            result +="{ "+current.value +" } ->";
            current=current.next;

        }
        result+="Null";
        return result;
    }

}
