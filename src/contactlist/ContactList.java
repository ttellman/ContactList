/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contactlist;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class ContactList {

    public static void main(String[] args) {
       int menuVal; //menu options
       Scanner scanIn = new Scanner(System.in);
       
       ArrayList<Contact> contactRecords = new ArrayList<Contact>();
       while (true){
           //menu
           System.out.println("========================================");
            System.out.println("|           My Contacts                |");
            System.out.println("========================================");
            System.out.println("| Options:                             |");
            System.out.println("|   1. Add Personal Contact            |");
            System.out.println("|   2. Add Business Contact            |");
            System.out.println("|   3. Get Contact List                |");
            System.out.println("|   4. Exit                            |");
            System.out.println("========================================");
            System.out.println(" Select option: ");
            menuVal = scanIn.nextInt();

            // Switch construct
            switch (menuVal) {
                case 1:
                    addpContact(contactRecords);
                    break;
                case 2:
                    addbContact(contactRecords);
                    break;
                case 3:
                    getContact(contactRecords);
                    break;
                case 4:
                    System.exit(0);
                    break;    
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }
    
    public static void addpContact(ArrayList<Contact> contactRecords){
        Scanner textIn = new Scanner(System.in);        
        System.out.println("Contact first name: ");
        String fName = textIn.nextLine();
        System.out.println("Contact last name: ");
        String lName = textIn.nextLine();
        System.out.println("Contact email address: ");
        String emailAdd = textIn.nextLine();
        System.out.println("Contact Address: ");
        String conAdd = textIn.nextLine();
        System.out.println("Contact phone number: ");
        String pnumber = textIn.nextLine();
        System.out.println("Contact type:");
        String type = textIn.nextLine();
        System.out.println("Contact date of birth: ");
        String dateB =textIn.nextLine();
        PersContact apersCon = new PersContact(fName, lName, emailAdd, conAdd, pnumber, type, dateB);
        contactRecords.add(apersCon);
    }
    public static void addbContact(ArrayList<Contact> contactRecords){
        Scanner textIn = new Scanner(System.in);
        System.out.println("Contact first name: ");
        String fName = textIn.nextLine();
        System.out.println("Contact last name: ");
        String lName = textIn.nextLine();
        System.out.println("Contact email address: ");
        String emailAdd = textIn.nextLine();
        System.out.println("Contact Address: ");
        String conAdd = textIn.nextLine();
        System.out.println("Contact phone number: ");
        String pnumber = textIn.nextLine();
        System.out.println("Contact type:");
        String type = textIn.nextLine();
        System.out.println("Contact Job Title: ");
        String jTitle =textIn.nextLine();
        System.out.println("Contact Orginazation: ");
        String org = textIn.nextLine();
        BusiContact aBCon = new BusiContact(fName, lName, emailAdd, conAdd, pnumber, type, jTitle, org);
        contactRecords.add(aBCon);
    }
    
    public static void getContact(ArrayList<Contact> contactRecords){
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Contact list");
        for (int i = 0; i < contactRecords.size(); i++){
            System.out.println(i + ")" + contactRecords.get(i).getFName()+ " " + contactRecords.get(i).getLName());
        }
        System.out.println("Please enter the number of the contact for more infomration");
        int choice = keyIn.nextInt();
        
        System.out.println(contactRecords.get(choice).toString());   
        
    }
}      
