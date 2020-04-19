package himani.evolent.service;

import java.util.List;

import himani.evolent.entity.Contact;

public interface ContactService {

	public List<Contact> getContacts();

	public void saveContact(Contact theContact);

	public Contact getContact(int theId);

	public void deleteContact(int theId);
	
}
