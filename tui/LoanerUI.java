package tui;
import controller.PersonController;

public class LoanerUI {
    PersonController personController;

    public LoanerUI() {
        personController = new PersonController();
    }

    public void start(){
        boolean running = true;
        while (running){
            int choice = writeLoanerMenu();
            if (choice == 1){
                String name = TextInput.inputString("Indtast navn:");
                String address = TextInput.inputString("Indtast addresse:");
                String postalCode = TextInput.inputString("Indtast postnummer:");
                String city = TextInput.inputString("Indtast by:");
                String phoneNumber = TextInput.inputString("Indtast tlf nr:");
                personController.createPerson(name, address, postalCode, city, phoneNumber);
                System.out.println(name + " er blevet tilføjet til systemet.");
            }
            if (choice == 2){
                String phoneNumber = TextInput.inputString("Indtast tlf nr");
                personController.deletePerson(phoneNumber);
                System.out.println("Bruger med tlf nr " + phoneNumber + " er blevet slettet.");
            }
            else{
                running = false;
            }
        }
    }

    private int writeLoanerMenu(){
        TextOptions menu = new TextOptions("Låner menu", "Tilbage");
        menu.addOption("Tilføj låner");
        menu.addOption("Fjern låner");
        int choice = menu.prompt();
        return choice;
    }
}
