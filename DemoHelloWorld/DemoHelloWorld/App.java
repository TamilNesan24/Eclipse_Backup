package Spring.DemoHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Test.*;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); 
       Display display=(Display) context.getBean("A");
       display.print();
       
    }
}
