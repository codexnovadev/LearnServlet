import jakarta.servlet.*;

import java.io.*;
public class servlet2  extends GenericServlet{

    public void service(ServletRequest req, ServletResponse res) throws IOException , ServletException{

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h2>Hello from MySimpleServlet  Using Generic Servlet</h2>");
        out.println("</body></html>");
        out.close();
    }   

}
