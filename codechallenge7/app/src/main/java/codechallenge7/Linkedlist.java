package codechallenge7;

public class Linkedlist<T> {
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

    public Node kthFromEnd(Integer value){
        Node current=head;
        int listlengt=0;
        Node returnNode=null;
        while (current.next !=null){
            current=current.next;
            listlengt++;
        }
        current=head;
        for(int i=0;i<=listlengt;i++){
            if(listlengt-i ==value){
               // return current;
                returnNode=current;
            }
            current=current.next;
        }
        return returnNode;
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
