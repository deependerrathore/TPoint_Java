//Clasic Singleton
public class ClasicSingleton {

	private static ClasicSingleton instance = null;
	protected ClasicSingleton(){
		//Exists only to defeat instantiation
		
	}
	public static ClasicSingleton getInstance(){
		if(instance == null){
			instance = new ClasicSingleton();
		}
		
		return instance;
	}
}