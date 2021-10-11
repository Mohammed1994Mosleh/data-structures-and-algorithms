import java.util.Arrays;
public class insertShiftArray {
    public static void main(String[] args) {
        int [] arr1={1,2,4,8,9,3};
       int [] arr3= insertShiftArray( arr1,5);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] insertShiftArray(int [] arr,int num) {
       int [] newarr=new int [arr.length+1];
       int indexOfnum= arr.length/2;
       for(int i=0;i<newarr.length;i++){
           if(i<indexOfnum){
               newarr[i]=arr[i];
           }else if(i ==indexOfnum){
               newarr[i]=num;
           }else {
               newarr[i]=arr[i-1];
           }

       }
       return newarr;



        //System.out.println(Arrays.toString(newarr));


    }

}