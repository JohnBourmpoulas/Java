public class PhoneDirectoryApp {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        // Adding contacts
        PersonalContact personalContact = new PersonalContact("John", "Doe", "123 Main St", "123-456-7890", "1990-01-15");
        ProfessionalContact professionalContact = new ProfessionalContact("Jane", "Smith", "456 Elm St", "987-654-3210", "Software Engineer", "123456789");

        phoneDirectory.addContact(personalContact);
        phoneDirectory.addContact(professionalContact);

        // Searching for a contact
        Contact foundContact = phoneDirectory.searchByLastName("Doe");
        if (foundContact != null) {
            System.out.println("Found Contact:\n" + foundContact);
        } else {
            System.out.println("Contact not found.");
        }

        // Deleting a contact
        phoneDirectory.deleteContact("Smith");

        // Displaying contact count
        int contactCount = phoneDirectory.getContactCount();
        System.out.println("Total Contacts: " + contactCount);

        // Saving and loading contacts
        phoneDirectory.saveContactsToFile("contacts.txt");
        phoneDirectory.loadContactsFromFile("contacts.txt");
    }
}