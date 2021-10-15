class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int [] arr1={2};
    int x0=2;
    int index=intFinder(arr1, x0);
    System.out.println(index);
  }
public static int intFinder(int [] arr,int x){
int index=-1;
int x1=0;
int x2=arr.length;
int middel=arr.length;
// while(x !=arr[middel]){
// middel=middel/2;
// if(x == middel){
// index =middel;
// return middel;
// }else if(x<middel){
//   x1=middel-(x2-x1)/2;
//   x2=middel;

// }else{
//    x2=middel+(x2-x1)/2
//   x1=middel;
 
// }
// }
do{
 middel=middel/2;
if(x ==arr[middel] ){
index =middel;
// return middel;
break;
}else if(x<arr[middel] ){
  x1=middel-(x2-x1)/2;
  x2=middel;

}else{
   
  x1=middel;
  x2=middel+(x2-x1)/2;
  System.out.println(x2);

 
} 

}while(x2-x1 >2);
System.out.println(x1);
System.out.println(x2);
if(index ==-1){
for(int i=x1+1;i<x2+2;i++){
  if(i<arr.length-1){
System.out.println("hi");
  if(arr[i] == x){
  index=i;
  }
  }else{
   
  }
  
}
}

int length =arr.length;
if(index !=-1){
  if(length %2 !=0){
    index ++;
  }
}


return index;
}

}