package Task2;

// An abstract class which have all the details about the venue.
abstract class Venue 
{
	protected String name;
	//Constructor 
	Venue(String name)
	{
		this.name = name;
	}
	
	
	//Accessor methods.
        //it will return name of the venue
	public String getName()
	{
		return name;
	}
        //it will set the venue name
	public void setName(String name)
	{
		this.name = name;
	}
}
