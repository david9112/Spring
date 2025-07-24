package org.example;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h>David</h>");
        out.println("<h><b> heading </b> </h>");
        out.println("<a href=http://www.daviddumpala.netlify.app>link</a>");
//        res.getWriter().println("David😎");
    }

}
