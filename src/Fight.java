public class Fight {

    private Hero winner;
    private boolean victory = false;

    public Fight(Hero player1, Hero player2) {
        System.out.println(player1.getInfo());
        System.out.println(player2.getInfo());
        while (!victory) {
            if(player1.isAlive() && player2.isAlive()) {
                player1.attack(player2);
                player2.attack(player1);
            } else {

            }


        }
    }

    public void setWinner(Hero winner) {
        this.winner = winner;
    }
//    public Hero startFight() {
//
//        return winner;
//    }
}
