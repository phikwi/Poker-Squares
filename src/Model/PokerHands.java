
package Model;
import cardutils.Rank;
import cardutils.Suit;
import laboration2.Pile;

public class PokerHands {
    
     public PokerHands(){
         
     }
     
     
     public static PokerCombo getPokerCombo(Pile p){
        
        if(isFourOfAKind(p)){
            return PokerCombo.FOUROFAKIND;
        } 
       
        if(ThreeOfAKind(p)){
            return PokerCombo.THREEOFAKIND;
        }
          
        if(isFlush(p)){
            
            return PokerCombo.FLUSH;
        } 
          
        if(checkForPairs(p)==2){
            return PokerCombo.TWOPAIRS;
        }
        
        if(checkForPairs(p)==1){
            return PokerCombo.PAIR;
        }  
        else return PokerCombo.NONE;        
     }
     
     public static boolean isFlush(Pile p) {
        
        if(p.noOfSuit(Suit.CLUBS) == 5 || p.noOfSuit(Suit.DIAMONDS) ==5 || p.noOfSuit(Suit.SPADES) ==5 || p.noOfSuit(Suit.HEARTS) ==5){
             return true;
         }    
       else  return false;
     }
     
     public static boolean isFourOfAKind(Pile p){
         
         for(int i=0;i<p.getSize();i++){
             int Freq=0;
             for(int j=0;j<p.getSize();j++){
                 if(p.getCard(i).getRank()== p.getCard(j).getRank()){
                     Freq++;
                 }
             } 
                if(Freq==4){
                 return true;
                }  
         }
         return false;  
     }
     
      public static boolean ThreeOfAKind(Pile p){
         
         for(int i=0;i<p.getSize();i++){
             int Freq=0;
             for(int j=0;j<p.getSize();j++){
                 if(p.getCard(i).getRank()== p.getCard(j).getRank()){
                     Freq++;
                 }
             }
             
             if(Freq==3){
                 return true;
             }
             
         }
         
         return false;
         
    
     }
      
     private static int checkForPairs(Pile p){
         int noOfPairs=0;
         //make array of ranks and compare  ranks with ranks in pile
         Rank[] rankValues = Rank.values();
         int[]  pairs = new int[13];
         int freq=0;
         
        for(int i=0;i<rankValues.length;i++){
            for(int j=0;j<p.getSize();j++){
                
                if(rankValues[i].ordinal()== p.getCard(j).getRank().ordinal()){
                    freq++;
                }
            } 
             pairs[i]=freq;
                freq=0;
         }
        for(int i=0;i<pairs.length;i++){
            if(pairs[i]==2){
                noOfPairs++;
            }
        }
        return noOfPairs;   
     }
     
}
