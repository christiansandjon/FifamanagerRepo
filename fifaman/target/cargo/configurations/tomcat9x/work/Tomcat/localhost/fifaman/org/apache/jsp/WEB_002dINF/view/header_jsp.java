/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-06-28 15:05:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>Login Admin</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"super_container\">\n");
      out.write("\n");
      out.write("    <!-- Header -->\n");
      out.write("\n");
      out.write("    <header class=\"header\">\n");
      out.write("\n");
      out.write("        <!-- Top Bar -->\n");
      out.write("        <div>\n");
      out.write("            <ul >\n");
      out.write("                <li>\n");
      out.write("                    <i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\n");
      out.write("                    <div>+32 487 594 669</div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i>\n");
      out.write("                    <div>christiansandjong@hotmail.com</div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Header Content -->\n");
      out.write("        <div class=\"header_container\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"header_content d-flex flex-row align-items-center justify-content-start\">\n");
      out.write("                            <div class=\"logo_container\">\n");
      out.write("                                <a href=\"/profacileweb/\">\n");
      out.write("                                    <div class=\"logo_text\">Pro<span>facile</span> <span\n");
      out.write("                                            style='font-size:1em;color:black;'>Admin</span></div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <nav class=\"main_nav_contaner ml-auto\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- Hamburger -->\n");
      out.write("\n");
      out.write("                                <div class=\"hamburger menu_mm\">\n");
      out.write("                                    <i class=\"fa fa-bars menu_mm\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </nav>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Header Search Panel -->\n");
      out.write("        <div class=\"header_search_container\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"header_search_content d-flex flex-row align-items-center justify-content-end\">\n");
      out.write("                            <form action=\"#\" class=\"header_search_form\">\n");
      out.write("                                <input type=\"search\" class=\"search_input\" placeholder=\"Search\" required=\"required\">\n");
      out.write("                                <button class=\"header_search_button d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                                    <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- Menu -->\n");
      out.write("\n");
      out.write("    <div class=\"menu d-flex flex-column align-items-end justify-content-start text-right menu_mm trans_400\">\n");
      out.write("        <div class=\"menu_close_container\">\n");
      out.write("            <div class=\"menu_close\">\n");
      out.write("                <div></div>\n");
      out.write("                <div></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"search\">\n");
      out.write("            <form action=\"#\" class=\"header_search_form menu_mm\">\n");
      out.write("                <input type=\"search\" class=\"search_input menu_mm\" placeholder=\"Search\" required=\"required\">\n");
      out.write("                <button class=\"header_search_button d-flex flex-column align-items-center justify-content-center menu_mm\">\n");
      out.write("                    <i class=\"fa fa-search menu_mm\" aria-hidden=\"true\"></i>\n");
      out.write("                </button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"menu_nav\">\n");
      out.write("            <ul class=\"menu_mm\">\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Home -->\n");
      out.write("\n");
      out.write("    <div class=\"home\">\n");
      out.write("        <div class=\"breadcrumbs_container\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"breadcrumbs\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"/profacileweb/\">Home</a></li>\n");
      out.write("                                <li><a href=\"../admin/login></a>Login</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\t\n");
      out.write("\t</div>\n");
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