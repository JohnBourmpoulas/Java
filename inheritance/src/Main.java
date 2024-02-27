public class Main {
    public static void main(String[] args) throws Exception {
        Doctor doctor = new Doctor("Jack Sparrow", "12/1/1967", "Pathologist");
        Patient patient = new Patient("Test Patient", "11/2/2002", "Testing_CashDesk");
        

        System.out.println("------------------------------------");
        patient.admissionPatient("orthopedics");
        System.out.println(patient);

        System.out.println("------------------------------------");
        patient.patientExtraction();
        System.out.println(patient);
        System.out.println("------------------------------------");

        System.out.println(doctor);
    }
}
