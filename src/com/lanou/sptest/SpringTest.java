package com.lanou.sptest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lanou.bean.Car;
import com.lanou.bean.Person;

public class SpringTest {
	
	@Test
	public void myTest(){
		
		
		System.out.println("çœ‹æŠŠä½ èƒ½å¾—ä¸è¡Œ");
		
		
		
		// 1.ä¸ä½¿ç”¨springä¸‹çš„å¯¹è±¡åˆ›å»º
//		Car car = new Car();
//		car.setName("å°é»„");
//		car.setNum(2222);
//		car.setBrand("å®é©¬");
//		
//		System.out.println(car);
		
		System.out.println("¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ");
		
		// è¯»å–appContexté…ç½®æ–‡ä»¶ä¸­çš„ä¿¡æ¯
		ApplicationContext aContext = 
				new ClassPathXmlApplicationContext("appContext.xml");
		
		System.out.println("¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ");
		
//		Car car = (Car) aContext.getBean("car5");
		
//		System.out.println(car);
		
		Person person = (Person) aContext.getBean("person");
		
		System.out.println(person);
		
		System.out.println("¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ");
			
	}

}







