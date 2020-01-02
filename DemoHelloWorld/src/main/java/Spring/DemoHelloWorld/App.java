package Spring.DemoHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Test.*;

public class App 
{
    public static void main( String[] args )
    {
    	// if no id is present in the xml for the corresponding bean it will accept the class path fully  
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
       Display display=(Display) context.getBean("A");
       display.print();
       
    }
}
