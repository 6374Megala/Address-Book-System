package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        AddressBook addressBook = new AddressBook();
        System.out.println("Adding a new contact:");
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        System.out.print("Enter State: ");
        String state = scanner.nextLine();
        System.out.print("Enter ZIP: ");
        String zip = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(newContact);

        System.out.println("Contacts in Address Book:");
        addressBook.displayContacts();
        //Editing
        System.out.println("\nEditing a contact:");
        System.out.print("Enter First Name of the contact to edit: ");
        String editFirstName = scanner.nextLine();
        System.out.print("Enter Last Name of the contact to edit: ");
        String editLastName = scanner.nextLine();
        addressBook.editContact(editFirstName, editLastName);
        System.out.println("Contacts in Address Book after editing:");
        addressBook.displayContacts();
        //Deleting
        System.out.println("\nDeleting a contact:");
        System.out.print("Enter First Name of the contact to delete: ");
        String deleteFirstName = scanner.nextLine();
        System.out.print("Enter Last Name of the contact to delete: ");
        String deleteLastName = scanner.nextLine();
        addressBook.deleteContact(deleteFirstName, deleteLastName);

        System.out.println("\nContacts in Address Book after deleting:");
        addressBook.displayContacts();

    }
}
