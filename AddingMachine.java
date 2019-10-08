package cse360assign2;
public class AddingMachine {
private int total;
public AddingMachine () {
total = 0;  // not needed - included for clarity
}
public int getTotal () {
return 0;
}
public void add (int value) {
}
public void subtract (int value) {
}
public String toString () {
return "";
}
public void clear() {
}
}

//Sravya Ponnapalli
//ID: 70642
//Assignment 2
//This file contains the code for the methods that
//add, subtract, concatenate, and clear. It has
//two created variables total and history that are used.
package cse360assign2;
public class AddingMachine 
{
	private int total;
	String history ="0";
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	public int getTotal () 
	{
		return 0;
	}
	public void add (int value) 
	{
		total += value;
		history = history + " " + "+" + " " + value;
	
	}
	public void subtract (int value) 
	{
		total -= value;
		history = history + " " + "-" + " " + value;
	}
	public String toString () 
	{
		return history;
	}
	public void clear() 
	{	
		total = 0;
		history = "";
	}
}

