/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mergesort;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        int arr[] = { -1,2,5,0,-5,10};

        MergeSort test = new MergeSort();
        test.mergeSorting(arr, 0, arr.length - 1);

        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }




    }
}
