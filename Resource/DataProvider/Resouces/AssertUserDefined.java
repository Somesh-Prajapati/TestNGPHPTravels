package DataProvider.Resouces;

public class AssertUserDefined  {
		
	 public static void error(String msg) {
	        throw new AssertionError(msg);
	    }
	
	  public static boolean check(String cond, String msg) {
	        	if (cond.equals(msg)) {
		            return true;
		        }
		        else
		        {
		            error(msg);
		            return false;
		        }
	  }
}



