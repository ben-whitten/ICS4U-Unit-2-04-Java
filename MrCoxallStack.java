/*
* The MrCoxallStack program implements an application that
* creates a stack and allows you to edit it.
*
* @author  Ben Whitten
* @version 1.3
* @since   2020-12-10
*/

import java.util.ArrayList;  // Import the ArrayList class

///////////////////////////////////////////////////////////////////////////////

public class MrCoxallStack {

  private ArrayList<Integer> someStack = new ArrayList<Integer>();

  // variables for later.
  private String poppedNumber;
  private int position;
  private int intPushedNumber;
  private String stackValues;
  private String peekedNumber;

  /////////////////////////////////////////////////////////////////////////////
  /**
   * Push function.
   */
  public String push(String pushedNumber) {
    try {
      intPushedNumber = Integer.parseInt(pushedNumber);
      someStack.add(intPushedNumber);
      pushedNumber = "Pushed: " + pushedNumber;
    } catch (Exception e) {
      pushedNumber = "-1";
    }

    return pushedNumber;
  }
  
  /////////////////////////////////////////////////////////////////////////////
  /**
   * Pop function.
   */
  public String pop() {
    try {
      poppedNumber = "Popped: ";
      poppedNumber += someStack.get(someStack.size() - 1);
      someStack.remove(someStack.size() - 1);

    } catch (Exception e) {
      poppedNumber = "-1";
    }
    
    return poppedNumber;
  }

  /////////////////////////////////////////////////////////////////////////////
  /**
   * Peek function.
   */
  public String peek() {
    try {
      peekedNumber = "Peeked: ";
      peekedNumber += someStack.get(someStack.size() - 1);

    } catch (Exception e) {
      peekedNumber = "-1";
    }

    return peekedNumber;
  }

  /////////////////////////////////////////////////////////////////////////////
  /**
   * Show function.
   */
  public String clear() {
    try {
      stackValues = "Cleared Stack Values: ";
      stackValues += someStack.get(0);
      position = 1;
      if (someStack.size() > 0) {
        for (position = 1; position < someStack.size(); position++) {
          stackValues = stackValues + ", " + someStack.get(position);
        }
      }

      someStack.clear();

    } catch (Exception e) {
      stackValues = "-1";
    }
    return stackValues;
  }


  /////////////////////////////////////////////////////////////////////////////
  /**
   * Show function.
   */
  public String show() {
    try {
      stackValues = "Current Stack Values: ";
      stackValues += someStack.get(0);
      position = 1;
      if (someStack.size() > 0) {
        for (position = 1; position < someStack.size(); position++) {
          stackValues = stackValues + ", " + someStack.get(position);
        }
      }

    } catch (Exception e) {
      stackValues = "-1";
    }
    return stackValues;
  }
}
