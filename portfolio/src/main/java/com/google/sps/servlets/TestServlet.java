package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test_servlet")
public class TestServlet extends HttpServlet {
  private int visits = 0;
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    visits++;

    response.setContentType("text/html;");
    response.getWriter().println("<h1>Hello world!</h1>");
    if(visits % 10 == 0){
        response.getWriter().println("<p>Congratulations, you are the " + visits + " person to visit this site!");
    }
    response.getWriter().println("<p>This page has been visited " + visits + " times.</p>");
  }
}