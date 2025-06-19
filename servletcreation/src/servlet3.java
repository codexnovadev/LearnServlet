import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;  // VERY IMPORTANT

public class servlet3 extends HttpServlet {
    
    public void doGet(HttpServletRequest req , HttpServletResponse res ) throws IOException , ServletException {

        // 1. Set the response content type
        res.setContentType("text/html");

        // 2. Get PrintWriter to write response
        PrintWriter out = res.getWriter();

        // 3. Write HTML response
        out.println("<html>");
        out.println("<head><title>Servlet3 Output</title></head>");
        out.println("<body>");
        out.println("<h2>Hello from servlet3!</h2>");
        out.println("</body>");
        out.println("</html>");

        // 4. Close the writer
        out.close();
    }    
}
