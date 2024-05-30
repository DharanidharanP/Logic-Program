package New_programs;

public class Practice {       
    public static void main(String[] args) {
     
    String str="abcaba";
    String longest="";
    for(int i=0;i<str.length();i++) {
    	for(int j=i+1;j<str.length();j++) {
    		String sub=str.substring(i,j);  		
    		longest=sub;
    	}
    }
    System.out.println(longest);
	}
}
