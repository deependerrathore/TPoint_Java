/*The singleton purpose is to control object creation,limiting the number of objects to one only.
 * Since there is only one singleton instance , any instance fields of a singleton will occur only once per class,Just like static fields.
 * Used to control access to resources such as database commections or sockets.
 */
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	/*A private constructor prevents any other class for instantiating.
	 * 
	 */
	private Singleton(){
		
	}
	
	//Static 'instance' method
	public static Singleton getInstance(){
		return singleton;
	}
	
	//Other methods protected by singleotn-ness
	protected static void demoMethod(){
		System.out.println("demoMethod for singleton");
	}

}
