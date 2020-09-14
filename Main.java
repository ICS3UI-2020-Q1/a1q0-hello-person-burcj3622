import java.util.Scanner;
 
 

public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // declare a variable that will store a name
    String userName;
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

   System.out.println("Please enter your name:");
    //initialize the users Name variable with bob
    userName = input.nextLine();
    
  //say hello to user
   System.out.println("hello " + userName +"!");
   
   System.out.println("Please enter the year you were born:");

   //initialize a variable for the birth year
    int birthYear= input.nextInt();

    //declare and initialize constant for the current year
    int CURRENT_YEAR= 2020;
 
    //declare and claculate the users age
    int age = CURRENT_YEAR - birthYear;

    //tell the user their age
    System.out.println("you are " + age +  " years old");
  }
}
