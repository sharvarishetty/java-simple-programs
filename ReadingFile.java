import java.io.*;

class ReadingFile{
	
	public static void main(String[] args)throws IOException{
		
		FileReader fr1 = new FileReader("MyFile.txt");

		int ch = 0;

	while((ch=fr1.read())!=-1){
		
			System.out.print((char)ch);
		}

		fr1.close();
	}
}
