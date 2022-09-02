package Task2;

//This is the class of a compititor with its details.
class Competitor 
{
	private String name;
	private int age;
	
	//Constructor with name and age
	Competitor(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//accessor methods.
        //this will return name and age of the competitor
	public String toString()
	{
		return name+ "				 "+age;
	}
        //this will return name of the competitor
	public String getName()
	{
		return name;
	}
}
