public class toolbox{
  public int BinarySearch(int[] sortedArr, int key){

    //Create start, end, and middle variables
    int startIndex = 0;
    int endIndex = sortedArr.length - 1;
    int middleIndex = (startIndex + endIndex) / 2;

    //loop until the number is found or the number is not in the array
    do{
      //Check if the middle is equal to the key. If it is not equal to the key, set the start or end to the middle based on the whether the key is above or below the middle.
      if(sortedArr[middleIndex] == key){
        return middleIndex;
      }else if(sortedArr[middleIndex + 1] == key){
        return middleIndex + 1;
      }else if(sortedArr[middleIndex] > key){
        endIndex = middleIndex;
      }else if(sortedArr[middleIndex] < key){
        startIndex = middleIndex;
      }
      middleIndex = (startIndex + endIndex) / 2;
    }while(middleIndex >= startIndex && middleIndex <= endIndex);

    //return -1 if the key wasn't found
    return -1;
  }

  public void PrintArray(int[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public int[] SelSort(int[] unsorted) {
    int placeholder;
    for(int unsortedIndex = 0; unsortedIndex < unsorted.length; unsortedIndex++){
      int lowestIndex = unsortedIndex;
      int lowestValue = unsorted[lowestIndex];
      for(int i = unsortedIndex + 1; i < unsorted.length; i++){
        if(unsorted[i] < lowestValue){
          lowestValue = unsorted[i];
          lowestIndex = i;
        }
      }
      placeholder = unsorted[lowestIndex];
      unsorted[lowestIndex] = unsorted[unsortedIndex];
      unsorted[unsortedIndex] = placeholder;
    }
    return unsorted;
  }
}