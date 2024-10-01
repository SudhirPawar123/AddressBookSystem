import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
  private Contact contact;
  AddressBook(){
    contact=new Contact();
  }
  public void addContact() {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter FirstName:");
    contact.setFirstName(scanner.nextLine());
    System.out.println("Enter LastName:");
    contact.setLastName(scanner.nextLine());
    System.out.println("Enter Address:");
    contact.setAddress(scanner.nextLine());
    System.out.println("Enter City:");
    contact.setCity(scanner.nextLine());
    System.out.println("Enter State:");
    contact.setState(scanner.nextLine());
    System.out.println("Enter Zip:");
    contact.setZip(scanner.nextLine());
    System.out.println("Enter PhoneNumber:");
    contact.setPhoneNumber(scanner.nextLine());
    System.out.println("Enter Email:");
    contact.setEmail(scanner.nextLine());
    System.out.println("Contact added Successfully..!");
    System.out.println(contact);
  }
}
