/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboration2;
import cardutils.Card;
import cardutils.Rank;
import cardutils.Suit;
import Model.PsLogic;
/**
 *
 * @author phili
 */
public class Laboration2 {

 
    public static void main(String[] args) {
        PsLogic z= new PsLogic();
        z.addCardToPile();
         z.addCardToPile();
       System.out.println("z info:" + z.getCardCount());
        Deck one= new Deck();
        Pile ett= new Pile();
        Card temp=new Card(Rank.ACE,Suit.CLUBS);
        one.shuffleCards();
        ett.addCard(one.dealCard());
        ett.addCard(one.dealCard());
        ett.addCard(one.dealCard());
        ett.addCard(one.dealCard());
        ett.addCard(temp);
        
        System.out.println(ett.toString());
        ett.removeCard(0);
        System.out.println( "Pile:"+ett.toString());
        System.out.println(ett.containsCard(temp));
        System.out.println("DeckSize" + one.getSize());
        System.out.println("Deck" +one.toString());
         System.out.println("noOfClubs: " + ett.noOfSuit(Suit.CLUBS));
         
         
         /* Card temp = new Card(Rank.ACE,Suit.SPADES);
        Card tem = new Card(Rank.ACE,Suit.SPADES);
        Card te = new Card(Rank.ACE,Suit.SPADES);
        Card t = new Card(Rank.TEN,Suit.SPADES);
        Card i = new Card(Rank.KING,Suit.SPADES);
        pile1.addCard(temp);
        pile1.addCard(tem);
        pile1.addCard(te);
        pile1.addCard(t);
        pile1.addCard(i);*/
    }
    
}
