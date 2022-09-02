package Task2;

import java.util.*;

//This is the main class for running all the project.
public class ApplicationRunner
{
   
	/*This is the main method to run all the related methods.*/ 
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);

                //This is to assign ten objects of EventHandler to arraylist
		ArrayList<EventsHandler> events = new ArrayList(10);
		
		/*This is the data related to the project which was given in the
		 * project to be tested on.*/
                //Park will take two inputs one park name and another number of changing facilities
                //Town will take only name as an argument
                //FiveKmRun will get number of event , date , time and venue object as an inputs
                //HalfMarathon will get Event number, date , time ,number of waterstations and venue as an input
                //EventHandler will get FiveKmRun or HalfMarathon object as an argument
                //events is arraylist of EventHandler which will add EventHandler object to itself
                
		Park p = new Park("Society Park",3);
                
		FiveKmRun fkr = new FiveKmRun(1,"1-1-2021","7am",p);
		EventsHandler e = new EventsHandler(fkr);
		events.add(e);
		
		FiveKmRun fkr1 = new FiveKmRun(2,"1-1-2021","12pm",p);
		EventsHandler e1 = new EventsHandler(fkr1);
		events.add(e1);
		
		Park p2 = new Park("PMA Park",1);
		FiveKmRun fkr2 = new FiveKmRun(3,"1-1-2021","4pm",p2);
		EventsHandler e2 = new EventsHandler(fkr2);
		events.add(e2);
		
		Park p3 = new Park("Apple Park",5);
		FiveKmRun fkr3 = new FiveKmRun(4,"2-1-2021","7am",p3);
		EventsHandler e3 = new EventsHandler(fkr3);
		events.add(e3);
		
		FiveKmRun fkr4 = new FiveKmRun(5,"4-1-2021","9am",p2);
		EventsHandler e4 = new EventsHandler(fkr4);
		events.add(e4);
		
		Town t = new Town("PM Town");
		HalfMarathon hm = new HalfMarathon(6,"1-1-2021","7am",4,t);
		EventsHandler ee = new EventsHandler(hm);
		events.add(ee);
		
		HalfMarathon hm1 = new HalfMarathon(7,"1-2-2021","9am",6,t);
		EventsHandler ee1 = new EventsHandler(hm1);
		events.add(ee1);
		
		Park t2 = new Park("Meraton Park",4);
		HalfMarathon hm2 = new HalfMarathon(8,"2-2-2021","7am",5,t2);
		EventsHandler ee2 = new EventsHandler(hm2);
		events.add(ee2);
		
		HalfMarathon hm3 = new HalfMarathon(9,"5-2-2021","4pm",12,t);
		EventsHandler ee3 = new EventsHandler(hm3);
		events.add(ee3);
		
		Park t4 = new Park("Vectoria Park",4);
		HalfMarathon hm4 = new HalfMarathon(10,"10-2-2021","5pm",6,t4);
		EventsHandler ee4 = new EventsHandler(hm4);
		events.add(ee4);
		
		
		//Name taken https://nameberry.com/baby-names/164/English-Names
                //Competitor will get name and age as an arguments
		Competitor c = new Competitor("Sam",19);
		Competitor c1 = new Competitor("David",18);
		Competitor c2 = new Competitor("Wiese",23);
		Competitor c3 = new Competitor("William",20);
		Competitor c4 = new Competitor("James",21);
		Competitor c5 = new Competitor("Harper",19);
		Competitor c6 = new Competitor("Mason",25);
		Competitor c7 = new Competitor("Evelyn",27);
		Competitor c8 = new Competitor("Ella",22);
		Competitor c9 = new Competitor("Jackson",18);
		Competitor c10 = new Competitor("Avery",19);
		Competitor c11 = new Competitor("Jack",20);
		Competitor c12 = new Competitor("Scarlett",21);
		Competitor c13 = new Competitor("Madison",25);
		 
		
		
		// RunEntry will get number of event and competitor as an argument
		RunEntry r = new RunEntry(1, c);
		RunEntry r1 = new RunEntry(1, c1);
		RunEntry r2 = new RunEntry(1, c2);
		RunEntry r3 = new RunEntry(2, c3);
		RunEntry r4 = new RunEntry(2, c4);
		RunEntry r5 = new RunEntry(2, c5);
		RunEntry r6 = new RunEntry(3, c6);
		RunEntry r7 = new RunEntry(3, c7);
		RunEntry r8 = new RunEntry(3, c8);
		RunEntry r9 = new RunEntry(4, c9);
		RunEntry r10 = new RunEntry(4, c10);
		RunEntry r11 = new RunEntry(4, c11);
		RunEntry r12 = new RunEntry(5, c12);
		RunEntry r13 = new RunEntry(5, c13);
		RunEntry r14 = new RunEntry(5, c4);
		RunEntry r15 = new RunEntry(6, c1);
		RunEntry r16 = new RunEntry(6, c6);
		RunEntry r17 = new RunEntry(6, c7);
		RunEntry r18 = new RunEntry(7, c8);
		RunEntry r19 = new RunEntry(7, c1);
		RunEntry r20 = new RunEntry(7, c2);
		RunEntry r21 = new RunEntry(8, c5);
		RunEntry r22 = new RunEntry(8, c11);
		RunEntry r23 = new RunEntry(8, c10);
		RunEntry r24 = new RunEntry(9, c13);
		RunEntry r25 = new RunEntry(9, c);
		RunEntry r26 = new RunEntry(9, c2);
		RunEntry r27 = new RunEntry(10, c);
		RunEntry r28 = new RunEntry(10, c1);
		RunEntry r29 = new RunEntry(10, c4);
		RunEntry r30 = new RunEntry(10, c3);
		
                //Here we have arraylist of RunEntry which will store RunEntry objects
		ArrayList <RunEntry> runEntries = new ArrayList(31);
		runEntries.add(r);
		runEntries.add(r1);
		runEntries.add(r2);
		runEntries.add(r3);
		runEntries.add(r4);
		runEntries.add(r5);
		runEntries.add(r6);
		runEntries.add(r7);
		runEntries.add(r8);
		runEntries.add(r9);
		runEntries.add(r10);
		runEntries.add(r11);
		runEntries.add(r12);
		runEntries.add(r13);
		runEntries.add(r14);
		runEntries.add(r15);
		runEntries.add(r16);
		runEntries.add(r17);
		runEntries.add(r18);
		runEntries.add(r19);
		runEntries.add(r20);
		runEntries.add(r21);
		runEntries.add(r22);
		runEntries.add(r23);
		runEntries.add(r24);
		runEntries.add(r25);
		runEntries.add(r26);
		runEntries.add(r27);
		runEntries.add(r28);
		runEntries.add(r29);
		runEntries.add(r30);

		char yn;
		boolean flag = true;
		do
		{
			
			System.out.println("==============================================================================================================================================================================");
			
			System.out.println("\n1.  List Event Information\n2.  List Venue Detail\n3.  Search Competitor's Event Entries\n4.  Exit");
			System.out.print("\nEnter your choice : ");
			int choice = inp.nextInt();
			System.out.println("");
			
			
			//This will provide the menue to the user to choose from.
			switch(choice)
			{
				case 1 : //this option will list all the events.
					
							System.out.println("=================================================================");
							System.out.println("List of All Events");
							System.out.println("=================================================================\n");
							
							System.out.println("Event Number    Event Name       	Event Venue\n----------------------------------------------------------------");
							
							for(int i = 0 ;i<events.size(); i++)
							{
								EventsHandler eh = (EventsHandler)events.get(i);
								System.out.println(eh.listEventInfo());
					
							}
							System.out.println("=================================================================\n");
							
                                                        //Here user will be asked for event number to see all detail of an event including the participants Entries
								System.out.print("Select 'Event Number' to see the Event Detail : ");
								int numEvent = inp.nextInt();
								System.out.println("");
								
								//This will print all the detail of the choosen event
								for(int i = 0 ;i<events.size(); i++)
								{
									EventsHandler eh = (EventsHandler)events.get(i);
									if(eh.getEventNumber()==numEvent)
									{
										System.out.println(eh.toString());
									}
						
								}
								System.out.println("------------------------------------------------------------------------------------------------------------------------------");
								//This will print all the entries for the event
								System.out.println("Entries for the Event : \n");
								System.out.println("Participant Name		 Age\n");
								for(int i = 0 ; i<runEntries.size(); i++) 
								{
									RunEntry re = (RunEntry) runEntries.get(i);
									if(re.getEventNumber()==numEvent)
									{
										System.out.println(re.toString());
									}
								}
								System.out.println("===========================================================================================================================");
					break;
					
				case 2 : // This will show all the details according to the selected venue from the list.
							String arr[] = new String[events.size()];
							
                                                        //here we will store all the venue to string array arr
							for(int i = 0 ; i<events.size() ; i++)
							{
								EventsHandler eh = (EventsHandler)events.get(i);
								arr[i]=eh.getEventVenue();
							}
							//Here we will show the venue names if a user want to see all the detail of a venue
							System.out.println("=====================================================");
							System.out.println("Venue Number    Venue Name");
							System.out.println("----------------------------------------------------");
							
							arr = Arrays.stream(arr).distinct().toArray(String[]::new);
							int venueNumber = 0;
							for(int i = 0 ; i<arr.length ; i++)
							{
								System.out.println(venueNumber+1+"    	        "+arr[i]);
								venueNumber++;
							}
							
							System.out.println("=====================================================");
							
							boolean noEvent = false;  
							//here user will input a venue number to see all the details about the venue
							System.out.print("Select 'Venue Number' to see the Event Detail : ");
							int numVenue = inp.nextInt();
							System.out.println("");
							int iter = numVenue-1;
							System.out.println("Event Number 		"+"Event Name"+" 		"+"Event Date 	"+"Event Start Time	 	"+ "Event Venue Name 	"+"Changing Facilities Numbers	"+ "Water Stations Number\n");
                                                        //this will get all the data of the choosen venue
							for(int i = 0 ; i<events.size(); i++)
							{
								EventsHandler eh = (EventsHandler) events.get(i);
								if(eh.getEventVenue().equals(arr[iter]))
								{
									System.out.println(eh.venuesDetail());
									noEvent = true;
									
								}
								
							}
					break;
					
				case 3 : //This will show to the user all th details related to the user upon choosing the user.
                                                        //These are the names for the user easiness to search a competitor name
							System.out.println("Names Hint :\nSam, David, Wiese, William, James, Harper, Mason, Evelyn, Ella, Jackson, Avery, Jack, Scarlett, Madison\n");
								System.out.print("Enter the name of Competitar : ");
								String name = inp.next();
								
								
								int CompetitorNum=0;
								int count = 0;
								//Here we will go through the entries arraylist to check for the searched copetitor
								for(int i = 0 ; i<runEntries.size(); i++) 
								{
									RunEntry re = (RunEntry) runEntries.get(i);
									
									if(re.getCompetitor().equals(name))
									{
										if(count==0)
										{
											System.out.println("\nParticipant Name		 Age");
											System.out.println("==============================================================================================================================================================================");
											System.out.println(re.toString());
											System.out.println("...............................................................................................................................................................................");
											System.out.println("Event Number 		"+"Event Name"+" 		"+"Event Date 	"+"Event Start Time	 	"+ "Event Venue Name 	"+"Changing Facilities Numbers	"+ "Water Stations Number\n");
											count=1;
										}
                                                                                
										CompetitorNum = re.getEventNumber();
										//Here we will go to each event and check if this competitor is there or not
										for(int j = 0 ; j<events.size(); j++)
										{
											EventsHandler eh = (EventsHandler) events.get(j);
                                                                                                //If competitor is in the event so it will print all the detail of that event
												if(eh.getEventNumber()==CompetitorNum)
												{
													System.out.println(eh.venuesDetail());
												}
										}
										
										
									}
								}
								System.out.println("==============================================================================================================================================================================");
								
					break;
				case 4 :
					System.exit(0);
					break;
				default :
					System.out.println("Please Enter Correct Choice...");
						
			}
		}
		while(true);
		
	} // End of main method

}//End of main class.
