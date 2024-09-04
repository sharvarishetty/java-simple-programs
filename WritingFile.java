import java.io.*;
import java.util.*;

class WritingFile{
	
	public static void main(String[] args) throws IOException{
			
		Scanner sc = new Scanner(System.in);
		FileWriter fw1 = new FileWriter("MyFile.txt");
		
		
		System.out.println("Enter your data: ");
		String data = sc.nextLine();
		
	
		fw1.write(data+"\n");
		
		fw1.write("FirstName: Soham\n");
		fw1.write("LastName: Bhaskarwar\n");
		fw1.write("Batch: JAVA\n");

		fw1.close();
	}
}
