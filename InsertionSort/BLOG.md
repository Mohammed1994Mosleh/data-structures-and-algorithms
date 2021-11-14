# InsertionSort

- This method takes array of integers as input and return sorted array from small to high integer.

Sample Array: [8,4,23,42,16,15]

## Pass 1:

j=0;

temp=4;

will compare the 4 with 8, when it's less than 8, will assign it equal to 8 and minus 1 from j to become -1 and break the while loop.

then assign arr[j+1] the value of temp which is 4.

* arr[j]=arr[0]=8
temp=arr[i]=4
4<8 ====>first loop
at j=-1 ==>break
arr =[8,8,23,42,16,15]
then apply arr[j+1]=arr[0]=temp=4
arr=[4,8,23,42,16,15]

## Pass 2:
j=1
temp=23

arr[j]=arr[1]=8
temp=arr[i]=23

* while temp > 4 will move to next iteration 


## Pass 3:
j=2
temp=42

arr[j]=arr[2]=23
temp=arr[i]=42

* while temp greater than 23 then move to next iteration


## Pass 4:

j=3
temp=16

arr[j]=arr[3]=42
temp=arr[i]=16
16<42 ===>first loop
after Third iteration 
arr=[4,8,16,23,42,15]

* will compare the 16 with 42, when it's less, will assign it equal to 42 and minus 1 from j to become 2, then compare again 16 is less than 23, so will assign the value of arr[j+1] to be equal 23. then compare again 16 is grater than 8 so will break the loop and assign the value of arr[j+1] to be equal the temp which is 16.

## pass 5:

j=4

temp=15

arr[j]=arr[3]=42
temp=arr[i]=15
15<42 ===>first loop
after Third iteration 

arr=[4,8,15,16,23,42]


* will compare the 15 with 42, when it's less, will assign it equal to 42 and minus 1 from j to become 2, then compare again 15 is less than 23, so will assign the value of arr[j+1] to be equal 23, then compare again 15 is less than 16, so will assign the value of arr[j+1] to be equal 16. then compare again 15 is grater than 8 so will break the loop and assign the value of arr[j+1] to be equal the temp which is 15.

## Efficiency

Time: O(n^2):

The basic operation of this algorithm is comparison. This will happen n*(n-1) number of times…concluding the algorithm to be n squared.

Space: O(1):

No additional space is being created. This array is being sorted in place…keeping the space at constant O(1).