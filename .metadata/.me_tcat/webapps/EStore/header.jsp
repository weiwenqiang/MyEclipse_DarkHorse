<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="art-header">
                    <div class="art-header-png"></div>
                    <div class="art-header-jpeg">欢迎来到Estore购物商城！
                    	<c:if test="${empty user }">
                    		<a href="login.jsp">[登录]</a> <a href="regist.jsp">[免费注册]</a>
                    	</c:if>
                    	<c:if test="${not empty user }">
                    		您好，${user.nickname }。<a href="logout">[退出]</a>
                    	</c:if>
                    </div>
                    <div class="art-logo">
                        <h1 id="name-text" class="art-logo-name"><a href="#">Estore购物商城</a></h1>
                        <div id="slogan-text" class="art-logo-text">快乐的购物天堂...</div>
                    </div>
                </div>
                <div class="art-nav">
                	<div class="l"></div>
                	<div class="r"></div>
                	<ul class="art-menu">
                		<li>
                			<a href="index.jsp" class="active"><span class="l"></span><span class="r"></span><span class="t">主页</span></a>
                		</li>
                		<li>
                			<a href="#"><span class="l"></span><span class="r"></span><span class="t">商品分类</span></a>
                			<ul>
								<li><a href="#">图书、电子书刊、音像</a></li>
                				<li><a href="#">电子数码</a>
                					<ul>
                						<li><a href="#">家用电器</a></li>
                						<li><a href="#">手机数码</a></li>
                						<li><a href="#">电脑、办公</a></li>
                					</ul>
                				</li>
                				<li><a href="#">家居、家具、家装、厨具</a></li>
                			</ul>
                		</li>		
                		<li>
                			<a href="#"><span class="l"></span><span class="r"></span><span class="t">关于我们</span></a>
                		</li>
                	</ul>
                </div>