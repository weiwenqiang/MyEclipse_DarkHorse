package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar focus_width=632;\r\n");
      out.write("        var focus_height=242;\r\n");
      out.write("\t\tvar picPath;\r\n");
      out.write("\t\tvar linkUrl=\"\";\r\n");
      out.write("\t\tvar swfPath=\"adImage.swf\";\r\n");
      out.write("\t\tvar sp=\"|\";\r\n");
      out.write("\t\tvar banners =new Array(\"images/screen1.jpg\",\"images/screen2.jpg\",\"images/screen3.jpg\",\"images/screen4.jpg\",\"images/screen5.jpg\",\"images/screen6.jpg\");\r\n");
      out.write("\t\tvar links =new Array(\"#\",\"#\",\"#\",\"#\",\"#\",\"#\");\r\n");
      out.write("\r\n");
      out.write("\t\tfor(var i=0;i<banners.length;i++){\r\n");
      out.write("\t\t\tif(i==banners.length-1){\r\n");
      out.write("\t\t\t\tsp=\"\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tpicPath+=banners[i]+sp;\r\n");
      out.write("\t\t \tvar index = picPath.indexOf(\"undefined\");\r\n");
      out.write("\t\t \tif(index!=-1){\r\n");
      out.write("\t\t \t\tpicPath = picPath.substr(index+9,picPath.length);\r\n");
      out.write("\t\t \t}\r\n");
      out.write("\t\t\tlinkUrl+=links[i]+sp;\t\t\t\r\n");
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
      out.write("                            <div class=\"art-post-inner art-article\">\r\n");
      out.write("                                            <div class=\"art-postmetadataheader\">\r\n");
      out.write("                                                <h2 class=\"art-postheader\">\r\n");
      out.write("                                                    商品促销信息\r\n");
      out.write("                                                </h2>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"art-postcontent\">\r\n");
      out.write("                                                <!-- article-content -->\r\n");
      out.write("                                                <script type=\"text/javascript\" src=\"mutilpleFlash.js\"></script>                   \r\n");
      out.write("                                                <!-- /article-content -->\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"cleared\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"cleared\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"art-post\">\r\n");
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
      out.write("                            <div class=\"art-post-inner art-article\">\r\n");
      out.write("                                            <div class=\"art-postmetadataheader\">\r\n");
      out.write("                                                <h2 class=\"art-postheader\">\r\n");
      out.write("                                                    热卖商品销售中\r\n");
      out.write("                                                </h2>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"art-postcontent\">\r\n");
      out.write("                                                <!-- article-content -->\r\n");
      out.write("                                                <p>\r\n");
      out.write("                                                \t<span class=\"art-button-wrapper\">\r\n");
      out.write("                                                \t\t<span class=\"l\"> </span>\r\n");
      out.write("                                                \t\t<span class=\"r\"> </span>\r\n");
      out.write("                                                \t\t<a class=\"art-button\" href=\"javascript:void(0)\">更多商品...</a>\r\n");
      out.write("                                                \t</span>\r\n");
      out.write("                                                </p>\r\n");
      out.write("                                                <div class=\"cleared\"></div>\r\n");
      out.write("                                                <div class=\"art-content-layout overview-table\">\r\n");
      out.write("                                                \t<div class=\"art-content-layout-row\">\r\n");
      out.write("                                                \t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                      <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t      <h4>保温水杯</h4>\r\n");
      out.write("                                                \t\t  <img src=\"images/pic1.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                       </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("                                                \t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>黑宝石手链</h4>\r\n");
      out.write("                                                \t\t  <img src=\"images/pic2.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("                                                \t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>LV名牌包包</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic3.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>名牌夹克</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic4.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>大容量冰箱</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic5.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-layout-cell\"> -->\r\n");
      out.write("<!--                                                     <div class=\"overview-table-inner\"> -->\r\n");
      out.write("<!--                                                 \t\t  <h4>可爱的挂链</h4> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic6.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" /> -->\r\n");
      out.write("<!--                                                 \t\t  <p>价格: ￥139</p> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p> -->\r\n");
      out.write("<!--                                                      </div> -->\r\n");
      out.write("<!--                                                 \t\t</div>end cell -->\r\n");
      out.write("                                                \t</div><!-- end row -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-content-layout-row\">\r\n");
      out.write("                                                \t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                      <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t      <h4>保温水杯</h4>\r\n");
      out.write("                                                \t\t  <img src=\"images/pic1.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                       </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("                                                \t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>黑宝石手链</h4>\r\n");
      out.write("                                                \t\t  <img src=\"images/pic2.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("                                                \t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>LV名牌包包</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic3.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>名牌夹克</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic4.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>大容量冰箱</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic5.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>可爱的挂链</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic6.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("                                                \t</div><!-- end row -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-content-layout-row\">\r\n");
      out.write("                                                \t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                      <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t      <h4>保温水杯</h4>\r\n");
      out.write("                                                \t\t  <img src=\"images/pic1.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                       </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("                                                \t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>黑宝石手链</h4>\r\n");
      out.write("                                                \t\t  <img src=\"images/pic2.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("                                                \t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>LV名牌包包</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic3.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>名牌夹克</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic4.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>大容量冰箱</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic5.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"art-layout-cell\">\r\n");
      out.write("                                                    <div class=\"overview-table-inner\">\r\n");
      out.write("                                                \t\t  <h4>可爱的挂链</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <img src=\"images/pic6.jpg\" width=\"55px\" height=\"55px\" alt=\"an image\" class=\"image\" />\r\n");
      out.write("                                                \t\t  <p>价格: ￥139</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <p>速速抢购</p>\r\n");
      out.write("                                                     </div>\r\n");
      out.write("                                                \t\t</div><!-- end cell -->\r\n");
      out.write("                                                \t</div><!-- end row -->\r\n");
      out.write("                                                </div><!-- end table -->\r\n");
      out.write("                                                    \r\n");
      out.write("                                                <!-- /article-content -->\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"cleared\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"cleared\"></div>\r\n");
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
      out.write("</html>\r\n");
      out.write("\r\n");
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
