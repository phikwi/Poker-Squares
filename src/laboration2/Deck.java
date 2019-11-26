/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboration2;
import cardutils.Card;
import cardutils.Rank;
import cardutils.Suit;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    
    private ArrayList<Card>  deck;
    private String n;
    
    public Deck(String name){
        this.n = name;
    }
    public Deck(){
        
        this.deck=new ArrayList<Card>();
         deck.clear();
         fill(deck);
         shuffleCards();
        // System.out.println( "\r\n" + deck.toString()); 
        // System.out.println( "\r\n" + dealCard(deck)); 
        // System.out.println( "size" + deck.size()); 
    }
    
    public void fill(ArrayList<Card>  cards_){
       
        Suit[] availableSuit= new Suit[4];
        Rank[] availabeRank = new Rank[13];
        availabeRank=Rank.values();
        availableSuit= Suit.values();
        ArrayList<Suit> suits =new ArrayList<Suit>();
        ArrayList<Rank> ranks =new ArrayList<Rank>();
        Card temp;
        //Copy value of suit and rank enum to a list
        for(int i=0;i<availableSuit.length;i++){
                 suits.add(availableSuit[i]);
               
           }     
        for(int i=0;i < availabeRank.length;i++){
                 ranks.add(availabeRank[i]);
               
            }
        //fill list with CARDS
        for(int i=0;i<4;i++){
             for(int j=0;j<13;j++){
                 temp= new Card(ranks.get(j),suits.get(i));
                 cards_.add(temp);  
                }
         }   
          
       
       }
    
    public int getSize(){
        return deck.size();
    }
    public Card dealCard(){
        Card temp= deck.get(0);
        deck.remove(0);
        return temp;
    }
    
    public void shuffleCards(){
         
        Collections.shuffle(deck);  
    }
    
    @Override
	public String toString() {
		String info ="";
                for(int i =0;i<deck.size();i++){
                    info+= deck.get(i).getRank() +",";
                    info+=  deck.get(i).getSuit()+ "\r\n";
                }
		return info;
	}
    
}
