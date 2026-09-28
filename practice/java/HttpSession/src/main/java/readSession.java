import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/readSession")
public class readSession extends HttpServlet{
  protected void doGet(HttpServletRequest req,
                       HttpServletResponse res)
  throws ServletException,IOException{
    HttpSession session = req.getSession(false);
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    if(sessiom!=null){
      String game = (String) session.getAttribute("favGame");
      if(game!=null){
        out.println("<h2> session game : "+game+"</h2>");
      }
      else{
        out.println("<h2>No Game found in Session</h2>");
      }
    }
    else{
      out.println("<h2> No session FOund</h2>");
    }
    out.println("<h3><a href='login.html'> Back to Login Form</a></h3>");
  }
}