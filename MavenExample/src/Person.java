import java.time.LocalDate;
//Now consider Person class with first name, last name, birth date, emails, mobile numbers. 
//Person objects with same email are same person. 
//Person can have multiple emails and mobile numbers.
import java.util.*;

public class Person {
	String firstName;
	String lastName;
	LocalDate birthDate;
	String email;
	Set<String> phones;

	public Person(String firstName, String lastName, LocalDate birthDate,String email) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.birthDate = birthDate;
	    this.email = email;
	    this.phones = new HashSet<>();
	}

    @Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		if ( this.email.equals(p.email) ) {
			return true;
		}
		return false;

	}
    @Override
    public int hashCode() {
    	return email.hashCode();
    	
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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
        this.email=(email);
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public void addPhone(String phone) {
        this.phones.add(phone);
    }

	public Set<String> getPhones() {
		return phones;
	}
	
	public String toString() {
		return firstName+" "+lastName+" "+birthDate+" "+email+" "+ phones;
	}


}
