## code28Blog

### QuickSort:

- QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.

### Pseudo code

ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp


### big O notation
- Time complexity: O(n^2)

- Space complexity: O(1)



 ### Trace:

* Tracing QuickSort([8,4,23,42,16,15],0,5)


#### First QuickSort for main arr

- is 0<5 yes then 
  - position =partition ([8,4,23,42,16,15],0,5)
  - pivot=arr[5]=15
  -low=0-1=-1
  - loop from (0-4)
  - i=0 -->
   - (4<15) 
     -low=0+1
     - swap([8,4,23,42,16,15],0,0)-->arr=[8,4,23,42,16,15]
     
 
  - i=2
     (23>15) ===>move to next iteration 

   - i=3
     (42>15)===>move to next iteration

   - i=4
     (16>15)===>break
   
 - swap([8,4,23,42,16,15],5,2) ===>arr=[8,4,15,42,16,23]

 - position =2



 #### QuickSort for left arr

 - QuickSort for left arr 
 -QuickSort([8,4,15,42,16,23],0,1)

 - (0<1)

- position =partition ([8,4,23,42,16,15],0,1)
  - pivot=arr[1]=4
  - low=0-1=-1
  - loop from (0-0)
   - i=0 -->
     - (8<15) 
     - low++=0
     - swap([8,4,23,42,16,15],0,0)-->arr=[8,4,23,42,16,15]

   - swap([8,4,23,42,16,15],1,0) ===> arr=[4,8,23,42,16,15]
   - position =0

   - QuickSort([4,8,23,42,16,15],0,-1)
   - 0>-1 ===>break 

   - QuickSort([4,8,23,42,16,15],1,1)
   - 1=1 ===>break 

 #### QuickSort for Right arr

 - QuickSort([4,8,23,42,16,15],3,5)

  - pivot=arr[5]=23
  - low=3-1=2
  - loop from (3-4)
     - i=3
       (42>23)===>move to next iteration
     - i=4 -->
       - (16<23) 
       - low++=3
       - swap([4,8,15,42,16,23],4,3)-->arr=[4,8,15,16,42,15]

    - swap([4,8,15,16,42,23],5,4)-->arr=[4,8,15,16,23,42]


 -QuickSort([4,8,15,16,42,23],3,3) ===>The same array
 
 - QuickSort([4,8,15,16,42,23],5,5) ===>The same array


      


   














