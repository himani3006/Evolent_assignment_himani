package himani.evolent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import himani.evolent.entity.Contact;
import himani.evolent.dao.ContactDao;

@Service
public class ContactServiceImpl implements ContactService {

	// need to inject Contact dao
	@Autowired
	private ContactDao contactDao;

	@Transactional
	public List<Contact> getContacts() {
		return contactDao.getContacts();
	}

	@Transactional
	public void saveContact(Contact theContact) {
		contactDao.saveContact(theContact);
		
	}

	@Transactional
	public Contact getContact(int theId) {
		return contactDao.getContact(theId);
	}
	
	@Transactional
	public void deleteContact(int theId) {
		contactDao.deleteContact(theId);
		
	}
	
	
}





