/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package class89;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Linkedlist <Integer> list1=new Linkedlist<>();
        Linkedlist <Integer> list2=new Linkedlist<>();
        list1.append(1);
        list1.append(10);

        list2.append(2);
        list2.append(3);
        list2.append(4);
        list2.append(5);


        Linkedlist <Integer> list3=new Linkedlist<>();
        list3.linkedlistzip(list1,list2);
        //list3.append(4);


        System.out.println(list3.toString());



        System.out.println(new App().getGreeting());
    }
}