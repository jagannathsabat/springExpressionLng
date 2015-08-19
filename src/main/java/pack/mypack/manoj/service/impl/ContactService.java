package pack.mypack.manoj.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pack.mypack.manoj.dao.DAO;
import pack.mypack.manoj.model.Contact;
import pack.mypack.manoj.service.Service;

@org.springframework.stereotype.Service
public class ContactService implements Service<Contact> {
	
	private Logger LOG = LoggerFactory.getLogger(ContactService.class);
	
	@Autowired
	private DAO<Contact> contactDAO;

	@Transactional
	@Override
	public Contact save(Contact entity) {
		
		LOG.debug("TULU MSG : ContactService.save() method hit.");
		return contactDAO.save(entity);
	}

	@Override
	public Contact get(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> list() {
		
		LOG.debug("TULU MSG : ContactService.List() hit...");
		return contactDAO.list();
	}

	@Override
	public Contact update(Contact entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact delete(Contact entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
