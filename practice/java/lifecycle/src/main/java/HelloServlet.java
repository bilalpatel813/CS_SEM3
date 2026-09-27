import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name="helloServlet",value="/hello-servlet")
public class HelloServlet extends HttpServlet{
  private String message;
  public void init(){message="Hey dev! wassup";}
  public void doGet(HttpServletRequest request
                    ,HttpServletResponse response)
  throws ServletException,IOException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<h1>" + message + "</h1>");
    out.println("</body></html>");
  }
  public void destroy(){
    System.out.println("destory func call");
  }
}
