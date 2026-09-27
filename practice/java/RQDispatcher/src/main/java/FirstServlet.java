import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first")
public class FirstServlet extends HttpServlet{
  public void doGet(HttpServletRequest req,
                    HttpServletResponse res)
  throws ServletException,IOException{
    PrintWriter out = res.getWriter();
    out.println("<h1>This Is First servlet !</h1>");
    RequestDispatcher rd = req.getRequestDispatcher("/forward");
    rd.forward(req,res);
    
  }
}
