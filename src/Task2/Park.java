package Task2;

//This will extends the venue where the running will be takes place.
class Park extends Venue
{
	private int numChangingFacilities;
	
	//constructor
	Park(String name,int numChangingFacilities) 
	{
		super(name);
		this.numChangingFacilities = numChangingFacilities;
	}
	
	//Accessor methods.
        //it will return number of changing facilities
	public int getNumChangingFacilities()
	{
		return numChangingFacilities;
	}
        //this will return all details of the park
	public String toString()
	{
		return name + " 				" + numChangingFacilities;
	}
        // This will return the venue name mean the park name
	public String getVenueName()
	{
		return name;
	}

	
	
}
