package Task2;

//The class of halfMarathon which has number of water stations and venue.
class HalfMarathon extends CharityRun
{
	private int numWaterStations;
	private Venue v;
	
	//Constructor
	HalfMarathon(int eventNumber, String date, String startTime,int numWaterStations, Venue v) 
	{
		super(eventNumber, date, startTime);
		this.numWaterStations = numWaterStations;
		this.v = v;
	}
	
	//This is the toString method which return all the details for halfmarathon  event.
	public String toString()
	{
		String complete = "====================================================================================================================================================="
				+ "\n";
		complete += "Event Number 		"+"Event Name 	  "+"Event Date 	"+"Event Start Time	 	"+ "Event Venue Name 	"+"Changing Facilities Numbers	"+ "Water Stations Number\n";
		complete += "......................................................................................................................................................\n";
		complete += getEventNumber()+" 			"+"Half Marathon 	  "+getDate() + " 		"+getStartTime() +"	 		 "+v.toString()+"			"+numWaterStations;
		return complete;
	}
	
	//These are the accessor methods.
        //This will return event info
	public String listEventInfo()
	{
		return getEventNumber()+"		 "+"Half Marathon" +"		 "+v.getName();
	}
        //This will return venue name
	public String getVenueName()
	{
		return v.getName();
	}
        //this will return venues detail
	public String venuesDetail()
	{
		String complete = getEventNumber()+" 			"+"HalfMarathon"+" 		"+getDate() + " 		"+getStartTime() +"	 		 "+v.toString()+"			"+numWaterStations;
		return complete;
		//return " hye ";
	}
        //This will return Number of water stations
	public int getNumWaterStations()
	{
		return numWaterStations;
	}

	
	
}
