package class05;

public class Linkedlist<T>{
    Node<T> head;

    public Linkedlist (){
        this.head=null;
    }
    public void insert(T value){
      Node newNode=new Node(value);
      newNode.next=head;
      head=newNode;
    }

    boolean includes(T value){
        Node current=head;
        while(current !=null){
          if(current.value.equals(value)){
              return true;
          }
          current=current.next;
        }
        return false;
    }

    public String toString (){
        Node current=head;
        String result="";
        while (current !=null){
            result +="{ "+current.value +" } ->";
            current=current.next;

        }
        result+="Null";
        return result;

    }
}
