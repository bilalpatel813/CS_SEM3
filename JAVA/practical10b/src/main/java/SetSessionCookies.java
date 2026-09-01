import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/SetSessionCookies")
public class SetSessionCookies extends HttpServlet{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException {
        Cookie sessionCookie = new Cookie("sessionUser","SYCS");
        res.addCookie(sessionCookie);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Session cookie created </h2>");
        out.println("<p>close the browser to delete this cookie</p>");
        out.println("<a href='GetSessionCookies'> Check Cookie</a>");

    }
}
