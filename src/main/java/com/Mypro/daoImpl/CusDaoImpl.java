package com.Mypro.daoImpl;

import com.Mypro.dao.CusDao;
import com.Mypro.model.Customer;

import com.Mypro.util.AbstractDao;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("CusDao")
public class CusDaoImpl extends AbstractDao<Integer, Customer> implements   CusDao {
@Autowired
private SessionFactory session;


	@Override
	public void SaveCustomer(Customer cus) {
		System.out.println("customer details loading to CusDaoIMPL");
		persist(cus);
		//return user;
	}

	@Override
	public boolean Savecustomers(Customer cus) {
		//session.getCurrentSession();
		session.openSession();
		save(cus);
	//	persist(cus);
		return true;
	}
}
