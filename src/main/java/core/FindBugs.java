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
	
}