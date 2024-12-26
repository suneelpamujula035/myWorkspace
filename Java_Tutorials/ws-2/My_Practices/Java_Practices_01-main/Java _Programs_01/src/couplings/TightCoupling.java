package couplings;

class Subject
{ 
	TightCoupling t = new TightCoupling(); 
	
    public void startReading() 
    { 
        t.understand(); 
    } 
} 
class TightCoupling
{ 
    public void understand() 
    { 
        System.out.println("Tight coupling concept"); 
    } 
    
    public static void main(String[] args) {
		
    	Subject s = new Subject();
    	s.startReading();
	}
} 