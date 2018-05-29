package pl.mrmario.tutorials.spring.owczarek.cz13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean someBean= context.getBean("someBean", SomeBean.class);
		
		System.out.println(someBean.getInjectoinBean1().getName());
		System.out.println(someBean.getInjectoinBean2().getName());
			}
}