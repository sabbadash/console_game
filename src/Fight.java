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
                if(player2.getActualHealthPoint() < player1.getActualDamage()){
                    player2.setActualHealthPoint(0);
                    System.out.println(player1.getName() + " made the last hit to " + player2.getName());
                    winner = player1;
                    victory = true;
                    Methods.clear();
                    player1.getInfo();
                    player2.getInfo();

                    continue;
                }
                player1.attack(player2);
                Methods.sleep(1);
                if(player1.getActualHealthPoint() < player2.getActualDamage()){
                    player1.setActualHealthPoint(0);
                    System.out.println(player2.getName() + " made the last hit to " + player1.getName());
                    winner = player2;
                    victory = true;
                    Methods.clear();
                    player1.getInfo();
                    player2.getInfo();

                    continue;
                }
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
    public void setWinner(Hero winner){
        this.winner = winner;
    }
    public Hero getWinner(){
        return winner;
    }
    public void setVictory(boolean victory){
        this.victory = victory;

    }
    public boolean getVictory(){
        return victory;
    }
}
