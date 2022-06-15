import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Clear the console
    System.out.print("\033[H\033[2J");
    System.out.flush();

    // Create Variables
    int foundIndex;
    
    // Create a toolbox object
    toolbox tools = new toolbox();

    // Create a scanner object
    Scanner scanner = new Scanner(System.in);

    //Get key from user
    System.out.println("Please type a key to search for:");
    int key = scanner.nextInt();
    scanner.nextLine();

    //Create the array from a file and sort it
    int[] searchArr = files.read("inputInts.txt");
    int[] sortedArr = tools.SelSort(searchArr);
    System.out.println();
    System.out.print("Array: ");
    tools.PrintArray(sortedArr);

    //Use Binary Search method to get an index
    foundIndex = tools.BinarySearch(sortedArr, key);

    System.out.println();

    //Print where the key was found or that it was not found
    if(foundIndex >= 0){
      System.out.println("Key was found in the array at index " + foundIndex);
    }
    else{
      System.out.println("Key was not found in the array.");
    }
  }
}