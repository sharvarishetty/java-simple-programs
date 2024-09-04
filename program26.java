import java.io.*;
class Inputdemo{
        public static void main(String[] args)throws IOException{

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter your Name :" );
                String name = br.readLine();


                System.out.print("Enter College Name : ");
                String Cllg = br.readLine();


                System.out.print("Enter College ID : ");
                int Id = Integer.parseInt(br.readLine());
                
		System.out.print("Enter CGPA : ");
                float cgpa = Float.parseFloat(br.readLine());
               
	       	System.out.println(cgpa);
                System.out.println(Cllg);
                System.out.println(name);
                System.out.println(Id);
        }

}
