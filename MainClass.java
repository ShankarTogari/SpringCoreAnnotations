package com.spring.annotations;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsr330.annotations.CustomerServiceJSR330;

public class MainClass {
	public static void main(String[] args) {
//	    	ApplicationContext context = 
//	    		new ClassPathXmlApplicationContext(new String[] {"JSRAnnotationsAutoScan.xml"});
//
//	    	CustomerServiceJSR330 custJSR330 = (CustomerServiceJSR330)context.getBean("customerServiceJSR330");
//	    	custJSR330.save();
//	    	
//	    	
//	        	CustomerService cust = (CustomerService)context.getBean("customerService");
//	        	cust.save();

		List list = new ArrayList<>();
		list.add("James");
		list.add("Gosling");
		list.add("Rhod");

		// list.forEach(System.out::println);

		Consumer c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}

		};

		list.forEach(c);

		Consumer c1 = (t) -> System.out.println(t);
		System.out.println("read");
		list.forEach(c1);
		
		System.out.println("=====================================");
		
		List list1 = new ArrayList<>();
		list1.add("James1");
		list1.add("Gosling1");
		list1.add("Rhod1");
		list1.forEach(System.out::print);

	}
}

//		List list = new ArrayList<>();
//		list.add("James");
//		list.add("Gosling");
//		list.add("Rhod");
//
//		Consumer c=new ConsumerImpl();
//		list.forEach(c);
//	}
//
//}
//
//class ConsumerImpl implements Consumer<String> {
//
//	@Override
//	public void accept(String t) {
//		System.out.println(t);
//	}
//
//}
