package class89;

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


    public void linkedlistzip(Linkedlist list1,Linkedlist list2){
        Node current1=list1.head;
        Node current2=list2.head;

        while (current1 !=null || current2!=null ){
            System.out.println("hi");
            if(current1 != null){
                append((T) current1.value);
                current1=current1.next;
            }

            if(current2 !=null){
                append((T) current2.value);
                current2=current2.next;
            }
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
