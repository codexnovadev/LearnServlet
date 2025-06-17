import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.*;

public class servletinfo implements Servlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig config) {
        this.config = config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello from ServletInfo</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet is going to destroy");
    }

    @Override
    public String getServletInfo() {
        return "This is the first servlet";
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }
}
