/**
 * This class represents an object that stores the first name, last name, email, phone, and  notes for one person.
 * 
 * By: DA
 */
import java.io.*; // Interface used for saving to disk and sorting
import java.io.Serializable; // Interface used for saving to disk
import java.util.Arrays;
import java.util.Scanner;

public class Person {
	private String firstname = "";
	private String lastname = "";
	private String house = "";
	private String city = "";
	private String state = "";
	private String zip = "";
	private String email = "";
	private String phone = "";
	private String notes = "";
	
	private Scanner userInput = new Scanner (System.in);
	
	/**
	 * Read userInput
	 */
	public void readPerson() {
		// Setters
		System.out.print("First name: ");
		String newFirstname = userInput.nextLine();
		setFirstname(newFirstname);
		System.out.print("Last name: ");
		String newLastname = userInput.nextLine();
		setLastname(newLastname);
		System.out.print("House: ");
		String newHouse = userInput.nextLine();
		setHouse(newHouse);
		System.out.print("City: ");
		String newCity = userInput.nextLine();
		setCity(newCity);
		System.out.print("State: ");
		String newState = userInput.nextLine();
		setState(newState);
		System.out.print("Zip: ");
		String newZip = userInput.nextLine();
		setZip(newZip);
		System.out.print("E-mail: ");
		String newEmail = userInput.nextLine();
		setEmail(newEmail);
		System.out.print("Phone: ");
		String newPhone = userInput.nextLine();
		setPhone(newPhone);
		System.out.print("Notes: ");
		String newNotes = userInput.nextLine();
		setNotes(newNotes);
		System.out.println();
		
	}
	
	/**
	 * Sets the value for firstname to "newFirstname". By: DA
	 */
	public void setFirstname(String newFirstname) {
		firstname = newFirstname;
	}

	/**
	 * Sets the value for lastname to "newLastname". By: DA
	 */
	public void setLastname(String newLastname) {
		if (newLastname.equals("")) {
			System.out.println("Contact not added, last name is blank.");
			
		}
		else {
			lastname = newLastname;
		}
		
	}
	
	/**
	 * This method Sets the value for house to "newHouse".
	 * By: DA
	 */
	public void setHouse(String newHouse) {
		house = newHouse;
		
	}

	/**
	 * Sets the value for city to "newCity".
	 * By: DA
	 */
	public void setCity(String newCity) { // newCity is a parameter
		city = newCity;
		
	}

	/**
	 * Sets the value for state to "newState".
	 * By: DA
	 */
	public void setState(String newState) { // newState is a parameter
		state = newState;
	}

	/**
	 * Sets the value for zip to "newZip".
	 * By: DA
	 */
	public void setZip(String newZip) { // newZip is a parameter
		zip = newZip;
	}

	/**
	 * Sets the value for email to "newEmail". By: DA
	 */
	public void setEmail(String newEmail) {
		email = newEmail;

	}

	/**
	 * Sets the value for phone to "newPhone". By: DA
	 */
	public void setPhone(String newPhone) {
		
		if (newPhone.length() > 10) {
			System.out.print("Please enter a 10-digit phone# to continue: ");
			newPhone = userInput.nextLine();
			newPhone = newPhone.substring(0, 3) + "-" + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length());
			phone = newPhone;
			
		}
		else if (newPhone.length() == 10) {
			newPhone = newPhone.substring(0, 3) + "-" + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length());
			phone = newPhone;
			
		}

	}

	/**
	 * Sets the value for notes to "newNotes". By: DA
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}

	/**
	 * Returns the value of firstname. By: DA
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Returns the value of lastname. By: DA
	 */
	public String getLastname() {
		return lastname;
	}
	
	/**
	 * Returns the value of house.
	 * By: DA
	 */
	public String getHouse () {
		return house;
	}
	
	/**
	 * Returns the value of city.
	 * By: DA
	 */
	public String getCity () {
		return city;
	}
	
	/**
	 * Returns the value of state.
	 * By: DA
	 */
	public String getState () {
		return state;
	}
	
	/**
	 * Returns the value of zip.
	 * By: DA
	 */
	public String getZip () {
		return zip;
	}

	/**
	 * Returns the value of email. By: DA
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Returns the value of phone. By: DA
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Returns the value of zip. By: DA
	 */
	public String getNotes() {
		return notes;
	}
	
	public String toString() { 
		return "Name: " + firstname + " " + lastname + "\n" + "Address: " + house + " " + city + " , " +
			   state + " " + zip + "\n" + "E-mail: " + email + "\n" + "Phone: " + phone + "\n" + "Notes: " + notes;
	}
}