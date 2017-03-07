/**
 * This class represents an object that represents how the contact list is printed as a whole. Also, 
 * one object of this class represents the search feature that find matches based on last name
 * and displaying them on the console. Another feature is save on exit where all contact list 
 * entries are stored in disk and reopens on the next run of the program.
 * 
 * By: DA
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*; // Interface used for saving to disk and sorting
import java.io.Serializable; // Interface used for saving to disk

public class AllContactList {
	private static final int DEFAULT_SIZE = 100;
	private Scanner userInput   = new Scanner (System.in);
	private Person person1 = new Person();

	private ArrayList<Person> allPersonArray = new ArrayList<Person>();
	
	// FIXME: BELOW ARE UNDER BETA TESTING!
	
	// FIXME: PROBLEM WITH ARRAY SIZE if user does not fill it, sort won't work
	private Person[] arrayPerson = new Person [DEFAULT_SIZE]; // Only references from objects cannot sort
	private int numOfEntry = 0; // initialize private variable for method read; Purpose: person counter
	// FIXME: PROBLEM WITH ARRAY SIZE if user does not fill it sort won't work
	private String[] sortArrayPerson = new String[2];; // Array for sorting copies over Person [] array
	
	/**
	 * Below is under testing to add contents to arraylist allPersonArray
	 */
	public void addContact(Person newPerson) {
		allPersonArray.add(newPerson);
	}
	
	
	/**
	 * This methods reads userInput for firstname, lastname, email address, phone, and notes.
	 * userInput for Person class private data member variables
	 */
	public void readPerson() {
		
		
		
		// FIXME: BELOW ARE UNDER BETA TESTING!
		/*
		arrayPerson[numOfEntry] = new Person();
		System.out.print("First name: ");
		String newFirstname = userInput.nextLine();
		arrayPerson[numOfEntry].setFirstname(newFirstname);
		System.out.print("Last name: ");
		String newLastname = userInput.nextLine();
		if (newLastname.equals(null) || newLastname.equals("")) {
			System.out.println("Reached the end of main(), Program ran successfully."); // usually go back to menu
			return;
		}
		else {
			arrayPerson[numOfEntry].setLastname(newLastname);
		}
		System.out.print("Street Address: ");
		String newStreetAddress = userInput.nextLine();
		arrayPerson[numOfEntry].setStreetaddress(newStreetAddress);
		System.out.print("E-mail: ");
		String newEmail = userInput.nextLine();
		arrayPerson[numOfEntry].setEmail(newEmail);
		// FIXME: STRICT PHONE NUMBER INPUT HOW TO MAKE IT FLEXIBLE?
		System.out.print("Phone: ");
		String newPhone = userInput.nextLine();
		if (newPhone.length() > 10) {
			System.out.print("Please enter a 10-digit phone# to continue: ");
			newPhone = userInput.nextLine();
			newPhone = newPhone.substring(0, 3) + "-" + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length());
			arrayPerson[numOfEntry].setPhone(newPhone);
		}
		else if (newPhone.length() < 10) {
			System.out.print("Please enter a 10-digit phone# to continue: ");
			newPhone = userInput.nextLine();
			newPhone = newPhone.substring(0, 3) + "-" + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length());
			arrayPerson[numOfEntry].setPhone(newPhone);
		}
		else {
			newPhone = newPhone.substring(0, 3) + "-" + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length());
			arrayPerson[numOfEntry].setPhone(newPhone);
		}
		numOfEntry++; // or numOfEntry += 1;
		*/
	}
	
	/**
	 * This methods reads userInput for house, city, state, and zip.
	 * userInput for Address class private data member variables
	 */
	public void readPersonNext() {
		
		
		
	}
	
	
	// FIXME: Not sure if needed and what to comment
	/**
	 * This method defines a toString method. Display all
	 */
	public String toString() {
		String allContactListInfo;
		allContactListInfo = "";
		for (int i = 0; i < numOfEntry; i++) {
			allContactListInfo = arrayPerson[i].getFirstname() + " " + arrayPerson[i].getLastname() + "\n";
			sortArrayPerson[i] += arrayPerson[i];
		
		}
		return allContactListInfo;
	}
	
	/**
	 * This method returns and prints all entries of the contact list sorted alphabetically.
	 */
	public void printToConsole() {
		
		int index = 0;
		while (allPersonArray.size() > index) {
			System.out.println(allPersonArray.get(index));
			index++;

		}
		//String allContactsInfo = "";
		
		/*for (int i = 0; i < numOfEntry; i++) {
			allContactsInfo = arrayPerson[i].getFirstname() + " " + arrayPerson[i].getLastname() + " "
							   + arrayPerson[i].getPhone() + arrayAddress[i].getHouse() + arrayAddress[i].getCity()
							   + arrayAddress[i].getState() + arrayAddress[i].getZip();
			sortArrayPerson[i] = allContactsInfo;
			}*/
		
	}
	
	/**
	 * This method sorts the array list last name in alphabetical order.
	 * By: DA
	 */
	public void sortLastName() {
		/*System.out.println("Before sort: " + Collections.toString(allPersonArray)); // TESTING! TO SEE INSIDE ARRAY
		Collections.sort(allPersonArray);
		System.out.println("After sort: " + Arrays.toString(allPersonArray)); // TESTING! TO SEE INSIDE ARRAY*/

	}
	
	/**
	 * This method sorts the array list first name in alphabetical order.
	 * By: DA
	 */
	public void sortFirstName() {
		
	}
	
	/**
	 * This method returns and prints the search result according to last name.
	 */
	public String searchLastName() {
		return "";
	}
	
	/**
	 * This method saves all entries to the contact list program to disk then exits the program.
	 */
	public void saveOnExit() {

	}
	
}