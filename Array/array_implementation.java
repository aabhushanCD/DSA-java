  import java.lang.*;
import java.util.Scanner;

  public class array_implementation {
    public static void main(String[] args){
      // input object for taking user input
      Scanner Input = new Scanner(System.in);
    int [] array = new int[5];
      array[0] = 10;
      array[1] = 100;
      array[2] = 1000;
      array[3] = 10000;
      array[4] = 100000;
      // To display all the elements of array
      for(int a : array){
      System.out.print(a + " " );
    
      }
      System.out.println();

      // change the value of array at index 2
      array[2] = 55;
   System.out.println("Please Enter the Number to Search");

  //  Take user input
  int number =  Input.nextInt();
    boolean found = false;
    try{
          for(int i = 0; i < array.length; i++){
            // check the number is present in the array or not
          if(array[i] == number){
            System.out.println("Your search item is at index: " + i + ":" + number); 
            found = true;
            break;
          }
          
        }
        if(!found){
          System.out.println("Cannot find your searched Item!");
        }
      }
      // throw error if something occured in try block
    catch(Exception e){
    System.out.println("Some error occured" + e);
    }
      
    }
    
}

