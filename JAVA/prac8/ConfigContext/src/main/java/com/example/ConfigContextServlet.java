package com.example;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ConfigContextServlet extends HttpServlet {

    private String studentName;

    @Override
    public void init(ServletConfig config) throws ServletException {
        studentName = config.getInitParameter("studentName");

        ServletContext context = getServletContext();
        context.setAttribute("College", "Ismail Yusuf College");
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();

        String collegeName =
                (String) context.getAttribute("College");

        out.println("<html>");
        out.println("<body>");

        out.println("<h1>ServletConfig and ServletContext</h1>");

        out.println("<h2>ServletConfig</h2>");
        out.println("<p>Student Name: " + studentName + "</p>");

        out.println("<h2>ServletContext</h2>");
        out.println("<p>College Name: " + collegeName + "</p>");

        out.println("</body>");
        out.println("</html>");
    }
}