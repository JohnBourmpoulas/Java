public class salaried_Employee extends employee {
    protected double salary;

    public salaried_Employee(String fullName, String id, String phone, double salary){
        super(fullName,id,phone);
        this.salary=salary;
    }


    public double payment(){
        return salary;
    }

    public String toString(){
        return super.toString() + " will take this month " + payment() + " Euro.";
    }
}
