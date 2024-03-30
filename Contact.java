// Joe Clancy
// 3/12/2024
// CS-320
// 3-2 Milestone: Contact Service
//
// Contact Class

package ContactService;

public class Contact {
	String contactId;
	String firstName;
	String lastName;
	String phone;
	String address;
	
	// Prohibit instantiation without parameters
	private Contact() {}

	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		this();
		
		// Throw exception if contactId null or >10 length
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contactId");
		}
		
		// Throw exception if firstName null or >10 length
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		
		// Throw exception if lastName null or >10 length
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		
		// Throw exception if phone null or !10 length
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		
		// Throw exception if address null or >30 length
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}		
		
		// set private data members from parameters
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	// getter function for contactId
	public String getContactId() {
		return contactId;
	}

	// getter function for firstName
	public String getFirstName() {
		return firstName;
	}
	
	// getter function for lastName
	public String getLastName() {
		return lastName;
	}
	
	// getter function for phone
	public String getPhone() {
		return phone;
	}
	
	// getter function for address
	public String getAddress() {
		return address;
	}

	// setter function for firstName
	public void setFirstName(String firstName) {
		
		// Throw exception if firstName null or >10 length
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		
		this.firstName = firstName;
	}
	
	// setter function for lastName
	public void setLastName(String lastName) {
		
		// Throw exception if lastName null or >10 length
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		
		this.lastName = lastName;
	}	
	
	// setter function for phone
	public void setPhone(String phone) {
		
		// Throw exception if phone null or !10 length
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		
		this.phone = phone;
	}	

	// setter function for address
	public void setAddress(String address) {
		
		// Throw exception if address null or >30 length
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}	
		
		this.address = address;
	}	

}
