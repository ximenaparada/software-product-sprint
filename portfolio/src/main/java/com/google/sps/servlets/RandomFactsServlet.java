package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/facts_servlet")
public class RandomFactsServlet extends HttpServlet {

  private List<String> Facts = new ArrayList<>();

 
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
 
    this.Facts.add("I love learning things in general. Especially becoming good at them.");
    this.Facts.add("I go hiking and camping with my family during breaks. During Spring Break, we went to a snowy place in NM. We camped through a snowstorm and didn't realize until the next day that one of our tents was a summer tent.");
    this.Facts.add("My first time flying alone had me stuck at an airport for 8+ hours to then board a 13 hr flight.");
    this.Facts.add("I love traveling. I once stayed 3 weeks in S. Korea with my younger sister, learning the language and culture.");
 
    // Convert the server facts to JSON
    String json = convertToJsonUsingGson(Facts);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
    
  }

  /**
   * Converts a ServerStats instance into a JSON string using the Gson library. Note: We first added
   * the Gson library dependency to pom.xml.
   */
  private String convertToJsonUsingGson(List<String> serverFacts) {
    Gson gson = new Gson();
    String json = gson.toJson(serverFacts);
    return json;
  }

}

