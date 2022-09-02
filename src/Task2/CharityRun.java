package Task2;

//This is the type of run that will have the event details for the specified type of run.
abstract class CharityRun extends RunEntry
{
	private String date;
	private String startTime;
	
	//Constructor 
	CharityRun(int eventNumber, String date, String startTime)
	{
            //Assigning event number to the parent class which is CharityRun
		super(eventNumber);
		this.date = date;
		this.startTime = startTime;
	}
	
	// Accessors methods.
	public String getDate()
	{
		return date;
	}
        //this will return start time for the run
	public String getStartTime()
	{
		return startTime;
	}
        //this will set the date for the run
	public void setDate(String date)
	{
		this.date = date;
	}
        //this will set start time 
	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}
}
