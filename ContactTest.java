// Joe Clancy
// 3/12/2024
// CS-320
// 3-2 Milestone: Contact Service
//
// ContactTest Class

package ContactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {
	// Test constructor parameter requirements
	@Test
	void testContactConstructor() {
		// Test contactId length not > 10
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012345678910", "John", "Doe", "5555555555", "1 Willow Rd");
		});
		
		// test contactId not null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Doe", "5555555555", "1 Willow Rd");
		});
		
		// test firstName length not > 10
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Johnthalemew", "Doe", "5555555555", "1 Willow Rd");
		});
	
		// test firstName not null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", null, "Doe", "5555555555", "1 Willow Rd");
		});
		
		// test lastName length not > 10
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "John", "Doebertinksy", "5555555555", "1 Willow Rd");
		});
		
		// test lastName not null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "John", null, "5555555555", "1 Willow Rd");
		});
		
		// test phone length is 10
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "John", "Doe", "55555555555", "1 Willow Rd");
		});
		
		// test phone not null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "John", "Doe", null, "1 Willow Rd");
		});
		
		// test address length not > 30
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "John", "Doe", "5555555555", "!!!!!!!!!!1 Willow Rd!!!!!!!!!!");
		});
		
		// test address not null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "John", "Doe", "5555555555", null);
		});
	}
	
	// Test getter functions get the right things
	@Test
	void testContactGetters() {
		Contact contact = new Contact("0123456789", "John", "Doe", "5555555555", "1 Willow Rd");
		
		// Confirm attributes are the same we instantiated contact with
		assertTrue(contact.getContactId() == "0123456789");
		assertTrue(contact.getFirstName() == "John");
		assertTrue(contact.getLastName() == "Doe");
		assertTrue(contact.getPhone() == "5555555555");
		assertTrue(contact.getAddress() == "1 Willow Rd");
	}
	
	// Test setter functions set the right things
	@Test
	void testContactSetters() {
		Contact contact = new Contact("0123456789", "John", "Doe", "5555555555", "1 Willow Rd");
		
		contact.setFirstName("Dave");
		// Test firstName updated correctly
		assertTrue(contact.getFirstName() == "Dave");
		
		// Test firstName parameter constraints
		assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("Johnthalemew"));
		assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
		
		contact.setLastName("Smith");
		// Test lastName updated correctly
		assertTrue(contact.getLastName() == "Smith");
		
		// Test lastName parameter constraints
		assertThrows(IllegalArgumentException.class, () -> contact.setLastName("Doebertinksy"));
		assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));

		contact.setPhone("9999999999");
		// Test phone updated correctly
		assertTrue(contact.getPhone() == "9999999999");
		
		// Test phone parameter constraints
		assertThrows(IllegalArgumentException.class, () -> contact.setPhone("55555555555"));
		assertThrows(IllegalArgumentException.class, () -> contact.setPhone(null));
		
		contact.setAddress("2 Birch Ln");
		
		// Test address updated correctly
		assertTrue(contact.getAddress() == "2 Birch Ln");
		
		// Test address parameter constraints
		assertThrows(IllegalArgumentException.class, () -> contact.setAddress("!!!!!!!!!!1 Willow Rd!!!!!!!!!!"));
		assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
	}	

}
