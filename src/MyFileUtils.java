
public class MyFileUtils {
	
	public int subtract10FromLargerNumber(int number) throws Exception {
		if(number < 10)
			throw new Exception("The number passed was smaller than 10");
		return number - 10;
	}
	
	public class FooRuntimeException extends Exception{
		
		
	}

}
