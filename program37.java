import java.util.Scanner;
class InputDemo{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.next();
	 
		System.out.print("Enter society name: ");
		String socName = sc.next();

		System.out.print("Enter wing: ");
		char wing = sc.next().charAt(0);
		
		System.out.print("Enter flat number: ");
		int flatNo = sc.nextInt();
	}
}
