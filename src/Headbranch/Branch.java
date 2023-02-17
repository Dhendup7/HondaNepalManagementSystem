package Headbranch;

public class Branch {

    String branch_location;
    String branch_head;

    Boolean Parts;
    Boolean Services;
    Boolean Showroom;

    public Branch(Boolean parts, Boolean services, Boolean showroom) {
        Parts = parts;
        Services = services;
        Showroom = showroom;
    }

    public Boolean getParts() {
        return Parts;
    }

    public void setParts(Boolean parts) {
        Parts = parts;
    }

    public Boolean getServices() {
        return Services;
    }

    public void setServices(Boolean services) {
        Services = services;
    }

    public Boolean getShowroom() {
        return Showroom;
    }

    public void setShowroom(Boolean showroom) {
        Showroom = showroom;
    }

    public Branch(String branch_location, String branch_head, boolean b, boolean b1, boolean b2) {
        this.branch_location = branch_location;
        this.branch_head = branch_head;
    }


    public void Branchinfo(){
        System.out.println("*********************Branch details *************************");
        System.out.println("Branch head:"+this.branch_head);
        System.out.println("Branch locations:"+this.branch_location);
        System.out.println("Parts available:"+this.Parts);
        System.out.println("Services available:"+this.Services);
        System.out.println("Showroom available:"+this.Showroom);
    }




}
