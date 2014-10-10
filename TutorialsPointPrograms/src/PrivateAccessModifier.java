/*
 * Class and interfaces cannot be Private
 */
public class PrivateAccessModifier {
	
	private String format;	// Private Instance variable
	public String getFormat(){
		return format;
	}
	
	public void setFormat(String format){
		this.format = format;
	}
}
