package com.sithuhantun.myservletdemo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "myServletDemo", value = "/my-servlet-demo")
public class MyServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String user = "user";
        String userPassword = "123";
        String username = request.getParameter("myName");
        String password = request.getParameter("password");
        if(user.equals(username) & password.equals(userPassword)) {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
            rd.forward(request, response);
        }else {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            RequestDispatcher rd = request.getRequestDispatcher("/fail.jsp");
            rd.forward(request, response);
        }
    }
}
