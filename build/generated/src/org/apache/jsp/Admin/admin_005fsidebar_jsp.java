package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fsidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Admin | Setting List</title>\r\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\r\n");
      out.write("        <meta name=\"description\" content=\"Developed By M Abdur Rokib Promy\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"Admin, Bootstrap 3, Template, Theme, Responsive\">\r\n");
      out.write("        <!-- bootstrap 3.0.2 -->\r\n");
      out.write("        <link href=\"Admin/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- font Awesome -->\r\n");
      out.write("        <link href=\"Admin/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- Ionicons -->\r\n");
      out.write("        <link href=\"Admin/css/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <!-- Theme style -->\r\n");
      out.write("        <link href=\"Admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write("        <aside class=\"left-side sidebar-offcanvas\">\r\n");
      out.write("            <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("            <section class=\"sidebar\">\r\n");
      out.write("                <!-- Sidebar user panel -->\r\n");
      out.write("                <div class=\"user-panel\">\r\n");
      out.write("                    <div class=\"pull-left image\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/img/26115.jpg\" class=\"img-circle\" alt=\"User Image\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"pull-left info\">\r\n");
      out.write("                        <p>Hello, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.currentUser.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- search form -->\r\n");
      out.write("                <form action=\"#\" method=\"get\" class=\"sidebar-form\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\"/>\r\n");
      out.write("                        <span class=\"input-group-btn\">\r\n");
      out.write("                            <button type='submit' name='seach' id='search-btn' class=\"btn btn-flat\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <!-- /.search form -->\r\n");
      out.write("                <!-- sidebar menu: : style can be found in sidebar.less -->\r\n");
      out.write("                <ul class=\"sidebar-menu\">\r\n");
      out.write("                    <li class=\"active\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin\">\r\n");
      out.write("                            <i class=\"fa fa-dashboard\"></i> <span>Dashboard</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"SettingListController\">\r\n");
      out.write("                            <i class=\"fa fa-gavel\"></i> <span>Setting List</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/registration_list\">\r\n");
      out.write("                            <i class=\"fa fa-globe\"></i> <span>Registration List</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- /.sidebar -->\r\n");
      out.write("        </aside>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery 2.0.2 -->\r\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"Admin/js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery UI 1.10.3 -->\r\n");
      out.write("    <script src=\"Admin/js/jquery-ui-1.10.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <script src=\"Admin/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!-- daterangepicker -->\r\n");
      out.write("    <script src=\"Admin/js/plugins/daterangepicker/daterangepicker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"Admin/js/plugins/chart.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- datepicker\r\n");
      out.write("    <script src=\"Admin/js/plugins/datepicker/bootstrap-datepicker.js\" type=\"text/javascript\"></script>-->\r\n");
      out.write("    <!-- Bootstrap WYSIHTML5\r\n");
      out.write("    <script src=\"Admin/js/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\" type=\"text/javascript\"></script>-->\r\n");
      out.write("    <!-- iCheck -->\r\n");
      out.write("    <script src=\"Admin/js/plugins/iCheck/icheck.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!-- calendar -->\r\n");
      out.write("    <script src=\"Admin/js/plugins/fullcalendar/fullcalendar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Director App -->\r\n");
      out.write("    <script src=\"js/Director/app.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Director dashboard demo (This is only for demo purposes) -->\r\n");
      out.write("    <script src=\"js/Director/dashboard.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
