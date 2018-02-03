package com.hexa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hexa.domain.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/hexa/cfgs/spring.xml");
    	Employee emp = context.getBean("employee",Employee.class);
    	System.out.println(emp.toString());
    
  
    }
}
