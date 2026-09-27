import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("setSessionCookie")
public class getCookie extends HttpServlet{
  protected void doGet(HttpServletRequest req,
                       HttpServletResponse res)
  throws ServletException,IOException{
    PrintWriter out = res.getWriter();
    Cookie sessionCookies = new Cookie("sessionUser","SYCS");
    res.addCookie(sessionCookie);
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    out.println("new session cookie created !!");
    out.println("<p>Close the Browser to delete the cookie!!</p>");
    out.println("<h2><a href='getSessionCookie'> CHeck Now</a>");

  }
}