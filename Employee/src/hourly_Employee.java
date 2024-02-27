public class hourly_Employee extends employee {
    protected int workingHoures;
    protected double salaryPerHour;

    public hourly_Employee(String fullName, String id, String phone, int workingHoures, double salaryPerHour){
        super(fullName,id,phone);
        this.workingHoures=workingHoures;
        this.salaryPerHour=salaryPerHour;
    }

    public double payment(){
        return workingHoures * salaryPerHour;
    }

    public String toString(){
        return super.toString() + " will take this month " + payment() + " Euro.";
    }
}