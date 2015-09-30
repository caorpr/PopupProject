package input.model;

public class Thing 
{
	private String name;
	private int age;
	private double weight;
	
	/**
	 * Makes the variables exist.
	 */
	
	public Thing()
	{
		age = -99;
		weight = -.00005;
		name = "";
	}
	
	/**
	 * makes the variables able to be changed.
	 * @param name (sets name to user typed out)
	 * @param (age sets age to what the user types out)
	 * @param (weight sets weight to what was typed out)
	 */
	
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	

	
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	/**
	 * Returns a STRING, and describes what they are.
	 */
	
	
	public String toString()
	{
		String thingInfo = name + " is " + age + " years old, and weighs " + weight + " lbs.";
		
		return thingInfo;
	}
}
