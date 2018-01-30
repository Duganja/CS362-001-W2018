package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	  public void test02()  throws Throwable  {
			int startHour=27;
 		 int startMinute=61;
 		 int startDay=27;
 		 int startMonth=10;
 		 int startYear=-10;
 		 String title="here";
 		 String description="here";
 		 //Construct a new Appointment object with the initial data
 		 Appt appt = new Appt(startHour,
 		          startMinute ,
 		          startDay ,
 		          startMonth ,
 		          startYear ,
 		          title,
 		         description);

		appt.setStartHour(20);
		appt.setStartMinute(20);
		appt.setStartMonth(2);
		appt.setStartYear(20);
		appt.setStartDay(20);
		appt.setTitle(null);
		appt.setDescription(null);

 	// assertions
 		 assertTrue(appt.getValid());
 		 assertEquals(20, appt.getStartHour());
 		 assertEquals(20, appt.getStartMinute());
 		 assertEquals(20, appt.getStartDay());
 		 assertEquals(2, appt.getStartMonth());
 		 assertEquals(20, appt.getStartYear());
 		 assertEquals("", appt.getTitle());
 		 assertEquals("", appt.getDescription());

	 }

	 @Test
	  public void test03()  throws Throwable  {
			int startHour=-2;
 		 int startMinute=-1;
 		 int startDay=-1;
 		 int startMonth=1;
 		 int startYear=-1;
 		 String title="here";
 		 String description="here";
		 int[] test = new int[8];
 		 //Construct a new Appointment object with the initial data
 		 Appt appt = new Appt(startHour,
 		          startMinute ,
 		          startDay ,
 		          startMonth ,
 		          startYear ,
 		          title,
 		         description);


 	// assertions
 		 assertFalse(appt.getValid());
 		 assertEquals(-2, appt.getStartHour());
 		 assertEquals(-1, appt.getStartMinute());
 		 assertEquals(-1, appt.getStartDay());
 		 assertEquals(1, appt.getStartMonth());
 		 assertEquals(-1, appt.getStartYear());
 		 assertEquals("here", appt.getTitle());
 		 assertEquals("here", appt.getDescription());

		 appt.setStartHour(200);
 		appt.setStartMinute(200);
 		appt.setStartMonth(2);
 		appt.setStartYear(200);
 		appt.setStartDay(200);
		assertFalse(appt.getValid());

		appt.toString();


		appt.setStartHour(1);
		appt.setStartMinute(1);
		appt.setStartMonth(1);
		appt.setStartYear(1);
		appt.setStartDay(1);
		assertTrue(appt.getValid());

		appt.toString();

		//assertEquals(0, appt.getRecurDays());

		appt.setRecurrence(test, 2, 0, 0);
		assertEquals(test, appt.getRecurDays());


	 }

	 @Test
	  public void test04()  throws Throwable  {

			int startHour=7;
 		 int startMinute=-1;
 		 int startDay=40;
 		 int startMonth=1;
 		 int startYear=-1;
 		 String title="here";
 		 String description="here";
		 int[] test = new int[8];
 		 //Construct a new Appointment object with the initial data
 		 Appt appt = new Appt(startHour,
 		          startMinute ,
 		          startDay ,
 		          startMonth ,
 		          startYear ,
 		          title,
 		         description);


						 assertFalse(appt.getValid());
				 		 assertEquals(7, appt.getStartHour());
				 		 assertEquals(-1, appt.getStartMinute());
				 		 assertEquals(40, appt.getStartDay());
				 		 assertEquals(1, appt.getStartMonth());
				 		 assertEquals(-1, appt.getStartYear());
				 		 assertEquals("here", appt.getTitle());
				 		 assertEquals("here", appt.getDescription());

						 Appt appt2 = new Appt(12,
			   		          2 ,
			   		          3 ,
			   		          4 ,
			   		          5 ,
			   		          "title",
			   		         "description");

				appt2.toString();
				appt.compareTo(appt2);



		}
//add more unit tests as you needed

}
