package Common_interview_questions;

public class Sqrt {
    public static void main(String[] args) {
		int no=8;
		 if (no == 0) {
	          System.out.println(no);
	        }
	        int first = 1, last = no;
	        while (first <= last) {
	            int mid = first + (last - first) / 2;
	            if (mid == no / mid) {
	            	
	              // System.out.println(" mid.."+mid);
	            } else if (mid > no / mid) {
	                last = mid - 1;
	             //  System.out.println("last.."+last);
	            } else {
	                first = mid + 1;
	              //  System.out.println("first...."+first);
	            }
	        }
	        System.out.println(last);
	
		
		/*
		for(int i=1;i<no/2;i++) {
			if(i==no/i) {
				System.out.println(i);
				break;
			}
		}   */
		
		}
	}

