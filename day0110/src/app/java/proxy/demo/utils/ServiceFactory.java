package app.java.proxy.demo.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import com.sun.org.apache.bcel.internal.generic.NEW;

import app.java.proxy.demo.bean.Userinfo;
import app.java.proxy.demo.service.OperateService;
import app.java.proxy.demo.service.impl.OperateServiceImpl;

/**
 * 该业务工厂类用于利用动态代理技术读取当前用户是否具有对应的业务权限.
 * 
 * @author JYL
 */
public class ServiceFactory {
	/**
	 * 该方法用于利用动态代理读取权限.
	 * 
	 * @return
	 */
	public static OperateService getOperateService(final Userinfo userinfo){
		
		OperateService proxyService = (OperateService) Proxy.newProxyInstance(OperateService.class.getClassLoader(), OperateServiceImpl.class.getInterfaces(), new InvocationHandler() {
			/**
			 * invoke()方法用于通过反射技术读取对应业务方法的权限信息.
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				
				Privilegeinfo privilege = method.getAnnotation(Privilegeinfo.class);
				// 获取对应业务方法的权限信息
				String privilegeinfo = privilege.value();
				
				// 获取当前用户的权限信息(查询数据库表,这里需要用户user_id信息)
				QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
				String sql = "SELECT PRIVILEGES.name FROM userprivilege,PRIVILEGES WHERE userprivilege.privilege_id = PRIVILEGES.id AND userprivilege.user_id=?";
				List<String> privileges = runner.query(sql, new ColumnListHandler<String>("name"), userinfo.getId());
				
				// 判断当前用户是否具有对应的权限信息
				for (String privilegeValue : privileges) {
					if(privilegeinfo.equals(privilegeValue)){
						// 如果具有
						return "success";
					}
				}
				// 如果没有
				return "error";
			}
		});
		return proxyService;
	}
}
