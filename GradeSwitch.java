package conditional_statements;

public class GradeSwitch {
	public static void main (String[] args) {
		char ch= 'b';
		switch(ch) {
		    case 'A':
		    case 'a':
		    	System.out.println("Marks between 76 to 100");
		    	break;
		    case 'B':
		    case 'b':
		    	System.out.println("Marks between 51 to 75");
		    	break;
		    case 'C':
		    case 'c':
		    	System.out.println("Marks between 36 to 50");
		    	break;
		    case 'F':
		    case 'f':
		    	System.out.println("Marks between 0 t0 35");
		    	break;
		    default:
		    	System.out.println("Invalid Grade");
		 }
	}

}
