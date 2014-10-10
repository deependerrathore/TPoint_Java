
public class SwitchStatement {
	public static void main(String[] args) {
		try{

			char grade = args[0].charAt(0);
			switch (grade) {
			case 'A':
				System.out.println("Execellent");
				break;
			case 'B':
				System.out.println("Very Good");
				break;
			case 'C':
				System.out.println("Good");
				break;
			case 'D':
				System.out.println("Poor");

			default:
				System.out.println("Invalid Request");
				break;
			}
	
		}catch(Exception e){
			System.out.println("Please Enter Grade");
		}
		
	}
}
