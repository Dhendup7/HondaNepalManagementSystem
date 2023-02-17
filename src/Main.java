import Headbranch.Branch;
import Headbranch.Department;
import Headbranch.Showroom;
import Servicecentre.Customers;
import Servicecentre.Parts;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Customers c1 = new Customers(true, false, true, true, true, true, 91231212, true, 9, "Binod", "Kharibot", 934127069);
        Customers c2 = new Customers(true, false, true, true, false, false, 972347203, true, 9, "Rahul", "Bouddha", 984127032);


        Showroom sh1 = new Showroom("Mk", "Black", 1000000, true, false);
        Showroom sh2 = new Showroom("Jk", "White", 2000000, true, false);
        Showroom sh3 = new Showroom("Yt", "Pink", 300000, true, false);

        Parts p1 = new Parts(true, false, true, true);
        Parts p2 = new Parts(false, true, true, true);
        Parts p3 = new Parts(true, true, false, false);


        Department d1 = new Department("Boudha", "dhendup", true, false, true, 1, "Mechanics_dep");
        Department d2 = new Department("Lakeside", "shreejesh", true, false, true, 2, "Servicing_dep");
        Department d3 = new Department("Humla", "sanjay", false, false, true, 3, "Marketing_dep");

        Branch b1 = new Branch("Pokhara", "Dhendup", true, false, true);
        Branch b2 = new Branch("Kathmandu", "Shreejesh", true, true, true);
        Branch b3 = new Branch("Mustang", "Sanjay", true, false, false);



        Scanner scanner = new Scanner(System.in);


        System.out.println("1 Binod");
        System.out.println("2 Rahul");



        System.out.println("Enter  id for Customers details");
        int id = scanner.nextInt();
        if (id == 1) {
            c1.Customerinfo();
        }

       else if (id == 2) {
            c2.Customerinfo();
        }
       else if (id == 3) {
            c1.Customerinfo();
        }
 else{
            System.out.println("No info available");
        }

        System.out.println("1 Pokhara");
        System.out.println("2 Kathmandu");
        System.out.println("3 Mustang");

        System.out.println("Enter the location id");
       int locations= scanner.nextInt();
        if(locations==1){
            b1.Branchinfo();

        }
       else if(locations==2){
            b2.Branchinfo();
        }

else if(locations==3){
    b3.Branchinfo();
        }
        else{
            System.out.println("Invalid");
        }

        System.out.println("c1 parts");
        System.out.println("c2 parts");
        System.out.println("c3 parts");
        System.out.println("Enter id for parts details");
int parts= scanner.nextInt();
if(parts==1){
    p1.parts();
}
       else if(parts==2){
            p2.parts();
        }
       else if(parts==3){
            p3.parts();
        }
else{
    System.out.println("Invalid");
}

        System.out.println("Enter the Department id");
        int dep_id= scanner.nextInt();
        if(dep_id==1){
            d1.DepartmentInfo();
        }
        else if(dep_id==2){
            d2.DepartmentInfo();
        }
        else if(dep_id==3){
            d3.DepartmentInfo();
        }
        else{
            System.out.println("Invalid");
        }

        System.out.println("Showroom1 Pokhara");
        System.out.println("Showroom2Kathmandu");
        System.out.println("Showroom3 Mustang");
        System.out.println("Enter the showroom id");

        int showroom= scanner.nextInt();
        if(showroom==1){
            sh1.Showpiece();
        }
       else if(showroom==2){
            sh2.Showpiece();
        }
        else if(showroom==3){
            sh3.Showpiece();
        }
        else{
            System.out.println("No data here");
        }


        }
    }






