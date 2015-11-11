package domain;


import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import util.LocalDateAdapter;

public class PersonDomainModel {

    protected UUID PersonUUID;
	protected String firstName;
    protected String lastName;
    protected String street;
    protected Integer postalCode;
    protected String city;
    protected Date birthday;

    /**
     * Default constructor.
     */
    
    protected PersonDomainModel() {
	}

	/**
	 * Student - This constructor will generate a new instance of Student.
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param dOB
	 */
	public PersonDomainModel(String firstName,String lastName, String street, Integer postalCode, String city,Date birthday) {
		super();
		this.setPersonUUID(UUID.randomUUID());		
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
		this.birthday = birthday;
	}

	public PersonDomainModel(PersonDomainModel per)
	{
		super();
		this.setPersonUUID(UUID.randomUUID());		
		firstName = per.getFirstName();
		lastName = per.getLastName();
		street = per.getStreet();
		postalCode = per.getPostalCode();
		city = per.getCity();
		birthday = per.getBirthday();
		
	}

    public UUID getPersonUUID() {
        return PersonUUID;
    }
    
    public void setPersonUUID(UUID PersonID) {
    	this.PersonUUID = PersonID;
    }
    
   
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
   

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

  

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

  

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

 

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

  
}