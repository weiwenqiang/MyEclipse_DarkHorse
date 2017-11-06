package com.heima.handler;

import java.sql.ResultSet;

public interface ResultHandler {

	public Object handler(ResultSet rs,Class clazz) ;
}
