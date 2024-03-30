// Joe Clancy
// 3/12/2024
// CS-320
// 3-2 Milestone: Contact Service
//
// ContactServiceTest Class

package ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactService() {
		ContactService contactService = ContactService.getContactService();
		contactService.newContact("0123456789", "John", "Doe", "5555555555", "1 Willow Rd");
		
		// Test contact initialized with correct values
		assertTrue(contactService.getContact("0123456789").getFirstName().equals("John"));
		assertTrue(contactService.getContact("0123456789").getLastName().equals("Doe"));
		assertTrue(contactService.getContact("0123456789").getPhone().equals("5555555555"));
		assertTrue(contactService.getContact("0123456789").getAddress().equals("1 Willow Rd"));
		
		// Test duplicate contactID not permitted
		assertThrows(IllegalArgumentException.class, () -> {
			contactService.newContact("0123456789", "Dave", "Smith", "9999999999", "2 Birch Ln");
		});
		
		// Update contact attributes
		contactService.setContactFirstName("0123456789", "Dave");
		contactService.setContactLastName("0123456789", "Smith");
		contactService.setContactPhone("0123456789", "9999999999");
		contactService.setContactAddress("0123456789", "2 Birch Ln");
		
		// Test contact attributes updated correctly
		assertTrue(contactService.getContact("0123456789").getFirstName().equals("Dave"));
		assertTrue(contactService.getContact("0123456789").getLastName().equals("Smith"));
		assertTrue(contactService.getContact("0123456789").getPhone().equals("9999999999"));
		assertTrue(contactService.getContact("0123456789").getAddress().equals("2 Birch Ln"));
		
		// Delete contact
		contactService.deleteContact("0123456789");
		
		// Test contact is deleted
		assertTrue(contactService.getContact("0123456789") == null);
		
	}
}
