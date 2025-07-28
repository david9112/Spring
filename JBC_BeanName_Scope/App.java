package org.example;
import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean("desktop", Desktop.class);
        dt.compile();

        Desktop dt1 = context.getBean("desktop", Desktop.class);
        dt1.compile();







        // this is XML configuration

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // creation of container as well as the object in container
//        Alien a= (Alien)context.getBean("alien1");
//        a.code();
//        System.out.println(a.getAge());

    }
}
