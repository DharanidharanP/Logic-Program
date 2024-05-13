 package Common_interview_questions;

public class Singleton {

    private static Singleton instance;
    
    private Singleton() {
    	System.out.println("Constructor");
    }
    private static Singleton getInstance() {
    	if(instance==null) {
    		instance=new Singleton();
    	}
		return instance;
    	
    }
    
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
