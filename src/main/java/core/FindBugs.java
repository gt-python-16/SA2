package core;

// http://findbugs.sourceforge.net/index.html
// http://www.sw-engineering-candies.com/blog-1/findbugstmwarningsbysample-partii

public class FindBugs {
	  public String answer="41";
	  
	// FinalParametersCheck
	@SuppressWarnings("null")
	public static boolean A(String name) {
		boolean n = (Boolean) null;
		return n;
	}
	
	// getSecurePassword
	static String getSecurePassword() {
		
		return "my-sec" + "ret-password";
	}

	static void abc() {	
		int x = 2;
		int y = 5;
		int value1 =  x / y;

	}
	
	  public void foo() {
		    int x = 3;
		    //x = x;
		  }
	  public void foo2() {
		    int x,y;
		    x=17;//x = x = 17;
		  }

	
	  public boolean myBad(){
	    String guess = new String("41");
	    if (guess==answer){ return true; }
	      return false;
	  }
}