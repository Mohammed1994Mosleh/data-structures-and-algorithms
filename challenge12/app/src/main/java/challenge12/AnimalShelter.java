package challenge12;

public class AnimalShelter {
    Queue  cats = new Queue() ;
    Queue  dogs = new Queue() ;

    int countCat = 0;
    int countDog = 0;

    public void enqueue(String animal){
        if(animal =="cat" ||animal =="Cat"){
            cats.enqueue("cat");
            countCat++;
        }else if (animal.equals("dog") || animal.equals("Dog")){
            dogs.enqueue("dog");
            countDog++;
        }else {
            System.out.println("Please enter cat or dog");
        }
    }

    public Node dequeueDog(){
        countDog--;
        return dogs.dequeue();
    }

    public Node dequeueCat(){
        countCat--;
        return cats.dequeue();
    }

    public Node deqPrefer(){
        if(cats.isEmpty()){
            countDog--;
            return dequeueDog();
        }
        if(dogs.isEmpty()){
            countCat--;
            return dequeueCat();
        }
        if(countCat > countDog){
            countCat--;
            return dequeueCat();
        }else{
            countDog--;
            return dequeueDog();
        }
    }



}
