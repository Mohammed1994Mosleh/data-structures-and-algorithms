package codechallenge6;

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

  public Node returnnode(int value){
        int count=0;
        Node returnnode=new Node( 0);

        Node current=head;
        while(current.next !=null){
          count++;
current=current.next;
        }
      current=head;
      System.out.println(count);
      if(value<=count){

          while(current !=null){
              if(count-value ==0 ){
                //  return current;

                  returnnode= current;
//                  return returnnode
                //  break;
              }
              current=current.next;
              count--;
          }
      }
      else {
          System.out.println("hiiii from else");
          returnnode= null;
      }
      System.out.println("hiii");
return returnnode  ;
    }
}


