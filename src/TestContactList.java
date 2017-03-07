/**
 * This program allows a user to enter a new person into a contact list, print the entire contact list in the console,
 * search a person's information by last name, saves sessions on exit, and start the program again with saved info.
 *  
 * By: DA
 */
import java.util.Scanner;
import java.io.*; // Interface used for saving to disk
import java.io.Serializable; // Interface used for saving to disk
import java.util.Arrays;

public class TestContactList {

	public static void main(String[] args) {
		// Object userInput from class Scanner
		Scanner userInput;
		userInput = new Scanner(System.in);
		
		Person person2;
		person2 = new Person();
		// Object contactsEdit from class AllContactList
		AllContactList contactsEdit;
		contactsEdit = new AllContactList();
		
		int numOfEntry = 0; // for loop variable
		
		// Object person1 from class Person
		Person person1;
		person1 = new Person();
		person1.readPerson(); // adds first contact
		contactsEdit.addContact(person1); // adds to arraylist allPersonArray
		
		person2.readPerson(); // add second contact
		contactsEdit.addContact(person2); // adds to arraylist allPersonArray
		
		//System.out.print(person1.toString());
		
		//contactsEdit.readPerson();
		//contactsEdit.readPerson();
		
		//System.out.println(contactsEdit.toString());
		contactsEdit.printToConsole();
		//contactsEdit.sortFirstName();
		//contactsEdit.sortLastName();
		contactsEdit.searchLastName();
		contactsEdit.saveOnExit();

		userInput.close();

		System.out.println("Reached the end of main(), Program ran successfully.");

	}
}