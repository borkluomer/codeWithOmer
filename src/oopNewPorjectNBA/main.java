package oopNewPorjectNBA;

public class main {
    public static void main(String[] args) {

        Players player1= new Players(24,6.6,44,"Bryant",
                "Kobe","LOS ANGELES LAKERS");

        Players [] player={player1};

        for (Players players:player) {
            System.out.println(player1.playerName);
            System.out.println(player1.playersLastName);
            System.out.println(player1.playersAge);
            System.out.println(player1.playersHeight);
            System.out.println(player1.playersTeam);

        }

        Coaches coach1=new Coaches(76,"Phil","Jackson");

        Coaches [] coach ={coach1};

        for (Coaches coaches: coach) {
            System.out.println(coach1.coachLastName);
            System.out.println(coach1.coachName);
            System.out.println(coach1.coachAge);

        }

        GameResultAndCoachReaction game =new GameResultAndCoachReaction();
        game.won(player1);
        game.lost(coach1);






    }
}
