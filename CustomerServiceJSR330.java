package com.jsr330.annotations;
import javax.inject.Inject;
import javax.inject.Named;

//Both Spring and JSR330 annotations need component scan to works.
@Named
public class CustomerServiceJSR330 {
	@Inject
	CustomerDAOJSR330 customerDAO;

	public void save() {

		System.out.println("CustomerService save JSR330method...");
		customerDAO.save();

	}
}
