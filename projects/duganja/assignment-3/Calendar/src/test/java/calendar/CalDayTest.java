package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
			GregorianCalendar today = new GregorianCalendar(2010, 10, 5);

			CalDay calDays = new CalDay(today);


			assertEquals(2010, calDays.getYear());
			assertEquals(10, calDays.getMonth());
			assertEquals(5, calDays.getDay());
			assertTrue(calDays.isValid());
			Appt appt1 = new Appt(7,
  		          1 ,
  		          5 ,
  		          10 ,
  		          2010 ,
  		          "title",
  		         "party");

			Appt appt2 = new Appt(6,
  		          4 ,
  		          5 ,
  		          10 ,
  		          2010 ,
  		          "tht",
  		         "hty");
		 Appt appt3 = new Appt(6,
 		          4 ,
 		          4758 ,
 		          10 ,
 		          2010 ,
 		          "tht",
 		         "hty");
		 Appt appt4 = new Appt(6,
 		          0 ,
 		          5 ,
 		          10 ,
 		          2010 ,
 		          "tht",
 		         "hty");
			assertTrue(appt1.getValid());
			calDays.addAppt(appt1);
			calDays.addAppt(appt2);
			calDays.addAppt(appt3);
			calDays.addAppt(appt4);
			Iterator<Appt> itr = calDays.appts.iterator();
			while(itr.hasNext()){
				Object element = itr.next();
			}

			calDays.toString();


	 }
	 @Test
	  public void test02()  throws Throwable  {
			Appt appt = new Appt(7,
  		          1 ,
  		          1 ,
  		          1 ,
  		          2000 ,
  		          "title",
  		         "party");

			GregorianCalendar today = new GregorianCalendar(2010, 10, 5);

			CalDay calDays = new CalDay(today);

			calDays.addAppt(appt);


			int check = calDays.getSizeAppts();

			assertEquals(1, calDays.getSizeAppts());
			assertEquals(calDays.getSizeAppts(), check);

	 }


	 @Test
	  public void test03()  throws Throwable  {
			Appt appt = new Appt(7,
  		          1 ,
  		          2 ,
  		          2 ,
  		          1600 ,
  		          "title",
  		         "party");
			CalDay calDays = new CalDay();
			//calDays.addAppt(appt);
			calDays.toString();
			Iterator<?> itr = calDays.iterator();
			assertEquals(null, itr);



		}

		@Test
		 public void test04()  throws Throwable  {
			 GregorianCalendar today = new GregorianCalendar(2010, 10, 5);

 			 CalDay calDays = new CalDay(today);
			 Appt appt1 = new Appt(7,
								 1 ,
								 2 ,
								 2 ,
								 1600 ,
								 "title",
								"party");
				Appt appt2 = new Appt(8,
									1 ,
									2 ,
									2 ,
									1600 ,
									"title",
								 "party");
				 Appt appt3 = new Appt(6,
 									1 ,
 									2 ,
 									2 ,
 									1600 ,
 									"title",
 								 "party");
				 Appt appt4 = new Appt(8,
 									1 ,
 									2 ,
 									2 ,
 									1600 ,
 									"title",
 								 "party");
			 calDays.addAppt(appt1);
			 calDays.addAppt(appt2);
			 calDays.addAppt(appt3);
			 calDays.addAppt(appt4);

			 LinkedList<Appt> list = calDays.getAppts();

			 assertEquals(appt2, list.get(2));
			 assertEquals(appt1, list.get(1));
			 assertEquals(appt3, list.get(0));
			 assertEquals(appt4, list.get(3));

			 Iterator<?> itr = calDays.iterator();
			 assertNotNull(itr);
			 assertNotNull(calDays.getAppts());

			 String print = calDays.toString();
			 String expected = "	 --- 10/5/2010 --- \n --- -------- Appointments ------------ --- \n\t2/2/1600 at 6:1am ,title, party\n 	2/2/1600 at 7:1am ,title, party\n 	2/2/1600 at 8:1am ,title, party\n 	2/2/1600 at 8:1am ,title, party\n [	2/2/1600 at 6:1am ,title, party\n, 	2/2/1600 at 7:1am ,title, party\n, 	2/2/1600 at 8:1am ,title, party\n, 	2/2/1600 at 8:1am ,title, party\n]\n";
			 assertEquals(expected, print);
		 }
//add more unit tests as you needed
}
