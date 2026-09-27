import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet{
  public void doGet(HttpServletRequest req,
                   HttpServletResponse res)
  throws ServletException,IOException{
    PrintWriter out = res.getWriter();
    out.println("<h1>Second servlet</h1>");
    out.println("<h1>Acces this data Man!!</h1>");
    
  }
}
