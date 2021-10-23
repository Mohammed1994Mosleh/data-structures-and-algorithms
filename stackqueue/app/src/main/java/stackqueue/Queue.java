package stackqueue;

public class Queue <T> {
    Node <T> front;
    Node <T> rear;

    public Queue(){
        this.front=null;
        this.rear=null;
    }

    public void enqueue(T value1){
        Node newNode=new Node(value1);
//        System.out.println("hiiiiii");
//        System.out.println(front);

        if(front ==null){
           front=newNode;
       }
       else {        rear.next=newNode;
       }
       rear=newNode;
    }

    public Node dequeue(){
       Node temp =front;
       front =front.next;
       temp.next=null;
       return temp;
    }

    public String toString (){
        Node current=front;
        String result="";
        while (current !=null){
            result +="{ "+current.value +" } ->";
            current=current.next;

        }
        result+="Null";
        return result;
    }

    public T peak(){
        return front.value;

    }

    public boolean ieEmpty(){
        if (front ==null){
            return true;
        }else {return false;}

    }


}
