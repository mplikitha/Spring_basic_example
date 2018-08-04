package com.stackroute.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springdemo {
	public static void main(String []args) {
ApplicationContext acp=new ClassPathXmlApplicationContext("spring.xml");
Springdemo1 obj=(Springdemo1)acp.getBean("demobean");
obj.draw();
}
}
