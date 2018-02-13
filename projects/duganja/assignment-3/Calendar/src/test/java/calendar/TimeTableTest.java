package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
			TimeTable t = new TimeTable();
			GregorianCalendar today = new GregorianCalendar(2010, 10, 5);
			GregorianCalendar yesterday = new GregorianCalendar(2010, 10, 4);
			GregorianCalendar tomorrow = new GregorianCalendar(2010, 10, 6);

			//t.getApptRange(null, today, tomorrow);
			//t.getApptRange(null, today, yesterday);
			t.deleteAppt(null, null);

	 }
	 @Test
	  public void test02()  throws Throwable  {
			TimeTable t = new TimeTable();
			GregorianCalendar today = new GregorianCalendar(2010, 10, 5);
			GregorianCalendar yesterday = new GregorianCalendar(2010, 10, 4);
			GregorianCalendar tomorrow = new GregorianCalendar(2010, 10, 30);
			int[] test = new int[8];
			int[] test2 = new int[0];
			int[] test3 = new int[5];
			test3[0]=1;
			test3[1]=2;
			test3[2]=0;
			test3[3]=4;
			test3[4]=3;

			Appt appt1 = new Appt(12,
							 2 ,
							 1 ,
							 10 ,
							 2010 ,
							 "title",
							"description");
			Appt appt2 = new Appt(3,
							 3 ,
							 5 ,
							 10 ,
							 2010 ,
							 "tfg",
							"descrfgon");
			Appt appt3 = new Appt(2,
							 5 ,
							 5 ,
							 10 ,
							 2010 ,
							 "tgg",
							"descrfgon");
			Appt appt4 = new Appt(2,
							 5 ,
							 20 ,
							 10 ,
							 2010 ,
							 "tgg",
							"descrfgon");
			Appt appt5 = new Appt(2,
							 5 ,
							 9000 ,
							 10 ,
							 2010 ,
							 "tgg",
							"descrfgon");

			//appt1.setRecurrence(test, 2, 1, 1);
			//appt2.setRecurrence(test2, 1, 0, 2);


			LinkedList<Appt> list = new LinkedList<Appt>();
			list.add(appt1);
			list.add(appt2);
			list.add(appt3);
			list.add(appt4);
			list.add(appt5);


			t.getApptRange(list, today, tomorrow);

			//t.getApptOccurences(appt1, today, tomorrow);

			//t.permute(list, test2);
			t.permute(list, test3);


			t.deleteAppt(list, appt1);

			LinkedList<CalDay> calDays = t.getApptRange(list, today, tomorrow);
			assertEquals(0, calDays.get(4).getAppts().size());

			//t.getApptRange(list, today, yesterday);

	 }

	 @Test
	  public void test03()  throws Throwable  {
			TimeTable t = new TimeTable();
			GregorianCalendar today = new GregorianCalendar(2010, 10, 5);
			GregorianCalendar yesterday = new GregorianCalendar(2010, 10, 4);
			GregorianCalendar tomorrow = new GregorianCalendar(2010, 10, 30);
			int[] test = new int[8];
			int[] test2 = new int[0];
			int[] test3 = new int[5];
			test3[0]=1;
			test3[1]=2;
			test3[2]=0;
			test3[3]=4;
			test3[4]=3;

			Appt appt1 = new Appt(12,
							 2 ,
							 15 ,
							 10 ,
							 2010 ,
							 "title",
							"description");
			Appt appt2 = new Appt(3,
							 -3 ,
							 15 ,
							 10 ,
							 2010 ,
							 "tfg",
							"descrfgon");
			Appt appt3 = new Appt(12,
							 2 ,
							 16 ,
							 10 ,
							 2010 ,
							 "tfg",
							"descrfgon");


			int[] recurringDays = new int[0];
			appt3.setRecurrence(recurringDays, 1, 1, 1000);

			LinkedList<Appt> list = new LinkedList<Appt>();
			list.add(appt1);
			list.add(appt2);
			list.add(appt3);

			LinkedList<CalDay> calDays = t.getApptRange(list, today, tomorrow);

			assertEquals(1, calDays.get(10).getAppts().size());
			assertEquals(1, calDays.get(11).getAppts().size());
			assertEquals(1, calDays.get(18).getAppts().size());





		}

		@Test
		 public void test04()  throws Throwable  {
			 TimeTable t = new TimeTable();
			 GregorianCalendar today = new GregorianCalendar(2010, 10, 5);
			 GregorianCalendar yesterday = new GregorianCalendar(2010, 10, 4);
			 GregorianCalendar tomorrow = new GregorianCalendar(2011, 10, 30);
			 int[] test = new int[8];
			 int[] test2 = new int[0];
			 int[] test3 = new int[3];
			 test3[0]=1;
			 test3[1]=2;
			 test3[2]=0;


			 Appt appt1 = new Appt(12,
								2 ,
								15 ,
								10 ,
								2010 ,
								"title",
							 "description");
			 Appt appt2 = new Appt(3,
								-3 ,
								15 ,
								10 ,
								2010 ,
								"tfg",
							 "descrfgon");
			 Appt appt3 = new Appt(12,
								2 ,
								16 ,
								10 ,
								2010 ,
								"tfg",
							 "descrfgon");

			 Appt appt4 = null;


			 int[] recurringDays = new int[0];
			 appt3.setRecurrence(recurringDays, 2, 0, 1000);
			 appt1.setRecurrence(recurringDays, 3, 0, 1000);

			 LinkedList<Appt> list = new LinkedList<Appt>();
			 list.add(appt1);
			 list.add(appt2);
			 list.add(appt3);

			 LinkedList<CalDay> calDays = t.getApptRange(list, today, tomorrow);

			 assertEquals(1, calDays.get(10).getAppts().size());
			 assertEquals(1, calDays.get(11).getAppts().size());
			 assertEquals(1, calDays.get(376).getAppts().size());
			 assertEquals(1, calDays.get(375).getAppts().size());

			 assertEquals(appt1, list.get(0));
			assertEquals(appt2, list.get(1));
			assertEquals(appt3, list.get(2));

			 list = t.permute(list, test3);



			 assertNotNull(list);
			 assertEquals(appt1, list.get(0));
			 assertEquals(appt2, list.get(1));
			 assertEquals(appt3, list.get(2));
			 assertEquals(list.size(), 3);


			 LinkedList<Appt> list2 = new LinkedList<Appt>();
			 LinkedList<Appt> list3 = null;

			 list2 = t.deleteAppt(list, appt1);
			 assertEquals(list.size(), 3);
			 assertNull(list2);
			 list2 = t.deleteAppt(list,appt4);
			 assertNull(list2);


			 list2 = t.deleteAppt(list,appt2);
			 assertNull(list2);

			 list.add(appt4);

			 list = t.deleteAppt(list3, appt1);
			 assertNull(list);

		 }

		 @Test
		  public void test05()  throws Throwable  {
		 	 TimeTable t = new TimeTable();
		 	 GregorianCalendar today = new GregorianCalendar(2010, 10, 5);
		 	 GregorianCalendar yesterday = new GregorianCalendar(2010, 10, 4);
		 	 GregorianCalendar tomorrow = new GregorianCalendar(2011, 10, 30);
		 	 int[] test = new int[8];
		 	 int[] test2 = new int[0];
		 	 int[] test3 = new int[3];
		 	 test3[0]=1;
		 	 test3[1]=2;
		 	 test3[2]=0;


		 	 Appt appt1 = new Appt(12,
		 						2 ,
		 						10 ,
		 						10 ,
		 						2010 ,
		 						"title",
		 					 "description");
		 	 Appt appt2 = new Appt(3,
		 						3 ,
		 						10 ,
		 						10 ,
		 						2010 ,
		 						"tfg",
		 					 "descrfgon");
		 	 Appt appt3 = new Appt(12,
		 						2 ,
		 						10 ,
		 						10 ,
		 						2010 ,
		 						"tfg",
		 					 "descrfgon");


							 LinkedList<Appt> list = new LinkedList<Appt>();
							 list.add(appt1);
							 list.add(appt2);
							 list.add(appt3);


							 LinkedList<Appt> list2 = new LinkedList<Appt>();

							 LinkedList<CalDay> calDays = t.getApptRange(list, today, tomorrow);

							 list2 = t.deleteAppt(list, appt3);
							//assertEquals(list2.size(), 2);



						 }
			 @Test
			  public void test07()  throws Throwable  {
					TimeTable t = new TimeTable();
					GregorianCalendar today = new GregorianCalendar(2010, 10, 5);
					GregorianCalendar yesterday = new GregorianCalendar(2010, 10, 4);
					GregorianCalendar tomorrow = new GregorianCalendar(2010, 10, 30);
					int[] test = new int[8];
					int[] test2 = new int[0];
					int[] test3 = new int[3];
					test3[0]=2;
					test3[1]=1;
					test3[2]=0;

					Appt appt1 = new Appt(12,
									 2 ,
									 15 ,
									 10 ,
									 2010 ,
									 "title",
									"description");
					Appt appt2 = new Appt(3,
									 3 ,
									 15 ,
									 10 ,
									 2010 ,
									 "tfg",
									"descrfgon");
					Appt appt3 = new Appt(12,
									 2 ,
									 16 ,
									 10 ,
									 2010 ,
									 "tfg",
									"descrfgon");


					int[] recurringDays = {2,3,4};

					appt3.setRecurrence(recurringDays, 1, 1, 1000);

					LinkedList<Appt> list = new LinkedList<Appt>();
					list.add(appt1);
					list.add(appt2);
					list.add(appt3);

					LinkedList<CalDay> calDays = t.getApptRange(list, today, tomorrow);

					assertEquals(2, calDays.get(10).getAppts().size());
					assertEquals(1, calDays.get(11).getAppts().size());
					assertEquals(1, calDays.get(18).getAppts().size());


					assertEquals(appt1, list.get(0));
					t.permute(list, test3);
					assertEquals(appt1, list.get(0));




				}
				@Test
				 public void test08()  throws Throwable  {
					 TimeTable t = new TimeTable();
					 GregorianCalendar today = new GregorianCalendar(2010, 10, 5);
					 GregorianCalendar yesterday = new GregorianCalendar(2010, 10, 4);
					 GregorianCalendar tomorrow = new GregorianCalendar(2010, 10, 30);
					 int[] test = new int[8];
					 int[] test2 = new int[0];
					 int[] test3 = new int[3];
					 test3[0]=2;
					 test3[1]=1;
					 test3[2]=0;

					 Appt appt1 = new Appt(12,
										2 ,
										15 ,
										10 ,
										2010 ,
										"title",
									 "description");
					 Appt appt2 = new Appt(3,
										3 ,
										15 ,
										10 ,
										2010 ,
										"tfg",
									 "descrfgon");
					 Appt appt3 = new Appt(12,
										2 ,
										16 ,
										10 ,
										2010 ,
										"tfg",
									 "descrfgon");


					 int[] recurringDays = {9};

					 appt3.setRecurrence(recurringDays, 1, 1, 1000);

					 LinkedList<Appt> list = new LinkedList<Appt>();
					 list.add(appt1);
					 list.add(appt2);
					 list.add(appt3);

					 LinkedList<CalDay> calDays = t.getApptRange(list, today, tomorrow);

					 assertEquals(2, calDays.get(10).getAppts().size());
					 assertEquals(1, calDays.get(11).getAppts().size());
					 assertEquals(0, calDays.get(18).getAppts().size());


					 assertEquals(appt1, list.get(0));
					 list = t.permute(list, test3);
					 assertEquals(appt1, list.get(0));




				 }

//add more unit tests as you needed
}
