package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alterar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <head>\n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("       <title>Alterar</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("         ");
  
       
        
         String vcodigo = (String) request.getAttribute("uCodigo").toString();
         String vnome    = (String) request.getAttribute("uNome").toString();
         String vdisciplina   = (String) request.getAttribute("uDisciplina").toString();
         String vturno =(String) request.getAttribute("uTurno").toString();
        
    
      out.write("\n");
      out.write("    </head>\n");
      out.write("  <body>\n");
      out.write("      <form action=\"alter.do\" method=\"POST\">\n");
      out.write("          <input type=\"hidden\" name=\"cod\" value=\"");
      out.print(vcodigo);
      out.write("\">\n");
      out.write("          nome: <input type=\"text\" name=\"nome\" value=\"");
      out.print(vnome);
      out.write("\"><br>\n");
      out.write("          Disciplina: <input type=\"text\" name=\"disciplina\" value=\"");
      out.print(vdisciplina);
      out.write("\"><br>\n");
      out.write("          Turno: <input type=\"text\" name=\"turno\" value=\"");
      out.print(vturno);
      out.write("\"><br>\n");
      out.write("          <input type=\"submit\" value=\"Alterar\">\n");
      out.write("          \n");
      out.write("      </form>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("   \n");
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
