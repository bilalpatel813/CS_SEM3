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


@WebServlet("/logoutSession")
public class logoutSession extends HttpServlet{
  protected void doGet(HttpServletRequest req,
                       HttpServletResponse res)
  throws ServletException,IOException{
    HttpSession session = req.getSession(false);
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    if(session!=null){
      session.invalidate();//ends session
    }
    out.println("<h2>U are logged out</h2>");
    out.println("<h2><a href='login.html'> Login Againn  to create Session</a></h2>");
    
  }
}