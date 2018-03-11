package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.*;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 1000 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setRecurrence"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

        return methodArray[n] ; // return the method name
        }
	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
    public static int RandomSelectRecur(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur
        }
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
    public static int RandomSelectRecurForEverNever(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur
        }


    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
				long startTime = Calendar.getInstance().getTimeInMillis();
	 		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


	 		 System.out.println("Start testing...");

	 		try{
	 			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
	 				long randomseed =System.currentTimeMillis(); //10
	 	//			System.out.println(" Seed:"+randomseed );
	 				Random random = new Random(randomseed);
					GregorianCalendar today = new GregorianCalendar(ValuesGenerator.getRandomIntBetween(random, 1, 3), ValuesGenerator.getRandomIntBetween(random, 1, 11), ValuesGenerator.RandInt(random));

					CalDay calDays = new CalDay(today);

					//start for test
					TimeTable t = new TimeTable();
					//GregorianCalendar today = new GregorianCalendar(ValuesGenerator.RandInt(random), ValuesGenerator.getRandomIntBetween(random, 1, 11), ValuesGenerator.RandInt(random));
					GregorianCalendar yesterday = new GregorianCalendar(ValuesGenerator.RandInt(random), ValuesGenerator.getRandomIntBetween(random, 1, 11), ValuesGenerator.RandInt(random));
					GregorianCalendar tomorrow = new GregorianCalendar(ValuesGenerator.getRandomIntBetween(random, 4, 6), ValuesGenerator.getRandomIntBetween(random, 1, 11), ValuesGenerator.RandInt(random));

					int startHour=ValuesGenerator.RandInt(random);
					int startMinute=ValuesGenerator.RandInt(random);
					int startDay=ValuesGenerator.RandInt(random);;
					int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					int startYear=ValuesGenerator.RandInt(random);
					String title="Birthday Party";
					String description="This is my birthday party.";
					//Construct a new Appointment object with the initial data
					Appt appt1 = new Appt(startHour,
									 startMinute ,
									 startDay ,
									 startMonth ,
									 startYear ,
									 title,
									description);

					//second appt
					startHour=ValuesGenerator.RandInt(random);
					startMinute=ValuesGenerator.RandInt(random);
					startDay=ValuesGenerator.RandInt(random);;
					startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					startYear=ValuesGenerator.RandInt(random);
					title="Birthday Party";
					description="This is my birthday party.";
					//Construct a new Appointment object with the initial data
					Appt appt2 = new Appt(startHour,
									 startMinute ,
									 startDay ,
									 startMonth ,
									 startYear ,
									 title,
									description);

					startHour=ValuesGenerator.RandInt(random);
					startMinute=ValuesGenerator.RandInt(random);
					startDay=ValuesGenerator.RandInt(random);;
					startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					startYear=ValuesGenerator.RandInt(random);
					title="Birthday Party";
					description="This is my birthday party.";
					//Construct a new Appointment object with the initial data
					Appt appt3 = new Appt(startHour,
									 startMinute ,
									 startDay ,
									 startMonth ,
									 startYear ,
									 title,
									description);

					startHour=ValuesGenerator.RandInt(random);
 					startMinute=ValuesGenerator.RandInt(random);
 					startDay=ValuesGenerator.RandInt(random);;
 					startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
 					startYear=ValuesGenerator.RandInt(random);
 					title="Birthday Party";
 					description="This is my birthday party.";
 					//Construct a new Appointment object with the initial data
 					Appt appt4 = new Appt(startHour,
 									 startMinute ,
 									 startDay ,
 									 startMonth ,
 									 startYear ,
 									 title,
 									description);



					startHour=ValuesGenerator.RandInt(random);
					startMinute=ValuesGenerator.RandInt(random);
					startDay=ValuesGenerator.RandInt(random);;
					startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					startYear=ValuesGenerator.RandInt(random);
					title="Birthday Party";
					description="This is my birthday party.";
					//Construct a new Appointment object with the initial data
					Appt appt5 = new Appt(startHour,
									 startMinute ,
									 startDay ,
									 startMonth ,
									 startYear ,
									 title,
									description);

					//Appt appt3 = null;

					calDays.addAppt(appt1);
					calDays.addAppt(appt2);
					LinkedList<Appt> list = new LinkedList<Appt>();
					list.add(appt1);
					list.add(appt2);
					list.add(appt3);
					list.add(appt4);
					list.add(appt5);
					//list.add(appt3);

					t.getApptRange(list, today, tomorrow);
					//t.deleteAppt(list, appt3);
					t.deleteAppt(list, appt2);
					t.deleteAppt(list, appt1);
					t.deleteAppt(list, appt3);
					t.deleteAppt(list, appt5);
					t.deleteAppt(list, appt4);

					//LinkedList<Appt> list2 = null;
					t.deleteAppt(null, appt1);
					t.deleteAppt(list, null);







					//end of test

					elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
	 						if((iteration%10000)==0 && iteration!=0 )
	 									System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

	 			}
	 			}catch(NullPointerException e){

	 			}

	 			System.out.println("Done testing...");
	 		}







}
