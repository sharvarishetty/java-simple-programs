import java.io.*;
class Inputdemo{
        public static void main(String[] args){

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String name = br.readLine();
                System.out.println(name);
        }

}
