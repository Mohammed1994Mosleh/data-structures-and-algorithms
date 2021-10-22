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

    public void insertBefor(T value1,T value2){
        Node newNode=new Node(value2);
        Node current=head;

        if( current.value ==value1){
            newNode.next=head;
            head=newNode;
        }else {
            while (current.next !=null){
                if(current.next.value ==value1 ){
                    newNode.next=current.next;
                    current.next=newNode;
                    break;
                }
                current=current.next;

            }
        }



    }

    public void insertAfter(T value1,T value2){
        Node newNode=new Node(value2);
        Node current=head;


        if(current.next ==null && current.value==value1 ){

            current.next=newNode;
            newNode.next=null;
        }else {
            while (current != null){
                if(current.value ==value1){
                    newNode.next=current.next;
                    current.next=newNode;
                }
                current=current.next;
            }
        }

    }
public Boolean symmetric(Linkedlist listt){
        Node node1=new Node(0);
        Node node2=new Node(0);
        Node current= listt.head;
    Node current2= listt.head;


    int count =0;
        int count2=1;
        while (current !=null){
            count++;
            current=current.next;
        }
    System.out.println(count);
        current= listt.head;
        node1= listt.head;
        int savecounter=count/2;


        while(count >savecounter+1){
            current= listt.head;
            System.out.println(count);
            for(int i=0;i<=count;i++){

                if (i ==count){
                    node2=current;
                }
                current=current.next;
            }
            count--;
            System.out.println("count");
            current2=listt.head;
            for(int i=0;i<count2;i++){

                if(i ==count2){
                    node1=current;
                }
                current2=current2.next;
            }
            count2++;
            if(node1.value!= node2.value){
                System.out.println(node1);
                System.out.println(node2);
                return false;

            }

        }




return true;
}


    public Node reverseList(Node temp){
        Node current = temp;
        Node prevNode = null, nextNode = null;

        //Swap the previous and next nodes of each node to reverse the direction of the list
        while(current != null){
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }


    public boolean symettri(){


    Node current = head;
    boolean flag = true;
    int count =0;
    Node current2=head;

    while (current2 !=null){
        count++;
        current2=current2.next;
    }
    int size=count;

    //Store the mid position of the list
    int mid = (size%2 == 0)? (size/2) : ((size+1)/2);

    //Finds the middle node in given singly linked list
    for(int i=1; i<mid; i++){
        current = current.next;
    }

    //Reverse the list after middle node to end
    Node revHead = reverseList(current.next);

    //Compare nodes of first half and second half of list
    while(head != null && revHead != null){
        if(head.value != revHead.value){
            flag = false;
            break;
        }
        head = head.next;
        revHead = revHead.next;
    }

    if(flag){
        System.out.println("true");
    }

    else{
        System.out.println("Given singly linked list is not a palindrome");
    }
    return flag;
}

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();


    }



    public void reverse() {
        Node pointer = head;
        Node previous = null,current = null;
                while (pointer != null) {
                    current = pointer;
                    pointer = pointer.next;
                    // reverse the link
                     current.next = previous;
                     previous = current;
                     head = current;
                } }


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
