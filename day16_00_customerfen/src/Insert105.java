
import java.util.Date;

import com.heima.bean.Customer;
import com.heima.dao.CustomerDao;
import com.heima.dao.impl.CustomerDaoImpl;
import com.heima.utils.WebTools;
import com.heima.utils.WebUtils;

public class Insert105 {


	public static void main(String[] args) {
		
		CustomerDao dao = new CustomerDaoImpl() ;
		
		for (int i = 0; i < 105; i++) {
			Customer c = new Customer() ;
			c.setId(WebTools.createNewId());
			c.setName("����" + (i+1)) ;
			c.setCellphone(i + 1) ;
			c.setBirthday(new java.sql.Date(new Date().getTime())) ;
			c.setEmail("����" + i + "@itcast.cn") ;
			c.setGender("1") ;
			c.setHobby("�Է�,˯��") ;
			c.setType("vip") ;
			c.setDescription("��������") ;
			
			dao.add(c) ;
		}
	}

}
