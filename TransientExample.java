import java.io.*;
class User implements Serializable {
    transient static int a = 123; // Will not be serialized (static + transient)
    String username;
    transient String password;    // Will not be serialized
    long contact;
    transient int atmPin;         // Will not be serialized

    User(String username, String password, long contact, int atmPin) {
        this.username = username;
        this.contact = contact;
        this.password = password;
        this.atmPin = atmPin;
    }
}

class TransientExample {
    public static void main(String[] args) {
        User user = new User("Ramesh", "ramesh@123", 9876543210L, 1234);

        System.out.println("Object before Serialized");
        System.out.println("name     : " + user.username);
        System.out.println("password : " + user.password);
        System.out.println("contact  : " + user.contact);
        System.out.println("atmPin   : " + user.atmPin);
        System.out.println("a        : " + user.a);
        System.out.println("_________________________");

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
            System.out.println("Object Serialized");
        } catch (Exception e) {
            System.out.println("Exception Handle");
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User deSerObj = (User) ois.readObject();
            System.out.println("Object after De-Serialized");
            System.out.println("name     : " + deSerObj.username);
            System.out.println("password : " + deSerObj.password); // will be null
            System.out.println("contact  : " + deSerObj.contact);
            System.out.println("atmPin   : " + deSerObj.atmPin);   // will be 0
            System.out.println("a        : " + deSerObj.a);        // static, not serialized
        } catch (Exception e) {
            System.out.println("Exception Handle");
        }
    }
}
