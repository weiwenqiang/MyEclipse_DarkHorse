<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Estore购物商城</title>

    <link rel="stylesheet" href="style.css" type="text/css" media="screen" />
    <!--[if IE 6]><link rel="stylesheet" href="style.ie6.css" type="text/css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" href="style.ie7.css" type="text/css" media="screen" /><![endif]-->
    
    <script type="text/javascript" src="script.js"></script>
    <script type="text/javascript">
		function changenum(value,estoreprice,marketprice,pnum,product){
			var reg = /^[0-9]+$/;
			if(!reg.test(value)){
				alert("你输入的数量错误.");
				return;
			}
			if(value > pnum){
				alert("目前没有那么多库存.");
				return;
			}
			var totalestoreprice = estoreprice * value;
			document.getElementById("totalestoreprice").innerHTML = "￥"+totalestoreprice;
			var totalmarketprice = marketprice * value;
			document.getElementById("saveprice").innerHTML = "￥"+(totalmarketprice - totalestoreprice);
			
			// 请求服务器端的Servlet,通知Session修改购买商品的数量.
			window.location.href = "editCart?pnum="+value+"&product="+product;
		}
	</script>
</head>
<body>
<div id="art-main">
        <div class="art-sheet">
            <div class="art-sheet-tl"></div>
            <div class="art-sheet-tr"></div>
            <div class="art-sheet-bl"></div>
            <div class="art-sheet-br"></div>
            <div class="art-sheet-tc"></div>
            <div class="art-sheet-bc"></div>
            <div class="art-sheet-cl"></div>
            <div class="art-sheet-cr"></div>
            <div class="art-sheet-cc"></div>
            <div class="art-sheet-body">
                <%@include file="header.jsp" %>
                <div class="art-content-layout">
                    <div class="art-content-layout-row">
                        <div class="art-layout-cell art-content">
                            <div class="art-post">
                                <div class="art-post-tl"></div>
                                <div class="art-post-tr"></div>
                                <div class="art-post-bl"></div>
                                <div class="art-post-br"></div>
                                <div class="art-post-tc"></div>
                                <div class="art-post-bc"></div>
                                <div class="art-post-cl"></div>
                                <div class="art-post-cr"></div>
                                <div class="art-post-cc"></div>
                                <div class="art-post-body">
									  <!-- 购物车列表 -->
									  <div>&nbsp;&nbsp;<img src="images/shopping_myshopping.gif" alt="shopping"/> <a href="#">全场免运费活动中</a></div>
									  <div class="shopping_list_top">您已选购以下商品</div>
									  <br/>
									  <div class="shopping_list_border">
									  <table width="100%" border="0" cellspacing="0" cellpadding="0">
									     <tr class="shopping_list_title">
									       <td class="shopping_list_title_1">商品名</td>
									       <td class="shopping_list_title_2">库存</td>
									       <td class="shopping_list_title_3">市场价</td>
									       <td class="shopping_list_title_4">Estore打折价</td>
									       <td class="shopping_list_title_5">数量</td>
									       <td class="shopping_list_title_6">删除</td>
									    </tr>
									    </table>
									    <table width="100%" border="0" cellspacing="0" cellpadding="0">
									   <c:set var="totalmarketprice" value="0"></c:set>
									   <c:set var="totalestoreprice" value="0"></c:set>
									   <c:forEach var="productMap" items="${cart }">
									   	<tr class="shopping_product_list" id="shoppingProduct_01">
									       <td class="shopping_product_list_1"><a href="#" class="blue">${productMap.key.name }</a></td>
									       <td class="shopping_product_list_2">${productMap.key.pnum }</td>
									       <td class="shopping_product_list_3">￥${productMap.key.marketprice }</td>
									       <td class="shopping_product_list_4">￥${productMap.key.estoreprice } (${f:substringBefore(productMap.key.estoreprice/productMap.key.marketprice*100, ".")}折)</td>
									       <td class="shopping_product_list_5"><input onblur="changenum(this.value,${productMap.key.estoreprice },${productMap.key.marketprice },${productMap.key.pnum },${productMap.key.id });" type="text" value="${productMap.value }"/></td>
									       <td class="shopping_product_list_6"><a href="delCart?id=${productMap.key.id }" class="blue">删除</a></td>
									   		<c:set value="${totalmarketprice+productMap.key.marketprice*productMap.value }" var="totalmarketprice"></c:set>
									   		<c:set value="${totalestoreprice+productMap.key.estoreprice*productMap.value }" var="totalestoreprice"></c:set>
									   </tr>
									   </c:forEach>
									   
									   </table>  
									     <div class="shopping_list_end">
									      <ul>
									       <li class="shopping_list_end_1"><a href="order_add.jsp"><input type="image" src="images/shopping_balance.gif"/></a></li>
									       <li id="totalestoreprice" class="shopping_list_end_2">￥${totalestoreprice }</li>
									       <li class="shopping_list_end_3">商品金额总计：</li>
									       <li class="shopping_list_end_4">您共节省：<label id="saveprice" class="shopping_list_end_yellow">￥${totalmarketprice-totalestoreprice }</label></li>
									      </ul>
									     </div>
									  </div>
									  <!-- 购物车列表结束 -->                        
                           			<div class="cleared"></div>
                                </div>
                            </div>
                        </div> 
                        <%@include file="sidebar.jsp" %>
                    </div>
                </div>
                <div class="cleared"></div>
                <%@include file="footer.jsp" %> 
        		<div class="cleared"></div>
            </div>
        </div>
        <div class="cleared"></div>
    </div>
    
</body>
</html>