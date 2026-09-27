import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/getSessionCookie")
public class getCookie extends HttpServlet{
  protected void doGet(HttpServletRequest req,
                       HttpServletResponse res)
  throws ServletException,IOException{
    PrintWriter out = res.getWriter();
    res.setContentType("text/html");
    Cookie[] cookies = req.getCookies();
    Boolean found = false;
    if(cookies!=null){
      for(Cookie ck:cookies){
        if("sessionUser".equals(ck.getName())){
          out.println("<h2>Welcome Back !"+ck.getValue()+"</h2>");
        }
      }
    }
    if(!found){
      out.println("<h2>NO cookies found</h2>");
    }
    out.println("<h2><a href='setSessionCookie'> Create new cookie session<a/></h2>");
  }
}
