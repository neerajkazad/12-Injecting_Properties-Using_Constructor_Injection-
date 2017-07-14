package com.ip.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ip.beans.Course;

public class IPTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ip/common/application-context.xml"));
		Course mca = factory.getBean("mca",Course.class);
		mca.showFacultySubjects();
	}
}
