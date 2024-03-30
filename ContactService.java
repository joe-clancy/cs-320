// Joe Clancy
// 3/12/2024
// CS-320
// 3-2 Milestone: Contact Service
//
// ContactService Class

package ContactService;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	
	// Static list of contact objects
	private static List<Contact> contacts = new ArrayList<Contact>();
	
	// Singleton ContactService
	private static ContactService contactService = new ContactService();
	
	private ContactService() {}
	
	// getter function for ContactService object
	public static ContactService getContactService() {
		return contactService;
	}
	
	// Function to create new contact with a unique contactId
	public Contact newContact(String contactId, String firstName, String lastName, String phone, String address) {
		
		// Check contactId for uniqueness
		for (Contact existingContact : contacts) {
			if (existingContact.getContactId() == contactId) {
				// Non-unique contact, throw exception
				throw new IllegalArgumentException("Invalid contactId");
			}
		}
		
		// Create new contact
		Contact contact = new Contact(contactId, firstName, lastName, phone, address);
		
		// Add new contact to contacts list
		contacts.add(contact);
		
		return contact;
		
	}
	
	// Function to retrieve a contact by contactId
	public Contact getContact(String contactId) {
		
		Contact contact = null;
		
		// Find matching contact
		for (Contact existingContact : contacts) {
			if (existingContact.getContactId() == contactId) {
				//set contact
				contact = existingContact;
			}
		}
		
		return contact;
	}
	
	// Function to delete existing contact from contactId
	public void deleteContact(String contactId) {
		
		// Find matching contact
		for (Contact existingContact : contacts) {
			if (existingContact.getContactId() == contactId) {
				// Delete contact
				contacts.remove(existingContact);
				break;
			}
		}
	}
	
	// Function to update contact firstName from contactId
	public void setContactFirstName(String contactId, String firstName) {
		
		// Find matching contact
		for (Contact existingContact : contacts) {
			if (existingContact.getContactId() == contactId) {
				// Update contact firstName
				existingContact.setFirstName(firstName);
				break;
			}
		}
	}
	
	// Function to update contact lastName from contactId
	public void setContactLastName(String contactId, String lastName) {
		
		// Find matching contact
		for (Contact existingContact : contacts) {
			if (existingContact.getContactId() == contactId) {
				// Update contact lastName
				existingContact.setLastName(lastName);
				break;
			}
		}
	}
	
	// Function to update contact phone from contactId
	public void setContactPhone(String contactId, String phone) {
		
		// Find matching contact
		for (Contact existingContact : contacts) {
			if (existingContact.getContactId() == contactId) {
				// Update contact phone
				existingContact.setPhone(phone);
				break;
			}
		}
	}
	
	// Function to update contact address from contact ID
	public void setContactAddress(String contactId, String address) {
		
		// Find matching contact
		for (Contact existingContact : contacts) {
			if (existingContact.getContactId() == contactId) {
				// Update contact address
				existingContact.setAddress(address);
				break;
			}
		}
	}

}
