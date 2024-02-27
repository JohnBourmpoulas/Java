public class Doctor extends Person{
    protected String specialty;

    public Doctor(String name, String birth_date, String specialty){
        super(name, birth_date);
        this.specialty=specialty;
    }

    public String toString(){
        return "Doctor: " + "\n" + super.toString() + "\n" + "Speecialty: " + specialty;
    }
    
}
