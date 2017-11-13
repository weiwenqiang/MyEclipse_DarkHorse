package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("f:substringBefore", org.apache.taglibs.standard.functions.Functions.class, "substringBefore", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/sidebar.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
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
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t  <!-- 产品列表 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <div class=\"product_storyList_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   <!--列表开始-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("      \r\n");
      out.write("\t\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t   <div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t       <dl class=\"product_content_dd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t       <dd><img src=\"images/OK.gif\" alt=\"ok\"/></dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t       <dd>页</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t       <dd><input name=\"page\" type=\"text\" value=\"1\" style=\"width:20px;\"/></dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t       <dd>跳转到第</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t       <dd><img src=\"images/next.gif\" alt=\"ok\"/></dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t       <dd><ul id=\"product_page\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t         <li><a href=\"#\" class=\"product_page\">1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t         <li><a href=\"#\" class=\"product_page\">2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t         <li><a href=\"#\" class=\"product_page\">3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t         <li>...</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t         <li><a href=\"#\" class=\"product_page\">14</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t         <li><a href=\"#\" class=\"product_page\">15</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t         <li><a href=\"#\" class=\"product_page\">16</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t         </ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t       </dd> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t       <dd><img src=\"images/product_page_up.gif\" alt=\"ok\"/></dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t       </dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <!-- 产品列表结束 -->                        \r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /product.jsp(48,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("product");
    // /product.jsp(48,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/product.jsp(48,12) '${products }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${products }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t   \t<div class=\"product_storyList_content_left\"><img width=\"120\" height=\"120\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.imgurl }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" alt=\"图书列表\"/></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t         <div class=\"product_storyList_content_right\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t            <ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t              <li class=\"product_storyList_content_dash\"><a href=\"productSearch?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"blue_14\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t              <li>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t              ");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t              ");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t              <li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t              <dl class=\"product_content_dd\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t              <dd><a href=\"addCart?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"><img style=\"cursor: pointer;\" src=\"images/product_buy_01.gif\" alt=\"shopping\"/></a></dd>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t              <dd>节省：￥");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.marketprice-product.estoreprice }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</dd>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t              <dd>折扣：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:substringBefore(product.estoreprice/product.marketprice*100, \".\")}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
          out.write("折</dd>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t              <dd class=\"footer_dull_red\">￥");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.estoreprice }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</dd>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t               <dd class=\"product_content_delete\">￥");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.marketprice }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</dd>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t              </dl>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t              　\t\t  </li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t            </ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t          </div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t       <div class=\"product_storyList_content_bottom\"></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t   ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /product.jsp(54,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.pnum>0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t              \t<li>库存情况：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.pnum }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t              ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /product.jsp(57,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.pnum==0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t              \t<li>目前该商品无货.</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t              ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }
}
