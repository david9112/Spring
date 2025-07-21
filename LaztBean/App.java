package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // creation of container as well as the object in container
        Alien a= (Alien)context.getBean("alien1");
        a.code();
        System.out.println(a.getAge());

        // Desktop = (Desktop)context.getBean("com2");

    }
}
