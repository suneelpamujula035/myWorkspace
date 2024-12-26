package httpSessionListner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListner
 *
 */
@WebListener
public class MyListner implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MyListner() {

    	
    }

    public static int total=0;
    public static int current=0;
    
    public static int totalcount()
    {
    	return total;
    }
    public static int currentcount()
    {
    	return current;
    }
    public void sessionCreated(HttpSessionEvent se)  { 

    	total++;
    	current++;
    	
    	System.out.println("Event is fire total logged in user "+total);
    	System.out.println("Event is fire current logged in user "+current);

    }
    
    public void sessionDestroyed(HttpSessionEvent se)  { 

    	current--;
    }
	
}
