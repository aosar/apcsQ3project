
public class IllegalDateException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6946987517589405632L;

	public IllegalDateException(String error){
		super(error);//month, year, date not in valid range
	}
}
