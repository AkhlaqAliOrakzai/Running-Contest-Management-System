package Task2;

//Twon class which extended the venue class.
class Town extends Venue
{
        //this constructer will assign the name of town to parent class venue
	Town(String name)
	{
		super(name);
	}
        //it will return detail of the Town
	public String toString()
	{
		return name;
	}
}
