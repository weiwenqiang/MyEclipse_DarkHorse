package com.heima.jstl;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//��ʾ���Ʊ�ǩ���������ݸı�����
public class Demo4 extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		//�����������
		JspFragment body = getJspBody() ;
		//�����Ȱ�����д�뵽һ���������У�Ȼ��ӻ�������ȡ�����ݽ����޸ģ��޸ĵ�������д���������
		//����һ���ַ���������������Ա���Դ�����ȡ����
		StringWriter sw = new StringWriter() ;
		//������д�뻺������
		body.invoke(sw) ;
		//�ӻ���������ȡ����
		String s = sw.toString() ;
		//�ı�����
		s = s.toUpperCase() ;
		//��ȡ��������󣬽����������ҳ����
		JspWriter out = body.getJspContext().getOut() ;
		out.write(s) ;
	}
}
