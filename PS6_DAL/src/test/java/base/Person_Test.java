package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import domain.PersonDomainModel;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;
import java.time.Instant;
import java.time.LocalDate;
import domain.PersonDomainModel;
import base.PersonDAL;

public class Person_Test {
	
	static PersonDomainModel person1;
	static PersonDomainModel person2;
	 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
		
		LocalDate localdate1 = LocalDate.of(1996, Month.JANUARY, 1);
		Instant instant1 = localdate1.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		Date date1 = Date.from(instant1);
		
		person1 = new PersonDomainModel("Joe","Smith", "123 Lane Dr",18834, "Newark",date1);
	
		
		LocalDate localdate2 = LocalDate.of(1995, Month.FEBRUARY, 2);
		Instant instant2 = localdate2.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		Date date2 = Date.from(instant2);
		
		person2 = new PersonDomainModel("Jess","White","456 Lisa Dr",19934,"Lincoln",date2);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		person1 = null;
		person2 = null;
		
	}


	@Test
	public void AddPersonTest() {
		
		PersonDAL.addPerson(person1);
		PersonDAL.addPerson(person2);
		
	}
	
	@Test
	public void UpdatePersonTest() {	
		
		person1.setFirstName("John");
		PersonDAL.updatePerson(person1);	
		
	}
	
	
	@Test
	public void DeletePersonTest() {
		
		PersonDAL.deletePerson(person1.getPersonUUID());
		
	}
	


}
