import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/GetSessionCookies")
public class GetSessionCookies extends HttpServlet {
    protected void doGet(HttpServletRequest req,HttpServletResponse res)
        throws ServletException ,IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Cookie[] cookies = req.getCookies();
        boolean found = false;
        if(cookies != null){
            for(Cookie ck:cookies){
                if("sessionUser".equals(ck.getName())) {
                    out.println("<h2>Welcome Back,"+ck.getValue()+"</h2>");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            out.println("<h2> No Session Cookie found </h2>");
        }
        out.println("<p><a href='SetSessionCookies'>Create Session Cookie Again</a><p>");
    }
}
