import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.*;

public class servlet1 implements Servlet {
    ServletConfig config = null;
    public void init(ServletConfig config) {
        this.config = config;
    }
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<h1>This is servlet Interface");
        out.close();
    } 
    public void destroy() {
        System.out.println("Servlet is going to destroy");
    }
    public ServletConfig getServletConfig() {
        return this.config;
    }
    public String getServletInfo() {
        return "Servlet Create Using Servlet Interface";
    }
}