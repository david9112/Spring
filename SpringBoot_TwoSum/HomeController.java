package com.example.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("in home");
        return "index.jsp";
    }
    @RequestMapping("/add")
    public String add(HttpServletRequest req, HttpSession session){
        int i=Integer.parseInt(req.getParameter("num1"));
        int j=Integer.parseInt(req.getParameter("num2"));
        int result=i+j;
        session.setAttribute("result",result);
        System.out.println("in add");
        return "result.jsp";
    }
}
