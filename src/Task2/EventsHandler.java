package Task2;

//This is the class which will handle all the operations related to the 
// given events in the project.
class EventsHandler 
{
	
	private HalfMarathon hr;
	private FiveKmRun fkr;
        //check will be used for print data of an event
	boolean check = false;

	//Constructor for HalfMarathon 
	EventsHandler(HalfMarathon hr)
	{
		//this.cr = cr;
		this.hr = hr;
		check= true;
	}
	
	//Another constructor for FiveKmRun
	EventsHandler(FiveKmRun fkr)
	{
		this.fkr = fkr;
	}

	
	//Accessors Methods. return data according to each type of run.
	public String toString()
	{
            //We assign true to check if the event is HalfMarathon so it will print data of HalfMarathon if the event
            //is HalfMarathon otherwise FiveKmRun.
		if(check==true)
		{
			return hr.toString();
		}
		else
		{
			return fkr.toString();
		}
	}
        //We assign true to check if the event is HalfMarathon so it will print data of HalfMarathon if the event
            //is HalfMarathon otherwise FiveKmRun.
	public String listEventInfo()
	{
		if(check==true)
		{
			return hr.listEventInfo();
		}
		else
		{
			return fkr.listEventInfo();
		}
	}
        //We assign true to check if the event is HalfMarathon so it will print data of HalfMarathon if the event
        //is HalfMarathon otherwise FiveKmRun.
	public int getEventNumber()
	{
		if(check==true)
		{
			return hr.getEventNumber();
		}
		else
		{
			return fkr.getEventNumber();
		}

	}
	//We assign true to check if the event is HalfMarathon so it will print data of HalfMarathon if the event
        //is HalfMarathon otherwise FiveKmRun.
	public String getEventVenue()
	{
		if(check==true)
		{
			return hr.getVenueName();
		}
		else
		{
			return fkr.getVenueName();
		}

	}
	public int getNumWaterStations()
	{
		return hr.getNumWaterStations();
	}
        //We assign true to check if the event is HalfMarathon so it will print data of HalfMarathon if the event
        //is HalfMarathon otherwise FiveKmRun.
	public String venuesDetail()
	{
		if(check==true)
		{
			return hr.venuesDetail();
		}
		else
		{
			return fkr.venuesDetail();
		}

	}
	

}
