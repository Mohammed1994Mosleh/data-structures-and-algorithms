/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package class05;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
      Linkedlist <Integer> linkedlist1=new Linkedlist<Integer>();
      linkedlist1.insert(1);
        linkedlist1.insert(2);

        System.out.println( linkedlist1.toString());
        System.out.println(linkedlist1.includes(2));

    }
}
