package challenge14;

public class DuckDuckGoose {
    Queue <String> queue1=new Queue<>();
    Queue <String> queue2=new Queue<>();



    public String DuckGoose(String [] duckgoose,int k){

        for(int i=0;i<duckgoose.length;i++){
            queue1.enqueue(duckgoose[i]);
        }
        for(int i=0;i<duckgoose.length-1;i++){
            for(int x=1;x<k;x++){
                queue1.enqueue(queue1.dequeue());
            }
            queue1.dequeue();
        }
        return queue1.dequeue();

    }


  }

