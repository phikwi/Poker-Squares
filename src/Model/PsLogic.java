
package Model;
import cardutils.Card;
import cardutils.Rank;
import cardutils.Suit;
import laboration2.Deck;
import laboration2.Pile;
import java.util.ArrayList;
public class PsLogic {
    
    
    private Deck deck;
    private Pile pile1;
    private Pile pile2;
    private Pile pile3;
    private Pile pile4;
    private Pile pile5;
    private int cardCount;
    private Card cardPicked;
    
    
    public PsLogic(){
       initNewGame();
       
    }
    
    public void initNewGame(){
        this.deck=new Deck();
        this.pile1=new Pile();
        pile1.clear();
        this.pile2=new Pile();
        pile2.clear();
        this.pile3=new Pile();
        pile3.clear();
        this.pile4=new Pile();
        pile4.clear();
        this.pile5=new Pile();
        pile5.clear();
        cardCount=0;
    }
    
    
    
    
    public int getCardCount(){
        
        return cardCount;
    }
    
    public Card pickNextCard(){
        // should check that only one card is picked first
        
        cardPicked = deck.dealCard();
        
        return cardPicked;
    }
    
    public Card addCardToPile(){
       
        Card c = new Card(Rank.ACE,Suit.SPADES);
     
         
      //Add card to particular pile
       // if(pickNextCard()!=null) {
      
       if( getCardCount() >= 0 && getCardCount() <5 ){
            
           if(pile1.getSize() < 6){
               
               Card temp = pickNextCard();
               
                pile1.addCard(temp);  
               
                cardCount++;
                
             return temp;
           }          
       }
       
       if( getCardCount() >= 5 && getCardCount() <10 ){
            if(pile2.getSize() < 6){
                   Card temp =pickNextCard();
                   pile2.addCard(temp);  
                   cardCount++;
                  
                return temp;
            }   
       }
       if( getCardCount() >= 10 && getCardCount() <15 ){
           if(pile3.getSize() < 6){ 
                Card temp =pickNextCard();
                pile3.addCard(temp);  
                cardCount++;
               
              return temp;
           }   
       }
       if( getCardCount() >= 15 && getCardCount() <20){
            if(pile4.getSize() < 6){ 
                 Card temp =pickNextCard();
                 pile4.addCard(temp); 
                 cardCount++;
                
                 return temp;
            }       
       }
       if( getCardCount() >= 20 && getCardCount() <25 ){
           if(pile5.getSize() < 6){ 
                Card temp =pickNextCard();
                pile5.addCard(temp);  
                cardCount++;
               
              return temp;
           }     
       }
      
      
      //  }
        
       
        return c;
        
    }
    
    public ArrayList<Pile> getPiles(){  
        ArrayList<Pile> temp= new ArrayList<Pile>();
        temp.add(pile1);
        temp.add(pile2);
        temp.add(pile3);
        temp.add(pile4);
        temp.add(pile5);
         
     
        
          return temp;           
    }
    
    
    public void setCardCount(int x){
        
        this.cardCount =x;
    }
    
    
    public Pile getSpecificPile(int x){
        
        Pile v = new Pile();
        
        switch(x){
            
            
            case 1: return this.pile1;
            
            case 2: return this.pile2;
            
            case 3: return this.pile3;
            
            case 4: return this.pile4;
            
            case 5: return this.pile5;
            
            
        }
        
      return v;   
        
    }
    
    public boolean isGameOver(){
        
        if(getCardCount()==25){
            
            return true;
        }
        
        return false;
    }
    
    public int getPoints(){
       
    int points= PointsPerPile(pile1) + PointsPerPile(pile2) + PointsPerPile(pile3) + PointsPerPile(pile4) + PointsPerPile(pile5) ;
      
        
        return points;
    }
    
    
     private int PointsPerPile(Pile p){
        int pilePoints=0;
        switch(PokerHands.getPokerCombo(p)){
            
            case PAIR: 
                     pilePoints= pilePoints + 1;
                     break;
            case TWOPAIRS: 
                     pilePoints= pilePoints + 3;
                     break; 
            case THREEOFAKIND: 
                     pilePoints= pilePoints + 6;
                     break;   
            case FLUSH:
                     pilePoints= pilePoints + 5;
                     break;         
            case FOUROFAKIND:
                     pilePoints= pilePoints + 16;
                     break;
            default    :
                     pilePoints= 0;
                     break;        
            
        }
         
        
       return pilePoints; 
    }
    
    @Override
     public String toString(){
         
         String info="";
         info+="Pile1:";
         for(int i=0;i<pile1.getSize();i++){
             
             info +=  pile1.getCard(i).getRank() +"|";
             info +=  pile1.getCard(i).getSuit()+" ," ;
         }
         
          info+=  "\r\n"+ "Pile2:";
         for(int i=0;i<pile2.getSize();i++){
             
             info +=  pile2.getCard(i).getRank() +"|";
             info +=  pile2.getCard(i).getSuit() + " ,";
         }
          info+= "\r\n" + "Pile3:" ;
         for(int i=0;i<pile3.getSize();i++){
             
             info +=  pile3.getCard(i).getRank() +"|" ;
             info +=  pile3.getCard(i).getSuit()  + " ,";
         }
          info+= "\r\n" + "Pile4:";
         for(int i=0;i<pile4.getSize();i++){
             
             info +=  pile4.getCard(i).getRank() +"|";
             info +=  pile4.getCard(i).getSuit()  + " ,";
         }
          info+= "\r\n" + "Pile5:";
         for(int i=0;i<pile5.getSize();i++){
             
             info +=  pile5.getCard(i).getRank() +"|" ;
             info +=  pile5.getCard(i).getSuit() + " ,";
         }
          
         info += "\r\n" +"NoOfCards:" + getCardCount();
         info+= "\r\n" + "Pile1Combo:" +  PokerHands.getPokerCombo(pile1);
         info+= "\r\n" + "Pile2Combo:" +  PokerHands.getPokerCombo(pile2);
         info+= "\r\n" + "Pile3Combo:" +  PokerHands.getPokerCombo(pile3);
         info+= "\r\n" + "Pile4Combo:" +  PokerHands.getPokerCombo(pile4);
         info+= "\r\n" + "Pile5Combo:" +  PokerHands.getPokerCombo(pile5) + "\r\n" ;
      //   info+= getPiles();
         info += "Total points:" + getPoints();
         return info;
     }
     
     
}
