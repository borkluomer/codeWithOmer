package oopNewPorjectNBA;

public class GameResultAndCoachReaction {

    public void won(Players players){
        System.out.println
                ("The Lakers team won and "+players.playerName+" scored 44 points.");
    }

    public void lost(Coaches coaches){
        System.out.println
                (coaches.coachName + "Retired after age of " + coaches.coachAge+".");
    }
}
