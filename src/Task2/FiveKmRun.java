package Task2;

//This class for the second type of run that is FiveKmRun, it has all 
// the details related to the type of event.
class FiveKmRun extends CharityRun
{
	private Park p;
	
	//This is the constructor.
	FiveKmRun(int eventNumber, String date, String startTime,Park p) 
	{
		super(eventNumber, date, startTime);
		this.p = p;
		
	}
	
	//This is the tostring which return all the details related to the specified method.
	public String toString()
	{
		String complete = "==================================================================================================================================="
				+ "\n";
		complete += "Event Number 		"+"Event Name 	  "+"Event Date 	"+"Event Start Time	 	"+ "Event Venue Name 	"+ "Changing Facilites Number\n";
		complete += "....................................................................................................................................\n";
		complete += getEventNumber()+" 			"+"Five Km Run 	  "+getDate() + " 		"+getStartTime() +"	 		 "+p.getName()+" 			"+p.getNumChangingFacilities();
		return complete;

	}
	
	//These are the accessor methods.
        //it will return all the events of this class object
	public String listEventInfo()
	{
		return getEventNumber()+"		 "+"Five Km Run" + "		 "+p.getName();
	}
        //it will return venue name
	public String getVenueName()
	{
		return p.getName();
	}
        //this will return venues detail
	public String venuesDetail()
	{
		String complete = getEventNumber()+" 			"+"Five Km Run"+"		"+getDate() + " 		"+getStartTime() +"	 		 "+p.getName()+" 				"+p.getNumChangingFacilities();
		return complete;
	}
	
	
}
