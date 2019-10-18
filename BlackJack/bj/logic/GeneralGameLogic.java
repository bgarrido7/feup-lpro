package bj.logic;

public class GeneralGameLogic {

    private Player player;
    private Deck deck;
    private char move;
    int bet=0;
    private OneGameSet set;

    public GeneralGameLogic(){
       this.player =new Player();
       this.deck =new Deck();
       this.set = new OneGameSet();
   }


   public int getPlayerMoney(){
        return this.player.getMoney();
   }


   public void setBet(int bet){
        this.bet=bet;
   }


   public boolean stillOn(){
    if (this.player.getMoney()<=0) {
        System.out.println("go home you drunk! you don't have any money left");
        return false;
    }
    return true;

   }

    public boolean beginningOfSet(){
        if(set.beginning)
            return true;
        return false;
    }

   public void setMove(char move){
        this.move=move;
   }

}
