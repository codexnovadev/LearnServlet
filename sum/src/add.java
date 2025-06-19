
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class add extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
      // Step 1: Get values from form
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        // Step 2: Calculate sum
        int sum = num1 + num2;

        // Step 3: Set response type and send result
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Sum is: " + sum + "</h1>");

    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    

    }
}
