/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2015-07-13 15:10:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/common/common.jsp", Long.valueOf(1436536679000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>Dolteng Auto Generated</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.t-border-collapse {\r\n");
      out.write("\t    border-collapse: collapse;\r\n");
      out.write("\t}\r\n");
      out.write("\t.t-line {\r\n");
      out.write("\t    border: solid 3px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>Hello World!</h1>\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("\t<table border=\"1\" width=\"500\" cellspacing=\"0\" cellpadding=\"5\" bordercolor=\"#333333\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>aaa1</td>\r\n");
      out.write("\t\t\t<td>aaa2</td>\r\n");
      out.write("\t\t\t<td>aaa3</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"border-left-style: hidden; border-bottom-style: hidden;\">bbb1</td>\r\n");
      out.write("\t\t\t<td>bbb2</td>\r\n");
      out.write("\t\t\t<td style=\"border-right-style: hidden; border-bottom-style: hidden;\">bbb3</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<table id=\"t1\" border=\"1\" >\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td id=\"t1ta1\">aaa1</td>\r\n");
      out.write("\t\t\t<td id=\"t1ta2\">aaa2</td>\r\n");
      out.write("\t\t\t<td id=\"t1ta3\">aaa3</td>\r\n");
      out.write("\t\t\t<td id=\"t1ta4\">aaaaaa4</td>\r\n");
      out.write("\t\t\t<td id=\"t1ta5\">aaa5</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td id=\"t1tb1\">bbb1</td>\r\n");
      out.write("\t\t\t<td id=\"t1tb2\">bbbbbbb2</td>\r\n");
      out.write("\t\t\t<td id=\"t1tb3\">bbbbbbbb3</td>\r\n");
      out.write("\t\t\t<td id=\"t1tb4\">aaa4</td>\r\n");
      out.write("\t\t\t<td id=\"t1tb5\">aaa5</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"margin-top: 5px\">\r\n");
      out.write("\t\t<table class=\"t-border-collapse\" id=\"t2\" border=\"1\" >\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"t-line\" id=\"t2ta1\">a</td>\r\n");
      out.write("\t\t\t\t<td class=\"t-line\" id=\"t2ta2\">a</td>\r\n");
      out.write("\t\t\t\t<td class=\"t-line\" id=\"t2ta3\">a</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}