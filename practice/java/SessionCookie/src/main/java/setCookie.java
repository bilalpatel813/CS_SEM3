import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/setSessionCookie")
public class setCookie extends HttpServlet{
  protected void doGet(HttpServletRequest req,
                       HttpServletResponse res)
  throws ServletException,IOException{
    PrintWriter out = res.getWriter();
    Cookie sessionCookies = new Cookie("sessionUser","SYCS");
    res.addCookie(sessionCookies);
    res.setContentType("text/html");
    out.println("new session cookie created !!");
    out.println("<p>Close the Browser to delete the cookie!!</p>");
    out.println("<h2><a href='getSessionCookie'> CHeck Now</a>");

  }
}
