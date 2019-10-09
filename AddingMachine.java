//Sravya Ponnapalli
//ID: 70642
//Assignment 2
//This file contains the code for the methods that
//add and subtract from the total and concatenate and clear the string. It has
//two created variables total and history that are used. The values passed through the methods of
//add and subtract are concatenated into a string and called history. This history can be erased, returned 
//and also can have values concatenated to it. These values are also added to and subtracted from
//the current total.
package cse360assign2;
public class AddingMachine 
{
	private int total;
	String history ="0";
	public AddingMachine ()
	{
		total = 0;  // not needed - included for clarity
	}
	public int getTotal () //this method returns the current total at hand
	{
		return total;
	}
	//this method adds the value at hand to the total
	//it also concatenates the value to the string
	public void add (int value) 							
	{
		total += value;
		history = history + " " + "+" + " " + value;
	
	}
	//this method adds the value at hand to the total
	//it also concatenates the value to the string
	public void subtract (int value) 							
	{
		total -= value;
		history = history + " " + "-" + " " + value;
	}
	//this method returns the string at hand that has values concatenated
	public String toString () 
	{
		return history;
	}
	//this method gets rid of any content or values in total and history
	public void clear() 
	{	
		total = 0;
		history = "";
	}
}

}

