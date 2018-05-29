package pl.mrmario.tutorials.spring.owczarek.cz14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrMario108
 *
 */
public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Application aplikacja= context.getBean("aplikacja", Application.class);
		
		System.out.println(aplikacja.getUserRepository().exists("MrMario108"));
		System.out.println(aplikacja.getDictionaryRepository().getMapValue());
			}
}