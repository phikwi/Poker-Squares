
package laboration2;
import cardutils.Card;
import cardutils.Rank;
import cardutils.Suit;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Pile {
    private ArrayList<Card>  pile;
    public Pile(){
       this.pile=new ArrayList<Card>(); 
    }
    
    public int getSize(){
        int sizeOfList= pile.size();
        return sizeOfList;
    }
    
    public void clear(){
        
        pile.clear();
    }
    
    public void addCard(Card temp){
        
        pile.add(temp);
    }
    
    public void adddCard(int index,Card temp){
         
        pile.add(index,temp);
    }
    
    public Card getCard(int index){
        Card temp= pile.get(index);
       
        return temp;
    }
    
    public ArrayList<Card>  getCards(){
        ArrayList<Card> temp= new  ArrayList<Card>();
        for(int i=0;i<pile.size();i++){
            temp.add(pile.get(i));
        }  
        return temp;    
    }
    
    public void removeCard(int index){
        pile.remove(index);
    }
    
    public void removeCardObject(Card temp){
        
        pile.remove(temp);
    }
    
    public boolean containsCard(Card temp){
      
        return pile.contains(temp);
    }
    
    public int noOfSuit( Suit requested ){
        int noOfSuit=0;
       
        for(int i=0;i<pile.size();i++){
            
            if(pile.get(i).getSuit()== requested){
                noOfSuit++;
            }
            
        }
        
     return noOfSuit;    
    }
    
       public int noOfRank(Rank requested ){
        int noOfRank=0;
       
        for(int i=0;i<pile.size();i++){
            
            if(pile.get(i).getRank()== requested){
                noOfRank++;
            }
            
        }
        
     return noOfRank;    
    }
    
        @Override
	public String toString() {
		String info ="";
                for(int i =0;i<pile.size();i++){
                    info+= pile.get(i).getRank() ;
                    info+= pile.get(i).getSuit() + "\r\n";
                }
		return info;
	}
    
}
