/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codechallenge7;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Linkedlist <Integer> test=new Linkedlist<>();
        test.append(1);
        test.append(2);
        test.append(3);
        Node newone=test.kthFromEnd(5);
        System.out.println(newone.value);
        System.out.println( test.head.value);
    }
}