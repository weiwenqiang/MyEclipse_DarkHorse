package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/sidebar.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\" lang=\"en-US\" xml:lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("    <title>Estore购物商城</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("    <!--[if IE 6]><link rel=\"stylesheet\" href=\"style.ie6.css\" type=\"text/css\" media=\"screen\" /><![endif]-->\r\n");
      out.write("    <!--[if IE 7]><link rel=\"stylesheet\" href=\"style.ie7.css\" type=\"text/css\" media=\"screen\" /><![endif]-->\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \tvar msg = {\r\n");
      out.write("    \t\t\"name\" : \"商品名称\",\r\n");
      out.write("    \t\t\"fixed_price\" : \"市场价格\",\r\n");
      out.write("    \t\t\"sale_price\" : \"打折价格\",\r\n");
      out.write("    \t\t\"pnum\":\"商品数量\",\r\n");
      out.write("    \t\t\"product_img\":\"商品图片\"\r\n");
      out.write("    \t};\r\n");
      out.write("    \r\n");
      out.write("\t\tfunction validateRequired(fieldname){\r\n");
      out.write("\t\t\tvar objval = document.getElementById(fieldname).value;\r\n");
      out.write("\t\t\tif(objval.match(\"^\\\\s*$\")!=null){\r\n");
      out.write("\t\t\t\tdocument.getElementById(fieldname+\"_msg\").innerHTML = \"<span style='color:red'>\"+msg[fieldname]+\"不能为空！</span>\";\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tdocument.getElementById(fieldname+\"_msg\").innerHTML = \"\";\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction validateForm(){\r\n");
      out.write("\t\t\tvar isNameValid = validateRequired(\"name\");\r\n");
      out.write("\t\t\tvar isfixedPriceValid = validateRequired(\"fixed_price\");\r\n");
      out.write("\t\t\tvar isSalePriceValid = validateRequired(\"sale_price\");\r\n");
      out.write("\t\t\tvar isPnumValid = validateRequired(\"pnum\");\r\n");
      out.write("\t\t\tvar isProductImgValid =  validateRequired(\"product_img\");\r\n");
      out.write("\t\r\n");
      out.write("\t\t\tif(!isNameValid || !isfixedPriceValid|| isSalePriceValid || !isPnumValid || !isProductImgValid){\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"art-main\">\r\n");
      out.write("        <div class=\"art-sheet\">\r\n");
      out.write("            <div class=\"art-sheet-tl\"></div>\r\n");
      out.write("            <div class=\"art-sheet-tr\"></div>\r\n");
      out.write("            <div class=\"art-sheet-bl\"></div>\r\n");
      out.write("            <div class=\"art-sheet-br\"></div>\r\n");
      out.write("            <div class=\"art-sheet-tc\"></div>\r\n");
      out.write("            <div class=\"art-sheet-bc\"></div>\r\n");
      out.write("            <div class=\"art-sheet-cl\"></div>\r\n");
      out.write("            <div class=\"art-sheet-cr\"></div>\r\n");
      out.write("            <div class=\"art-sheet-cc\"></div>\r\n");
      out.write("            <div class=\"art-sheet-body\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"art-header\">\r\n");
      out.write("                    <div class=\"art-header-png\"></div>\r\n");
      out.write("                    <div class=\"art-header-jpeg\">欢迎来到Estore购物商城！\r\n");
      out.write("                    \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    \t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"art-logo\">\r\n");
      out.write("                        <h1 id=\"name-text\" class=\"art-logo-name\"><a href=\"#\">Estore购物商城</a></h1>\r\n");
      out.write("                        <div id=\"slogan-text\" class=\"art-logo-text\">快乐的购物天堂...</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"art-nav\">\r\n");
      out.write("                \t<div class=\"l\"></div>\r\n");
      out.write("                \t<div class=\"r\"></div>\r\n");
      out.write("                \t<ul class=\"art-menu\">\r\n");
      out.write("                \t\t<li>\r\n");
      out.write("                \t\t\t<a href=\"index.jsp\" class=\"active\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">主页</span></a>\r\n");
      out.write("                \t\t</li>\r\n");
      out.write("                \t\t<li>\r\n");
      out.write("                \t\t\t<a href=\"#\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">商品分类</span></a>\r\n");
      out.write("                \t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">图书、电子书刊、音像</a></li>\r\n");
      out.write("                \t\t\t\t<li><a href=\"#\">电子数码</a>\r\n");
      out.write("                \t\t\t\t\t<ul>\r\n");
      out.write("                \t\t\t\t\t\t<li><a href=\"#\">家用电器</a></li>\r\n");
      out.write("                \t\t\t\t\t\t<li><a href=\"#\">手机数码</a></li>\r\n");
      out.write("                \t\t\t\t\t\t<li><a href=\"#\">电脑、办公</a></li>\r\n");
      out.write("                \t\t\t\t\t</ul>\r\n");
      out.write("                \t\t\t\t</li>\r\n");
      out.write("                \t\t\t\t<li><a href=\"#\">家居、家具、家装、厨具</a></li>\r\n");
      out.write("                \t\t\t</ul>\r\n");
      out.write("                \t\t</li>\t\t\r\n");
      out.write("                \t\t<li>\r\n");
      out.write("                \t\t\t<a href=\"#\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">关于我们</span></a>\r\n");
      out.write("                \t\t</li>\r\n");
      out.write("                \t</ul>\r\n");
      out.write("                </div>");
      out.write("\r\n");
      out.write("                <div class=\"art-content-layout\">\r\n");
      out.write("                    <div class=\"art-content-layout-row\">\r\n");
      out.write("                        <div class=\"art-layout-cell art-content\">\r\n");
      out.write("                            <div class=\"art-post\">\r\n");
      out.write("                                <div class=\"art-post-tl\"></div>\r\n");
      out.write("                                <div class=\"art-post-tr\"></div>\r\n");
      out.write("                                <div class=\"art-post-bl\"></div>\r\n");
      out.write("                                <div class=\"art-post-br\"></div>\r\n");
      out.write("                                <div class=\"art-post-tc\"></div>\r\n");
      out.write("                                <div class=\"art-post-bc\"></div>\r\n");
      out.write("                                <div class=\"art-post-cl\"></div>\r\n");
      out.write("                                <div class=\"art-post-cr\"></div>\r\n");
      out.write("                                <div class=\"art-post-cc\"></div>\r\n");
      out.write("                                <div class=\"art-post-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <!-- 添加商品表单 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t<form method=\"post\" enctype=\"multipart/form-data\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/addProduct\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>商品名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"name\" id=\"name\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"name_msg\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>市场价格</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"marketprice\" id=\"fixed_price\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"fixed_price_msg\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>Estore打折价格</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"estoreprice\" id=\"sale_price\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"sale_price_msg\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>商品分类</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"category\" id=\"category\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"图书、电子书刊、音像\">图书、电子书刊、音像</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"家用电器\">家用电器</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"手机数码\">手机数码</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"电脑、办公\">电脑、办公</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"家居、家具、家装、厨具\">家居、家具、家装、厨具</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"category_msg\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>商品数量</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"pnum\" id=\"pnum\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"pnum_msg\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>图片</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"file\" name=\"product_img\" id=\"product_img\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"product_img_msg\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td>描述</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td><textarea rows=\"5\" cols=\"80\" name=\"description\" id=\"description\"></textarea> </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"description_msg\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"添加商品\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <!-- 添加商品表单结束 -->                        \r\n");
      out.write("                           \t\t\t<div class=\"cleared\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("<div class=\"art-layout-cell art-sidebar1\"> \r\n");
      out.write("                            <div class=\"art-vmenublock\">\r\n");
      out.write("                                <div class=\"art-vmenublock-body\">\r\n");
      out.write("                                            <div class=\"art-vmenublockheader\">\r\n");
      out.write("                                                <div class=\"l\"></div>\r\n");
      out.write("                                                <div class=\"r\"></div>\r\n");
      out.write("                                                 <div class=\"t\">导航菜单</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"art-vmenublockcontent\">\r\n");
      out.write("                                                <div class=\"art-vmenublockcontent-tl\"></div>\r\n");
      out.write("                                                <div class=\"art-vmenublockcontent-tr\"></div>\r\n");
      out.write("                                                <div class=\"art-vmenublockcontent-bl\"></div>\r\n");
      out.write("                                                <div class=\"art-vmenublockcontent-br\"></div>\r\n");
      out.write("                                                <div class=\"art-vmenublockcontent-tc\"></div>\r\n");
      out.write("                                                <div class=\"art-vmenublockcontent-bc\"></div>\r\n");
      out.write("                                                <div class=\"art-vmenublockcontent-cl\"></div>\r\n");
      out.write("                                                <div class=\"art-vmenublockcontent-cr\"></div>\r\n");
      out.write("                                                <div class=\"art-vmenublockcontent-cc\"></div>\r\n");
      out.write("                                                <div class=\"art-vmenublockcontent-body\">\r\n");
      out.write("                                            <!-- block-content -->\r\n");
      out.write("                                                            <ul class=\"art-vmenu\">\r\n");
      out.write("                                                            \t<li>\r\n");
      out.write("                                                            \t\t<a href=\"index.jsp\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">主页</span></a>\r\n");
      out.write("                                                            \t</li>\r\n");
      out.write("                                                            \t<li>\r\n");
      out.write("                                                            \t\t<a href=\"product_add.jsp\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">添加商品</span></a>\r\n");
      out.write("                                                            \t</li>\r\n");
      out.write("                                                            \t<li>\r\n");
      out.write("                                                            \t\t<a href=\"productList\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">查看商品</span></a>\r\n");
      out.write("                                                            \t</li>\r\n");
      out.write("                                                            \t<li>\r\n");
      out.write("                                                            \t\t<a href=\"cart.jsp\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">查看购物车</span></a>\r\n");
      out.write("                                                            \t</li>\r\n");
      out.write("                                                            \t<li>\r\n");
      out.write("                                                            \t\t<a href=\"orderSearch\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">查看订单</span></a>\r\n");
      out.write("                                                            \t</li>\r\n");
      out.write("                                                            \t<li>\r\n");
      out.write("                                                            \t\t<a href=\"#\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">关于我们</span></a>\r\n");
      out.write("                                                            \t</li>\r\n");
      out.write("                                                            \t<li>\r\n");
      out.write("                                                            \t\t<a href=\"javascript:alert('邮箱: jyl@itcast.cn');\"><span class=\"l\"></span><span class=\"r\"></span><span class=\"t\">联系方式</span></a>\r\n");
      out.write("                                                            \t</li>\r\n");
      out.write("                                                            </ul>\r\n");
      out.write("                                            <!-- /block-content -->\r\n");
      out.write("                                            \r\n");
      out.write("                                            \t\t<div class=\"cleared\"></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                            \t\t<div class=\"cleared\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"art-block\">\r\n");
      out.write("                                <div class=\"art-block-body\">\r\n");
      out.write("                                            <div class=\"art-blockheader\">\r\n");
      out.write("                                                <div class=\"l\"></div>\r\n");
      out.write("                                                <div class=\"r\"></div>\r\n");
      out.write("                                                 <div class=\"t\">查询商品</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"art-blockcontent\">\r\n");
      out.write("                                                <div class=\"art-blockcontent-tl\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-tr\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-bl\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-br\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-tc\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-bc\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-cl\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-cr\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-cc\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-body\">\r\n");
      out.write("                                            <!-- block-content -->\r\n");
      out.write("                                                            <div><form method=\"get\" id=\"newsletterform\" action=\"javascript:void(0)\">\r\n");
      out.write("                                                            <input type=\"text\" value=\"\" name=\"email\" id=\"s\" style=\"width: 95%;\" />\r\n");
      out.write("                                                            <span class=\"art-button-wrapper\">\r\n");
      out.write("                                                            \t<span class=\"l\"> </span>\r\n");
      out.write("                                                            \t<span class=\"r\"> </span>\r\n");
      out.write("                                                            \t<input class=\"art-button\" type=\"submit\" name=\"search\" value=\"查询\" />\r\n");
      out.write("                                                            </span>\r\n");
      out.write("                                                            \r\n");
      out.write("                                                            </form></div>\r\n");
      out.write("                                            <!-- /block-content -->\r\n");
      out.write("                                            \r\n");
      out.write("                                            \t\t<div class=\"cleared\"></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                            \t\t<div class=\"cleared\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"art-block\">\r\n");
      out.write("                                <div class=\"art-block-body\">\r\n");
      out.write("                                            <div class=\"art-blockheader\">\r\n");
      out.write("                                                <div class=\"l\"></div>\r\n");
      out.write("                                                <div class=\"r\"></div>\r\n");
      out.write("                                                 <div class=\"t\">联系信息</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"art-blockcontent\">\r\n");
      out.write("                                                <div class=\"art-blockcontent-tl\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-tr\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-bl\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-br\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-tc\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-bc\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-cl\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-cr\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-cc\"></div>\r\n");
      out.write("                                                <div class=\"art-blockcontent-body\">\r\n");
      out.write("                                            <!-- block-content -->\r\n");
      out.write("                                                            <div>\r\n");
      out.write("                                                                  <img src=\"images/contact.jpg\" alt=\"an image\" style=\"margin: 0 auto;display:block;width:95%\" />\r\n");
      out.write("                                                            <br />\r\n");
      out.write("                                                            <b>公司信息</b><br />\r\n");
      out.write("                                                            传智播客<br />\r\n");
      out.write("                                                            电子邮箱: <a href=\"mailto:jyl@itcast.cn\">jyl@itcast.cn</a><br />\r\n");
      out.write("                                                            <br />\r\n");
      out.write("                                                            电话: (010)82935150 <br />\r\n");
      out.write("                                                            传真: (010)82935160\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                            <!-- /block-content -->\r\n");
      out.write("                                            \r\n");
      out.write("                                            \t\t<div class=\"cleared\"></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                            \t\t<div class=\"cleared\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cleared\"></div>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("<div class=\"art-footer\">\r\n");
      out.write("                    <div class=\"art-footer-t\"></div>\r\n");
      out.write("                    <div class=\"art-footer-l\"></div>\r\n");
      out.write("                    <div class=\"art-footer-b\"></div>\r\n");
      out.write("                    <div class=\"art-footer-r\"></div>\r\n");
      out.write("                    <div class=\"art-footer-body\">\r\n");
      out.write("                         <a href=\"#\" class=\"art-rss-tag-icon\" title=\"RSS\"></a>\r\n");
      out.write("                        <div class=\"art-footer-text\">\r\n");
      out.write("                            <p><a href=\"#\">关于我们</a> | <a href=\"#\">联系我们</a> | <a href=\"#\">人才招聘</a>\r\n");
      out.write("                                | <a href=\"#\">商家入驻</a><br />\r\n");
      out.write("                                版权 &#169; 2014 ---. 传智播客 版权所有.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                \t\t<div class=\"cleared\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>");
      out.write(" \r\n");
      out.write("        \t\t<div class=\"cleared\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"cleared\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /header.jsp(6,21) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty user }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    \t\t<a href=\"login.jsp\">[登录]</a> <a href=\"regist.jsp\">[免费注册]</a>\r\n");
        out.write("                    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /header.jsp(9,21) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty user }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    \t\t您好，");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.nickname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("。<a href=\"logout\">[退出]</a>\r\n");
        out.write("                    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
