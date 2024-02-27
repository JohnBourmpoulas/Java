public class Department {
    private String department_Name;
    private String department_Phone;
    private String department_Email;
    private String department_Address;

    public Department(String dep_Name, String dep_Phone, String dep_Email, String dep_Address){
        this.department_Name = dep_Name;
        this.department_Phone = dep_Phone;
        this.department_Email = dep_Email;
        this.department_Address = dep_Address;
    }

    public Department(){
        this("University of the aegean (MPES)", "(+30) 22730 94xxx", "www.icsd.aegean.gr)", "Samos-Karlovasi");
    }

    public void display(){
        System.out.println("Department_Name: " + department_Name + " \n" +
                            "Department_Phone: " + department_Phone + " \n" +
                            "Department_Email: " + department_Email + " \n" +
                            "Department_Address: " + department_Address + " \n"); 
    }

}
