import java.util.Scanner;

public class Fight {

    private Hero winner;
    private boolean victory = false;

    public Fight(Hero player1, Hero player2) {
        Scanner console = new Scanner(System.in);
        while (!victory) {
            Methods.clear();
            System.out.println(player1.getInfo());
            System.out.println(player2.getInfo());
            if(player1.isAlive() && player2.isAlive()) {
                player1.attack(player2);
                Methods.sleep(1);
                player2.attack(player1);
                console.nextLine();
            } else {
                if(player1.isAlive()) {
                    winner = player1;
                } else {
                    winner = player2;
                }
                victory = true;
            }
        }
        System.out.println("winner is " + winner.getName());
    }
}
