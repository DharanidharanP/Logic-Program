package New_programs;

public class Practice {       
    public static void main(String[] args) {
     
    	int no=17;
    	int div =2;
    	boolean prime=true;
    	for(div=2;div< no;div++) {
    		if(no%div==0) {
    			prime =false;
    			break;
    		}
    	}
    	System.out.println(prime);
	}
}
