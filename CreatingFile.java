import java.io.*;

class CreatingFile{
	
	public static void main(String[] args) throws IOException{
		
		File f1 = new File("MyFile.txt");
		f1.createNewFile();
	}
}

