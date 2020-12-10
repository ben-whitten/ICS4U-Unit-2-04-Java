/*
* The Main program implements an application that
* can edit a stack.
*
* @author  Ben Whitten
* @version 1.3
* @since   2020-12-10
*/

import java.util.Scanner;  // Import the Scanner class

///////////////////////////////////////////////////////////////////////////////

class Main {

  ////////////////////////////////////////////////////////////////////////////

  /**
   * This function handles all the inputs and outputs.
   */
  public static void main(String[] args) {

    // Variables which will be used later.
    String option;
    String pushedNumber;
    String poppedNumber;
    String stackValues;
    String pushedReturn;
    String peekedNumber;
    String clearedNumbers;

    // Creating MrCoxallStack.
    MrCoxallStack someStack = new MrCoxallStack();

    ///////////////////////////////////////////////////////////////////////////
    // This is the main portion of the program.
    while (true) {
      try {

        // Creating a scanner.
        Scanner scanOptions = new Scanner(System.in);
        // Creating a scanner.
        Scanner scanPush = new Scanner(System.in);
        // Creating a scanner.
        Scanner scanGet = new Scanner(System.in);
        // Creating a scanner.
        Scanner scanSet = new Scanner(System.in);

        // Asking what to do to the array.
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"
                           + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("What do you want to do? [push] [pop] [get]"
                           + " [peek] [clear] [show]");
        option = scanOptions.nextLine();
        System.out.println();

        //////////////////////////////////////////////////////////////////////
        // Push a number to MrCoxallStack.
        if (option.equals("push")) {
          // Getting which number to add to the stack.
          System.out.println("Insert a number to add to the stack:");
          pushedNumber = scanPush.nextLine();
          System.out.println();

          // Pushing the number onto the stack.
          pushedReturn = someStack.push(pushedNumber);

          if (pushedReturn.equals("-1")) {
            System.out.println("- ERROR: INVALID INPUT -");
            System.out.println();
          } else {
            System.out.println(pushedReturn);
            System.out.println();
          }

        //////////////////////////////////////////////////////////////////////
        // Pop off the top number from MrCoxallStack.
        } else if (option.equals("pop")) {
          // Popping off the top number from the stack.
          poppedNumber = someStack.pop();
          
          if (poppedNumber.equals("-1")) {
            System.out.println("- ERROR: NO VALUES IN STACK -");
            System.out.println();
          } else {
            System.out.println(poppedNumber);
            System.out.println();
          }

        //////////////////////////////////////////////////////////////////////
        // Pop off the top number from MrCoxallStack.
        } else if (option.equals("peek")) {
          // Popping off the top number from the stack.
          peekedNumber = someStack.peek();
          
          if (peekedNumber.equals("-1")) {
            System.out.println("- ERROR: NO VALUES IN STACK -");
            System.out.println();
          } else {
            System.out.println(peekedNumber);
            System.out.println();
          }

        //////////////////////////////////////////////////////////////////////
        // Pop off the top number from MrCoxallStack.
        } else if (option.equals("clear")) {
          // Popping off the top number from the stack.
          clearedNumbers = someStack.clear();

          if (clearedNumbers.equals("-1")) {
            System.out.println("- ERROR: NO VALUES IN STACK -");
            System.out.println();
          } else {
            System.out.println(clearedNumbers);
            System.out.println();
          }

        //////////////////////////////////////////////////////////////////////
        //Show MrCoxallStack.
        } else if (option.equals("show")) {
          stackValues = someStack.show();

          if (stackValues.equals("-1")) {
            System.out.println("- ERROR: NO VALUES IN STACK -");
            System.out.println();
          } else {
            System.out.println(stackValues);
            System.out.println();
          }

        ///////////////////////////////////////////////////////////////////////
        // Catch invalid input.
        } else {
          System.out.println("- ERROR: INVALID INPUT -");
          System.out.println();
        }

      /////////////////////////////////////////////////////////////////////////
      // Catch anything else.
      } catch (Exception e) {
        System.out.println("- AN ERROR HAS OCCURED -");
        System.out.println();
      }
    }
  }
}
