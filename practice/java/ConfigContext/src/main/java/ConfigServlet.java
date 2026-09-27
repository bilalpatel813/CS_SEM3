import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloServlet",
           urlPatterns="/hello",
           initParams={
             @WebInitParam(name="message",value="Hey dev! Wassup")
           })
public class ConfigServlet extends HttpServlet{

  public void doGet(HttpServletRequest request
                    ,HttpServletResponse response)
  throws ServletException,IOException{
    ServletConfig config = getServletConfig();
    ServletContext context = getServletContext();

    String configMessage = config.getInitParameter("message");
    String appName = context.getInitParameter("appName");
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("Config: "+configMessage);
    out.println("Context: "+appName);
  }
}
