package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println( "Hello World!" ); 
        Alien a= (Alien)context.getBean("alien");
        a.code();

    }
}
