package com.jsr330.annotations;

import javax.inject.Named;

//Both Spring and JSR330 annotations need component scan to works.
@Named
public class CustomerDAOJSR330 {

	public void save() {
		System.out.println("CustomerDAO save JSR330method...");
	}
}
