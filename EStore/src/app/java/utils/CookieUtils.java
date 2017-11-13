package app.java.utils;

import javax.servlet.http.Cookie;

public class CookieUtils {

	public static Cookie getCookie(Cookie[] cookies, String name){
		if(cookies != null){
			for (Cookie cookie : cookies) {
				if(cookie != null){
					String cookieName = cookie.getName();
					if(cookieName.equals(name)){
						return cookie;
					}
				}
			}
			return null;
		}
		return null;
	}
	
}
