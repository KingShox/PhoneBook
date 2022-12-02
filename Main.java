package PhoneBook;


import java.util.Scanner;


public class Main {
    static PhoneList phoneList = new PhoneList();
    static Scanner userInput = new Scanner(System.in);
    static int input;

    public static void main(String[] args) {
    
        do{
          menu();
        
            switch(Main.input){
                case 1:
                    addingContact(phoneList);
                break;
                case 2:
                    displayContact();
                break;
                case 3:
                    removingContact();
                break;
                case 4:
                    findingContact();
                break;

            }
         }while(Main.input!=5);
            
    }
    public static void menu(){
        System.out.println("Welcome to your PhoneBook! What would you like to do?");
        System.out.println("########################################################");
        System.out.println("Input '1' to add new contact?");
        System.out.println("########################################################");
        System.out.println("Input '2' to display contact?");
        System.out.println("########################################################");
        System.out.println("Input '3' to remove contact?");
        System.out.println("########################################################");
        System.out.println("Input '4' to find contact?");
        System.out.println("########################################################");
        System.out.println("Input '5' to exit? ");
        System.out.println("########################################################");
        System.out.print("Select your choice? ");
        input = userInput.nextInt();
        
    }
    public static void addingContact(PhoneList phoneList){
        Person person = new Person();

        System.out.println("###################### ADDING ##########################");
        System.out.println("########################################################");
        System.out.println("########################################################");
        System.out.print("Contact ID? ---> ");
        userInput.nextLine();
        String id = userInput.nextLine();
        System.out.println("########################################################");
        System.out.print("First Name? ---> ");
        String firstName = userInput.nextLine();
        System.out.println("########################################################");
        System.out.print("Last Name? ---> ");
        String lastName = userInput.nextLine();
        System.out.println("########################################################");
        System.out.print("Phone Number? ---> ");
        String phoneNum = userInput.nextLine();
        System.out.println("########################################################");
        System.out.print("Street name? ---> ");
        String streetName = userInput.nextLine();
        System.out.println("########################################################");
        System.out.print("City? ---> ");
        String cityName = userInput.nextLine();
        System.out.println("########################################################");
        System.out.print("State? ---> ");
        String stateName = userInput.nextLine();
        System.out.println("########################################################");
        System.out.print("Zip Code? ---> ");
        String zipCode = userInput.nextLine();
        System.out.println("########################################################");
        person.setId(id);
        person.setFirstName(firstName);
        person.setLastname(lastName);
        person.setPhoneNum(phoneNum);
        person.setStreetName(streetName);
        person.setCityName(cityName);
        person.setStateName(stateName);
        person.setZipCode(zipCode);
        phoneList.getPhoneList().add(person);
        System.out.println("################# Succefully added " + firstName + " "+ lastName + "! ################");
        System.out.println("########################################################");
    
    }
    public static void displayContact(){
        System.out.println("########################################################");
        System.out.println("################## YOUR CONTACT LIST! ##################");
        System.out.println("--------------------------------------------------------");
        for (int index = 0; index < phoneList.getPhoneList().size(); index++) {
            System.out.println(phoneList.getPhoneList().get(index).toString());
            
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("########################################################");
                    
    }
     public static void removingContact(){
        System.out.println("########################################################");
        System.out.println("################## REMOVING CONTACT! ###################");
        System.out.println("########################################################");
        System.out.print("Contact ID Number To Remove? ");
        userInput.nextLine();
        String removeId = userInput.nextLine();
        boolean notFound = false;
        for (int index = 0; index < phoneList.getPhoneList().size(); index++) {
            if(phoneList.getPhoneList().get(index).getId().equals(removeId) ){
                notFound = true;
                phoneList.getPhoneList().remove(index);
                System.out.println("################## SUCCESSFULLY REMOVED! ##################");
                break;
            }
        }
        if(notFound == false){
            System.out.println("########################################################");
            System.out.println("################ Contact Not Found! ####################");
        }
        System.out.println("########################################################");
        System.out.println("########################################################");
    }

    public static void findingContact(){
        System.out.println("########################################################");
        System.out.println("################## SEARCHING CONTACT! ##################");
        System.out.println("########################################################");
        System.out.print("How Would You Like To Seach ? Contact ID , First Name, Last Name, And Phone Number? ");
        userInput.nextLine();
        String usersChoice = userInput.nextLine();

        if(usersChoice.equalsIgnoreCase("Contact ID")){
            System.out.print("Contact ID? ");
            String contactId = userInput.nextLine();
            boolean notFound = false;
            for (int index = 0; index < phoneList.getPhoneList().size(); index++) {
                if(phoneList.getPhoneList().get(index).getId().equals(contactId) ){
                    notFound = true;
                    System.out.println("########################################################");
                    System.out.println("################## SUCCESSFULLY FOUND! #################");
                    System.out.println(phoneList.getPhoneList().get(index).toString());
                    System.out.println("########################################################");
                    break; 
                }
            }
            if(notFound == false){
            System.out.println("########################################################");
            System.out.println("################ Contact Not Found! ####################");
            }
            System.out.println("########################################################");
            System.out.println("########################################################");
        }
        else if(usersChoice.equalsIgnoreCase("First Name")){
            System.out.print("First Name? ");
            String firstName = userInput.nextLine();
            boolean notFound = false;
            for (int index = 0; index < phoneList.getPhoneList().size(); index++) {
                if(phoneList.getPhoneList().get(index).getFirstName().equals(firstName) ){
                    notFound = true;
                    System.out.println("########################################################");
                    System.out.println("################## SUCCESSFULLY FOUND! #################");
                    System.out.println(phoneList.getPhoneList().get(index).toString());
                    System.out.println("########################################################");
                    
                }
            }

            if(notFound == false){
            System.out.println("########################################################");
            System.out.println("################ Contact Not Found! ####################");
            }
            System.out.println("########################################################");
            System.out.println("########################################################");
            
        }

        else if(usersChoice.equalsIgnoreCase("Last Name")){
            System.out.print("Last Name? ");
            String lastName = userInput.nextLine();
            boolean notFound = false;
            for (int index = 0; index < phoneList.getPhoneList().size(); index++) {
                if(phoneList.getPhoneList().get(index).getLastname().equals(lastName) ){
                    notFound = true;
                    System.out.println("########################################################");
                    System.out.println("################## SUCCESSFULLY FOUND! #################");
                    System.out.println(phoneList.getPhoneList().get(index).toString());
                    System.out.println("########################################################");
                    
                }
            }

            if(notFound == false){
            System.out.println("########################################################");
            System.out.println("################ Contact Not Found! ####################");
            }
            System.out.println("########################################################");
            System.out.println("########################################################");
            
        }

        else if(usersChoice.equalsIgnoreCase("Phone Number")){
            System.out.print("Phone Number? ");
            String phoneNumber = userInput.nextLine();
            boolean notFound = false;
            for (int index = 0; index < phoneList.getPhoneList().size(); index++) {
                if(phoneList.getPhoneList().get(index).getPhoneNum().equals(phoneNumber) ){
                    notFound = true;
                    System.out.println("########################################################");
                    System.out.println("################## SUCCESSFULLY FOUND! #################");
                    System.out.println(phoneList.getPhoneList().get(index).toString());
                    System.out.println("########################################################");
                    break;
                }
            }

            if(notFound == false){
            System.out.println("########################################################");
            System.out.println("################ Contact Not Found! ####################");
            }
            System.out.println("########################################################");
            System.out.println("########################################################");
            
        } 
    }
    
}