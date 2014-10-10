/*
 * the break keyword will stop the execution of the innermost loop and start executing the next line of code after the block
 */
public class Break {
	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		for(int x : numbers){
			if(x == 5)break;
			System.out.println(x);
		}
	}
}
