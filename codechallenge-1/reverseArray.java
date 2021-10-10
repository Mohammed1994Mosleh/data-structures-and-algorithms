import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int [] arr1={1,2,3};
        reverseArray( arr1);
    }

    public static void reverseArray(int [] arr) {
    int i2=0;
    int []  reversedArray=new int[arr.length];
       // System.out.println(arr.length);
    for(int i=arr.length-1;i >= 0;i--){
      //  System.out.println(i);
        reversedArray[i2]=arr[i];
       System.out.println(reversedArray[i2]);
       i2++;
    }
        System.out.println(Arrays.toString(reversedArray));


    }

}
