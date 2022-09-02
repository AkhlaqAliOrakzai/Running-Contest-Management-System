package Task2;


class RunEntry // RunEntry class which details about an entry for running in the compitition.
{
	private int eventNumber;
	private Competitor c;
	
	//First Constructor where it will take only eventNumber
	RunEntry(int eventNumber) 
	{
		this.eventNumber = eventNumber;
	}
	
	//Second constructor where it will take eventNumber and competitor as well
	RunEntry(int eventNumber,Competitor c) 
	{
		this.eventNumber = eventNumber;
		this.c = c;
	}
	
	//these are the accessor methods.
        //it will return event number
	public int getEventNumber()
	{
		return eventNumber;
	}
        //it will return all data the runEntry
	public String toString()
	{
		String total = 	c.toString();
		
		return total;
	}
        //it will return competitor name
	public String getCompetitor()
	{
		return c.getName();
	}
}
