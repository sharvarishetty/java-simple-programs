import java.io.*;

class InputDemo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Your Name: ");
                String Name = br.readLine();

                br.close();

                System.out.print("Enter society name: ");
                String SocName = br.readLine();

                System.out.print("Enter Wing: ");
                Char wing = br.readLine();

		System.out.print("Enter Flat number: ");
		String FlatNo = br.readLine();
		

        }                                                                   }
