class ProfessionalContact extends Contact {
    private String profession;
    private String taxId;

    public ProfessionalContact(String firstName, String lastName, String address, String phoneNumber, String profession, String taxId) {
        super(firstName, lastName, address, phoneNumber);
        this.profession = profession;
        this.taxId = taxId;
    }

    public String toString() {
        return super.toString() +
               "\nProfession: " + profession +
               "\nTax ID: " + taxId;
    }
}