/*
 * for(declaration : expression){
 * }
 */
public class EnhancedForLoop {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		for(int i : numbers	){
			System.out.println(i);
		}
		
		String[] names= {"Deepak","Rinku","Indu"};
		for(String name : names){
			System.out.println(name);
		}
	}
}
