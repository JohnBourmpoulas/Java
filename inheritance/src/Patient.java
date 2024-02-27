public class Patient extends Person{
    protected String cashDesk;
    protected String clinic;
    protected Boolean admission;

    public Patient(String name, String birth_date, String cashDesk){
        super(name,birth_date);
        this.cashDesk=cashDesk;
        clinic="";
        admission=false;
    }

    public void admissionPatient(String clinic){
        if(this.admission){
            System.out.println("Cannot make an admission for this person because he's allready patient in the hospital.");
        }
        else
            this.clinic=clinic;
            this.admission=true;
    }

    public void patientExtraction(){
        if(!this.admission){
            System.out.println("Not yet entered.");
        }
        else
            this.admission=false;
    }

    public String toString(){
        return "Patient: " + "\n" + super.toString() + "\n" + "CashDesk: " + this.cashDesk + "\n" +
                "Clinic: " + this.clinic + "\n" + (this.admission? "Is being treated" : "he was discharged");
    }


}
