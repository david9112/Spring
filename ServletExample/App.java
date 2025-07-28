package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class App
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat t= new Tomcat();
        t.setPort(8080);

        Context context = t.addContext("",null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");

        t.start();
        System.out.println("server started");
        t.getServer().await();
        System.out.println("Server waiting");
    }
}
