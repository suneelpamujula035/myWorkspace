package listners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Test1
 *
 */
@WebListener
public class Test1 implements ServletContextListener {

    
    public Test1() {
        // TODO Auto-generated constructor stub
    }

    public void contextInitialized(ServletContextEvent sce) 
    { 

    	System.out.println("Context init");
    }

    public void contextDestroyed(ServletContextEvent sce)
    { 

    	System.out.println("Context destroyed");
    }

   	
}
