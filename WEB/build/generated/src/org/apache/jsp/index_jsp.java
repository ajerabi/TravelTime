package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>FORM</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>CALENDER TRAVELLER</h1>\n");
      out.write("        <form name=\"myForm\" action=\"addEvent.jsp\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                     <tr>\n");
      out.write("                        <td>DATE OF TODAY</td>\n");
      out.write("                        <td><input type=\"text\" name=\"date\" value=\"MM/DD/YYYY\" size=\"40\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"name\" value=\"\" size=\"40\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Destination :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"destination\" value=\"\" size=\"40\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Transfortation :</td>\n");
      out.write("                        <td><select name=\"transfortation\">\n");
      out.write("                                <option>BIKE</option>\n");
      out.write("                                <option>MOTORCYCLE</option>\n");
      out.write("                                <option>CAR</option>\n");
      out.write("                                <option>PUBLIC TRANSPORT</option>\n");
      out.write("                                <option>TRAIN</option>\n");
      out.write("                                <option>BOAT</option>\n");
      out.write("                                <option>AIRCRAFT</option>\n");
      out.write("                            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                        <td>TIME ARRIVE :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"arrive\" value=\"HH:MM:SS\" size=\"15\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>TIME DEPART :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"depart\" value=\"HH:MM:SS\" size=\"15\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"reset\" value=\"Claer\" name=\"clear\" />\n");
      out.write("            <input type=\"submit\" value=\"Submit\" name=\"submit\" />\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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