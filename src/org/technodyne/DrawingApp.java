package org.technodyne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.beans.factory.xml.XmlBeanFactory;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
		// "spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}
}
