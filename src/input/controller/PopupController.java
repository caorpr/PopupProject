package input.controller;

import input.view.PopupDisplay;
import input.model.Thing;

/**
 * Makes the popup display usable in other areas.
 * @author cand3952
 */
public class PopupController 
{
	
	private PopupDisplay myPopups;
	private Thing myThing;
	
/**
 * Makes it so that there is a popup window.
 */
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
/**
 * Asks questions, and has you type in answers for age, name, and weight. Tests to see if... 
 * ...you typed in a double for weight, and an integer for age. If not, it will ask you to type in again.
 * After you type, it will show what you typed (or give you an error).
 */
	
	public void start()
	{
		String name = myPopups.getAnswer("Type in your name: ");
		
		myPopups.displayResponse("Your name is: " + name);
		int age;
		String tempAge = myPopups.getAnswer("Type in your age");
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopups.getAnswer("Type in an integer value!");
		}
		
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -12345678;
		}
		
		myPopups.displayResponse("You typed in " + age);
		
		double weight;
		String tempWeight = myPopups.getAnswer("Type in your weight (lbs.): ");
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.getAnswer("Give me a valid double!");
		}
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		else
		{
			weight = -9999990;
		}
		
		myPopups.displayResponse("You typed in: " + weight);
		
		myThing = new Thing(name, age, weight);
		
		myPopups.displayResponse(myThing.toString());
	}

/**
 * Sees if the integer for age is true, otherwise, it will loop back and give you an error.
 * @param input (put in an integer, or it will give you an error!)
 * @return
 */
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("ERROR");
		}
		
		return isInt;
	}
	
/**
 * Sees if the double for weight is true, otherwise, it will loop an error message until you give it a double.
 * @param input (put in a double!)
 * @return
 */
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You typed wrong.");
		}
		return isDouble;
	}
}
