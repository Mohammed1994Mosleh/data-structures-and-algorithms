/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge14;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        String [] stringgtest={"A", "B", "C", "D", "E" };
        DuckDuckGoose test=new DuckDuckGoose();
        String finalString= test.DuckGoose(stringgtest,3);
        System.out.println(finalString);

    }

//    public static void returnString(String [] duckdooose,int k){
//
//
//     while
//        int x=0;
//
//        int playerPos = k % duckdooose.length;
//        if(playerPos ==0){
//            x=duckdooose.length-1;
//
//        }else{
//         x=   playerPos-1;
//        }
//        System.out.println(x);
//
//


////        ArrayList <String> newOne=new ArrayList<>(Arrays.asList(duckdooose));
////        System.out.println(newOne);
////        System.out.println(newOne);
////       int current=0;
////       boolean flag=true;
////        while (newOne.size()>1){
////            int count=0;
////            if(flag){
////                current=current+k-1;
////            }else {
////                current=current+k;
////            }
//////            System.out.println(current);
////
////            if(current>newOne.size()-1){
////               // System.out.println(current);
////                for(int i=current-3;i<newOne.size();i++){
////
////                   count++;
////
////                }
////                System.out.println(count);
////                current=k-count-1;
////
//////                current=current-newOne.size()-1;
////
////            }
////          //  System.out.println(current);
////          flag =false;
////           // System.out.println(current);
////            newOne.remove(current);
////        }
//
//    }
}
