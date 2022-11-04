package com.UST.hib.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.UST.hib.entity.Person;

public class PersonDao {
	
	@Autowired
	private SessionFactory factory;

	public void savePerson(Person person) {
		getSession().save(person);
		
	}

	private Session getSession() {
		// TODO Auto-generated method stub
		Session session=factory.getCurrentSession();
		if(session==null) {
			session=factory.openSession();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return getSession().createCriteria(Person.class).list();
	}

}
