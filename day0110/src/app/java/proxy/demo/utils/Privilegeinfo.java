package app.java.proxy.demo.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 当前注解用于配置用户的权限信息.
 *  * @Inherited注解:
 *    * 指示注释类型被自动继承。
 *    * 如果将该注解定义在接口的方法中,自动同步到该接口的实现类中.
 * @author JYL
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Privilegeinfo {

	String value();
	
}
