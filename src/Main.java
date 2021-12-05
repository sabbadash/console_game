public class Main {

    public static void main(String[] args) {
        Methods.clear();
        Hero plainHero = new Hero("Matthew", 100, 10);
        Wizard plainWizard = new Wizard("Michael", 80, 12);
        System.out.println(plainHero.getInfo());
        System.out.println(plainWizard.getInfo());
    }
}
