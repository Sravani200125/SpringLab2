package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("myBeans.xml");
		
		Employee e=(Employee) ctx.getBean("emp");
		e.printEmployee();
	}

}
