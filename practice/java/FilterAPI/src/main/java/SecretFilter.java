import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/secret")
public class SecretFilter implements Filter{
  @Override
  public void doFilter(ServletRequest request
                    ,ServletResponse response,
                      FilterChain chain)
  throws ServletException,IOException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse res = (HttpServletResponse) response;
    String key = req.getParameter("key");
    
    if("Bilal".equals(key)){
      chain.doFilter(request,response);
    }
    else{
      out.println("Invalid Key enter correct key");
      out.println("<a href='index.html'> TRY Again </a>");
      
    }
  }
}
