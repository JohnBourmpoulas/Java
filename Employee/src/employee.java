public class employee {
    protected String fullName;
    protected String id;
    protected String phone;

    public employee(String fullName, String id, String phone){
        this.fullName=fullName;
        this.id=id;
        this.phone=phone;
    }

    public String toString(){
        return "Employee: " + fullName + " with ID: " + id + " and PhoneNumber: " + phone;
    }

}
