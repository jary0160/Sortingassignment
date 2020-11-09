
package Sorting;

public static void bubbleSort(int[] myNumbers){
   	int k = 0;
   	boolean exchangeMade = true;
	// Make up to n - 1 passes through array, exit 
	//early if no exchanges are made on previous pass
  
 	while ((k < myNumbers.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < myNumbers.length - k; j++) { 
         		if (myNumbers[j] > [j + 1]){
            			swap(myNumbers, j, j + 1);		 
            			exchangeMade = true;
         		}//end if
		}//end for
	}//end while

}
public static void swap(int[] a, int x, int y){
   int temp = a[x];
   a[x] = a[y];
   a[y] = temp;
}
