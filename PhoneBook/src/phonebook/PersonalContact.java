class PersonalContact extends Contact {
    private String birthDate;

    public PersonalContact(String firstName, String lastName, String address, String phoneNumber, String birthDate) {
        super(firstName, lastName, address, phoneNumber);
        this.birthDate = birthDate;
    }

    public String toString() {
        return super.toString() +
               "\nBirth Date: " + birthDate;
    }
}