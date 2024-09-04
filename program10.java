import java.util.*;

class ScannerDemo{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Student Name : ");
                String Name = sc.next();
                System.out.println(Name);


                System.out.print("Enter College Name : ");
                String Cllg = sc.next();
                System.out.println(Cllg);


                System.out.print("Enter College ID : ");
                int ID = sc.nextInt();
                System.out.println(ID);


                System.out.print("Enter CGPA : ");
                float cgpa = sc.nextFloat();
                System.out.println(cgpa);


        }
}
