package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println(
            "<!DOCTYPE html>" +
            "<html>" +
            "<head><title>Jakarta App</title></head>" +
            "<body>" +
            "<h1>Hello from Jakarta!</h1>" +
            "<p>Tomcat + Maven + Jakarta Servlet is working.</p>" +
            "</body>" +
            "</html>"
        );
    }
}
