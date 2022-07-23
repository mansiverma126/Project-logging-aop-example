package org.learn.java;

import org.learn.java.aop.StringModifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Logger logger = LoggerFactory.getLogger(Application.class);

		StringModifier modifier = context.getBean(StringModifier.class);
		String ourString = "There was an old man and is pacing in the park";
		String modifiedString = modifier.replaceAllA(ourString);
		
		System.out.println(modifiedString);
		logger.debug("Debug message:{}", modifiedString);
		context.close();
	}
}
