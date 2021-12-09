import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Methods.clear();
        Wizard plainHero = new Wizard("Matt", 100, 10);
        Wizard plainWizard = new Wizard("Duke", 80, 12);
        Fight fight = new Fight(plainHero, plainWizard);
    }
}
