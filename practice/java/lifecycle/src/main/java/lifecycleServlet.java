import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lifecycle")
public class lifecycleServlet extends HttpServlet{
  @Override
  public void init() throws ServletException{
    System.out.pintln("Init() method called");
  }
  @Override
  protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>Servlet Life Cycle Demo</h1>");
    out.println("<h2>service() method executed successfully.</h2>");
    out.println("</body>");
    out.println("</html>");
  }
  @Override
  public void destory(){
    System.out.println("DEstory() method called");
  }
}