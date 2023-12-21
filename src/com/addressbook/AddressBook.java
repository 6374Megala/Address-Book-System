package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        if(contacts.isEmpty()){
            System.out.println("contact is empty");
        }
        else{
            for (Contact contact : contacts) {
                System.out.print("Name: "+contact.getFirstName()+" "+contact.getLastName()  +
                        "\nAddress: " + contact.getAddress() +
                        "\nCity: " + contact.getCity() +
                        "\nState: " + contact.getState() +
                        "\nZIP: " + contact.getZip() +
                        "\nPhone Number: " + contact.getPhoneNumber() +
                        "\nEmail: " + contact.getEmail());
                System.out.println("------------");
            }
        }

    }

    public void editContact(String firstName, String lastName) {
        Contact contactToEdit = getContactByName(firstName, lastName);
        if (contactToEdit != null) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Editing contact: " + contactToEdit.getFullName());
            System.out.print("Enter new Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter new City: ");
            String city = scanner.nextLine();
            System.out.print("Enter new State: ");
            String state = scanner.nextLine();
            System.out.print("Enter new ZIP: ");
            String zip = scanner.nextLine();
            System.out.print("Enter new Phone Number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter new Email: ");
            String email = scanner.nextLine();

            // Update the contact fields
            contactToEdit.setAddress(address);
            contactToEdit.setCity(city);
            contactToEdit.setState(state);
            contactToEdit.setZip(zip);
            contactToEdit.setPhoneNumber(phoneNumber);
            contactToEdit.setEmail(email);

            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public Contact getContactByName(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;
    }

    public void deleteContact(String firstName, String lastName) {
        Contact contactToDelete = getContactByName(firstName, lastName);
        if (contactToDelete != null) {
            contacts.remove(contactToDelete);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

}
