import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {
    private static AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {
        System.out.print("Welcome to Address Book System..!");
        System.out.println("Please Enter Contact Details..!");
        addressBook.addContact();
    }

}