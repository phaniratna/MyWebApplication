import javax.servlet.*;
import java.io.*;
public class MyServlet extends GenericServlet  {
  public void service(ServletRequest request,ServletResponse response)throws ServletException,
IOException {
    	response.setContentType("text/html");
                 PrintWriter pw = response.getWriter();
                pw.println("welcome");
                pw.close();
}
}
