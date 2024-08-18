import java.util.*;

class TelephoneIndex {
    private Map<String, String> contacts;

    public TelephoneIndex() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void findData(String findName) {
        boolean found = false;
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getKey().startsWith(findName)) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No records found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TelephoneIndex telephoneIndex = new TelephoneIndex();

        System.out.print("Enter the number of contacts: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input

        for (int i = 0; i < n; i++) {
            System.out.print("Enter contact name: ");
            String name = scanner.nextLine();
            System.out.print("Enter contact phone number: ");
            String phoneNumber = scanner.nextLine();
            telephoneIndex.addContact(name, phoneNumber);
        }

        System.out.print("Enter the name to search for: ");
        String findName = scanner.nextLine();
        telephoneIndex.findData(findName);

        scanner.close();
    }
}
