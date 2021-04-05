package cz.educanet.arena.logic;

/**
 * Represents the arena.
 */
public class Arena {

    private Gladiator gladiator1;
    private Gladiator gladiator2;
    public static Gladiator winner;

    public Arena(){

    }


    /**
     * Represents the current round. This property is incremented each round.
     */
    private int round = 1;



    /**
     * Makes the gladiators fight one round.
     */


    public void fight() {
        if(gladiator1.isDead()){
            this.setWinner(gladiator2);

        }else if (gladiator2.isDead()){
            this.setWinner(gladiator1);

        }else{
            System.out.println("----------------------------ROUND " +round+ "-------------------------------------" );
            gladiator1.dealDamage(gladiator2);
            gladiator2.dealDamage(gladiator1);
            round ++;
        }
    }

    public void setWinner(Gladiator winner) {
        this.winner = winner;
    }

    public void setGladiator1(Gladiator gladiator1) {
        this.gladiator1 = gladiator1;
    }

    public void setGladiator2(Gladiator gladiator2) {
        this.gladiator2 = gladiator2;
    }
    public Gladiator getWinner(){
     return winner;
    }
}

