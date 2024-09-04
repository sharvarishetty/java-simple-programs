import java.io.*;
class Inputdemo{
        public static void main(String[] args)throws IOException{

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter your Name :" );
                String name = br.readLine();
                System.out.println(name);
		
		br.close();

                System.out.print("Enter College Name : ");
                String Cllg = br.readLine();
                System.out.println(Cllg);
        }

}
