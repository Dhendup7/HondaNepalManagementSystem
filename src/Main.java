import Headbranch.Branch;
import Headbranch.Department;
import Headbranch.Showroom;
import Servicecentre.Customers;
import Servicecentre.Parts;
import Servicecentre.Services;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Customers>customers=new ArrayList<>();
        Customers c1=  new Customers(true,false,true,false,true,true,982372809,true,9,"Dhendup","Bouddha",984127069);

customers.add(c1);


Showroom sh1=new Showroom("Mk","Black",20000,true,false);

        Parts p1=new Parts(true,false,true,true);


        Department d1=new Department("Bouddha","Jack");
        Branch b1=new Branch("Pokhara","Shreejesh");



    }
}
