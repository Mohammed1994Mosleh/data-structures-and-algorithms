/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InsertionSort;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        Insertionsort testInsert=new Insertionsort();

        int [] testArray= {8,4,23,42,16,15};

        int [] retrnArray=testInsert.insertionSort(testArray);

        for (int item:retrnArray){
            System.out.println(item);
        }






    }
}
