package listners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Test3
 *
 */
@WebListener
public class Test3 implements ServletRequestListener {

    public Test3() {

    	
    }

    public void requestInitialized(ServletRequestEvent sre) 
    { 

    	System.out.println("for request init");
    }
    public void requestDestroyed(ServletRequestEvent sre)  
    { 

    	System.out.println("for request destroy");
    }

    
	
}
