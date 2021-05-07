package com.google.sps.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visits_servlet")
public class TimesVisitedServlet extends HttpServlet {

  private int visits;

 
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    this.visits++;

    response.setContentType("text/html;");

    if(visits % 10 == 0){
        response.getWriter().println("You are the " + visits + " person to visit this site!");
    }
    else{
        response.getWriter().println("This page has been visited " + visits + " times.");
    }
    
  }

}