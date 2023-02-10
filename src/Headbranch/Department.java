package Headbranch;

public class Department extends Branch{
    int department_id;
    String department_name;

    public Department(String branch_location, String branch_head, boolean b, boolean b1, boolean b2, int department_id, String department_name) {
        super(branch_location, branch_head, b, b1, b2);
        this.department_id = department_id;
        this.department_name = department_name;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }




    public void DepartmentInfo(){
        System.out.println("*****************Department info**********************");
        System.out.println("Department_id:"+this.department_id);
        System.out.println("Department_name:"+this.department_name);

    }





}

