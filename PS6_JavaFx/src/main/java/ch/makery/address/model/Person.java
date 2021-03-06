package ch.makery.address.model;

import java.time.LocalDate;
import java.util.Date;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ch.makery.address.util.LocalDateAdapter;
import domain.PersonDomainModel;

public class Person extends PersonDomainModel {

    public Person() {
        this(null, null, null, (Integer) null, null, null);
    }

    public Person(String firstName, String lastName, String street, int postalCode, String city, Date birthday ) {
        this.setFirstName(firstName);
        this.setLastName(lastName);

        // Some initial dummy data, just for convenient testing.
        this.setStreet(street);
        this.setPostalCode(postalCode);
        this.setCity(city);
        this.setBirthday(birthday);
    }
    
    public StringProperty firstNameProperty() {
    	return new SimpleStringProperty(this.firstName);
        
    }
    
    public StringProperty lastNameProperty() {
        return new SimpleStringProperty(this.lastName);
    }
    
    public StringProperty streetProperty() {
        return new SimpleStringProperty(this.street);
    }
    
    public IntegerProperty postalCodeProperty() {
        return new SimpleIntegerProperty(this.postalCode);
    }
    
    public StringProperty cityProperty() {
        return new SimpleStringProperty(this.city);
    }
    
    public ObjectProperty<Date> birthdayProperty() {
        return new SimpleObjectProperty<Date>(this.birthday);
    }

}