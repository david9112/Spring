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

        Alien a= context.getBean(Alien.class);
        System.out.println(a.getAge());

        a.code();


//        Desktop dt = context.getBean("desktop", Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean("desktop", Desktop.class);
//        dt1.compile();



    }
}
