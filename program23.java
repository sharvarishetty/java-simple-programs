import java.io.*;
class Inputdemo{
        public static void main(String[] args)throws IOException{

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter your Name :" );
                String name = br.readLine();
                System.out.println(name);
	
			
                System.out.print("Enter Comapany Name : ");
                String Cllg = br.readLine();
                System.out.println(Cllg);
        }

}
