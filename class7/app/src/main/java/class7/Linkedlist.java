package class7;

public class Linkedlist <T> {
    Node<T> head;
    public Linkedlist (){
        this.head=null;
    }

    public void insert(T value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }
    public void append(T value) {
        Node newNode=new Node(value);

        if(head !=null){
            Node current=head;
            while (current.next !=null){
                current=current.next;
            }
            current.next=newNode;
        }    else {
            head=newNode;
        }
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
