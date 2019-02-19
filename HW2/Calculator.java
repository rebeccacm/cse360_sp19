//************************************************************************
// ASU CSE360 Assignment 2
// Name of Author: Rebecca Martin
// Class ID: 474
// Description: This class implements a basic arithmetic calculator.  
//              It supports addition, subtraction, multiplication, and
//              division.  It also returns the current total and prints
//              the computation history.  
//************************************************************************

package cse360assign2;

public class Calculator {

    /**
     * global variable total holds the result from the calculator computations 
     * global variable history holds the computation history in a string
     */
	private int total;
    private String history;
	
    /**
     * This method is the constructor.  It initializes total to zero and adds
     * this initial zero to the history. 
     */
	public Calculator () {
		total = 0;  // not needed - included for clarity
        history = "0";
	}
	
    /**
     * This method returns the total variable
     */
	public int getTotal () {
		return total;
	}
	
    /**
     * This method adds the parameter to the total variable and updates the history
     * 
     * @param  value  integer to be added to total
     */
	public void add (int value) {
        history = history + " + " + value;
		total += value;
	}
	
    /**
     * This method subtracts the parameter from the total variable and updates the history
     * 
     * @param  value  integer to be subtracted from the total
     */
	public void subtract (int value) {
        history = history + " - " + value;
		total -= value;
	}
	
    /**
     * This method multiplies the parameter with the total variable and updates the history
     * 
     * @param  value  integer to be multiplied with total
     */
	public void multiply (int value) {
        history = history + " * " + value;
		total *= value;
	}
	
    /**
     * This method divides the total variable by the parameter and updates the history
     * 
     * @param  value  integer to divide total by
     */
	public void divide (int value) {
        history = history + " / " + value;
        if (value == 0)
        {
            total = 0;
        }

        else
        {
		    total /= value;
        }
	}
	
    /**
     * This method returns the previous computations done by the calculator
     */
	public String getHistory () {
		return history;
	}
}
