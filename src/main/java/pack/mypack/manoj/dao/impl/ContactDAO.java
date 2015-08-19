package pack.mypack.manoj.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pack.mypack.manoj.dao.DAO;
import pack.mypack.manoj.model.Contact;

@Repository
public class ContactDAO implements DAO<Contact> {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		
		return sessionFactory.getCurrentSession();
	}
	
	@Transactional
	@Override
	public Contact save(Contact entity) {
		
		Object generatedId=getCurrentSession().save(entity);
		entity.setId((Integer)generatedId);
		return entity;
	}

	@Override
	public Contact get(Contact entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Contact> list() {
		
		String hqlStr = "from pack.mypack.manoj.model.Contact";
		Query query = getCurrentSession().createQuery(hqlStr);
		return query.list();
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
