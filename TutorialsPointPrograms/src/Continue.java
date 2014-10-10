/*
 * The continue keyword can be used in any of the loop control structure.it cause the loop to immediately jump to the next iteration of the loop
 */
public class Continue {
	public static void main(String[] args) {
		int [] numbers = {1,4,5,7,8,9,2,3};
		for(int x :numbers){
			if(x == 8)continue;
			System.out.println(x);
		}	
	}
	

}
