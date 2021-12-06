public class Main {

    public static void main(String[] args) {
        Methods.clear();
        Hero plainHero = new Hero("Matthew", 100, 10);
        Wizard plainWizard = new Wizard("Michael", 80, 12);
        System.out.println(plainHero.getInfo());
        System.out.println(plainWizard.getInfo());
//        Fight firstFight = new Fight(plainHero, plainWizard);
        for(int i = 0; i < 10; i++) {
            plainWizard.attack(plainHero);
        }
        System.out.println(plainHero.getActualHealthPoint());
    }
}
