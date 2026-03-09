import java.util.HashMap;
public class ContactMap {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Rahul", "9876543210");
        contacts.put("Anita", "9123456780");
        contacts.put("Kiran", "9012345678");
        contacts.put("Priya", "9988776655");
        String name = "Rahul";
        if (contacts.containsKey(name)) {
            System.out.println("Phone number of " + name + " is: " + contacts.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }
}