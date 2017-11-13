package app.java.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解:使用@interface关键字.
 * @author JYL
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {

	// 属性
//	int num();
	
//	String name();
	
//	String value();
	
	String name();
	String job();
	String addr();
	
}
