/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import Model.*;
import cardutils.*;
import java.util.ArrayList;
import java.util.List;
import laboration2.*;
import poker.*;


public class controller implements Initializable  {
    
    private Deck one = new Deck("AllCards");
    PsLogic  gameLogic = new PsLogic();
    private  ArrayList<Card>  deck;
    
    
 
    private int displayIndex=0;
    private int counter =0;
    Image startImage;
    
    Image SpadesA;
    Image Spades2;
    Image Spades3;
    Image Spades4;
    Image Spades5;
    Image Spades6;
    Image Spades7;
    Image Spades8;
    Image Spades9;
    Image Spades10;
    Image SpadesJ;
    Image SpadesQ;
    Image SpadesK;

    Image  DiamondA;
    Image  Diamond2;
    Image  Diamond3;
    Image  Diamond4;
    Image  Diamond5;
    Image  Diamond6;
    Image  Diamond7;
    Image  Diamond8;
    Image  Diamond9;
    Image  Diamond10;
    Image  DiamondJ;
    Image  DiamondQ;
    Image  DiamondK;
    
    Image ClubsA;
    Image Clubs2;
    Image Clubs3;
    Image Clubs4;
    Image Clubs5;
    Image Clubs6;
    Image Clubs7;  
    Image Clubs8; 
    Image Clubs9; 
    Image Clubs10;
    Image ClubsJ;
    Image ClubsQ;
    Image ClubsK;
    
    Image HeartsA;
    Image Hearts2;
    Image Hearts3;
    Image Hearts4;
    Image Hearts5;
    Image Hearts6;
    Image Hearts7;
    Image Hearts8;
    Image Hearts9;
    Image Hearts10;
    Image HeartsJ;
    Image HeartsQ;
    Image HeartsK;
    
    
    
    
    
   @FXML
    private Label total;   
    
    @FXML
    private Label pile1;
    
     @FXML
    private Label pile2;
    
      @FXML
    private Label pile3;
    
       @FXML
    private Label pile4;
    
        @FXML
    private Label pile5;
    
              @FXML
    private Label pick;

    
    @FXML
    private Button startButton;
    
    @FXML
    private Button flipButton;
    
    @FXML
    private ImageView card1;
    
     @FXML
    private ImageView card2;
      @FXML
    private ImageView card3;
       @FXML
    private ImageView card4;
        @FXML
    private ImageView card5;
    
    List <ImageView> images = new ArrayList<>();
    
        
    @FXML
    private Label label;
    
 
    
    @FXML
    private void handleStartButton(){
           pick.setText("START AND FLIP CARDS");
         gameLogic.initNewGame();
         flipButton.setDisable(false);
         try {
             begin();
              displayIndex=0;
         } catch (FileNotFoundException ex) {
             Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
     @FXML
    public void begin() throws FileNotFoundException{
        
        
        startImage = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\cardback5.jpg"));
        images.add(card1);
        images.add(card2);
        images.add(card3);
        images.add(card4);
        images.add(card5);
        
        for(int i=0;i<images.size();i++){
            
            images.get(i).setImage(startImage);
        }
        
      
      
       
       
        
    }
     @FXML
    public void handleFlipButton() throws FileNotFoundException{
        
     
   
         // Diamonds
         DiamondA=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_A.png"));
         Diamond2=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_2.png"));
         Diamond3=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_3.png"));
         Diamond4=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_4.png"));
         Diamond5=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_5.png"));
         Diamond6=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_6.png"));
         Diamond7=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_7.png"));
         Diamond8=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_8.png"));
         Diamond9=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_9.png"));
         Diamond10=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_10.png"));
         DiamondJ=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_J.png"));
         DiamondQ=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_Q.png"));
         DiamondK=  new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\diamonds_K.png"));
        
         
         // Clubs
         
           ClubsA = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_A.png"));
           Clubs2 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_2.png"));
           Clubs3 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_3.png"));
           Clubs4 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_4.png"));
           Clubs5 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_5.png"));
           Clubs6 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_6.png"));
           Clubs7 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_7.png"));
           Clubs8 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_8.png"));
           Clubs9 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_9.png"));
           Clubs10 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_10.png"));
           ClubsJ = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_J.png"));
           ClubsQ = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_Q.png"));
           ClubsK = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\clubs_K.png"));
         
           
           HeartsA = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_A.png"));
           Hearts2 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_2.png"));
           Hearts3 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_3.png"));
           Hearts4 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_4.png"));
           Hearts5 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_5.png"));
           Hearts6 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_6.png"));
           Hearts7 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_7.png"));
           Hearts8 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_8.png"));
           Hearts9 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_9.png"));
           Hearts10 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_10.png"));
           HeartsJ = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_J.png"));
           HeartsQ = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_Q.png"));
           HeartsK = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\hearts_K.png"));
           
          SpadesA = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_A.png"));
          Spades2 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_2.png"));
          Spades3 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_3.png"));
          Spades4 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_4.png"));
          Spades5 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_5.png"));
          Spades6 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_6.png"));
          Spades7 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_7.png"));
          Spades8 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_8.png"));
          Spades9 = new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_9.png"));
          Spades10= new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_10.png"));
          SpadesJ= new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_J.png"));
          SpadesQ= new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_Q.png"));
          SpadesK= new Image(new FileInputStream("C:\\Users\\phili\\OneDrive\\Skrivbord\\Cards\\spades_K.png"));
           
           
          Card temp =  gameLogic.addCardToPile();
          Card cardflipped = temp;
         
       
          
      
        if(gameLogic.getCardCount() >= 25){
           flipButton.setDisable(true);
            pick.setText("GAME OVER ");
           
           
        }  
         
       if(gameLogic.getCardCount() <= 25){  
          
         if(displayIndex > 4){
           
            displayIndex=0;
         }
         
         if( counter % 5 == 0 ){
             
               for(int i=0;i<images.size();i++){
            
               images.get(i).setImage(startImage);
               
           }
               
          displayIndex =0; 
                   
          }
         
          if(cardflipped.equals(deck.get(0))){
             
              images.get(displayIndex).setImage(DiamondA);
                   displayIndex++;
          }
         
      if(cardflipped.equals(deck.get(1))){
             
              images.get(displayIndex).setImage(Diamond2);
                displayIndex++;
         }
         
         if(cardflipped.equals(deck.get(2))){
             
              images.get(displayIndex).setImage(Diamond3);
                 displayIndex++;
          }
          
         if(cardflipped.equals(deck.get(3))){
             
              images.get(displayIndex).setImage(Diamond4);
               displayIndex++;
          }
          
         if(cardflipped.equals(deck.get(4))){
             
              images.get(displayIndex).setImage(Diamond5);
               displayIndex++;
          }
         
         if(cardflipped.equals(deck.get(5))){
             
              images.get(displayIndex).setImage(Diamond6);
            displayIndex++;
          }
          
      if(cardflipped.equals(deck.get(6))){
             
              images.get(displayIndex).setImage(Diamond7);
                  displayIndex++;
          }
         
         if(cardflipped.equals(deck.get(7))){
             
              images.get(displayIndex).setImage(Diamond8);
                 displayIndex++;
          }
         
         if(cardflipped.equals(deck.get(8))){
             
              images.get(displayIndex).setImage(Diamond9);
                  displayIndex++;
          }
         
          if(cardflipped.equals(deck.get(9))){
             
              images.get(displayIndex).setImage(Diamond10);
               displayIndex++;
                 
          }
        
          if(cardflipped.equals(deck.get(10))){
             
              images.get(displayIndex).setImage(DiamondJ);
               displayIndex++;
             
          }
          
          if(cardflipped.equals(deck.get(11))){
             
              images.get(displayIndex).setImage(DiamondQ);
               displayIndex++;
              
          }
          
          if(cardflipped.equals(deck.get(12))){
             
              images.get(displayIndex).setImage(DiamondK);
               displayIndex++;
          
          }
         
           if(cardflipped.equals(deck.get(13))){
             
              images.get(displayIndex).setImage(ClubsA);
               displayIndex++;
          
          }
           
         if(cardflipped.equals(deck.get(14))){
             
              images.get(displayIndex).setImage(Clubs2);
               displayIndex++;
          
          }
                 if(cardflipped.equals(deck.get(15))){
             
              images.get(displayIndex).setImage(Clubs3);
               displayIndex++;
          
          }
                    if(cardflipped.equals(deck.get(16))){
             
              images.get(displayIndex).setImage(Clubs4);
               displayIndex++;
          
          }
                    if(cardflipped.equals(deck.get(17))){
             
              images.get(displayIndex).setImage(Clubs5);
          
          }
                    if(cardflipped.equals(deck.get(18))){
             
              images.get(displayIndex).setImage(Clubs6);
               displayIndex++;
          
          }
                    if(cardflipped.equals(deck.get(19))){
             
              images.get(displayIndex).setImage(Clubs7);
               displayIndex++;
          
          }
                    if(cardflipped.equals(deck.get(20))){
             
              images.get(displayIndex).setImage(Clubs8);
               displayIndex++;
          
          }
                    if(cardflipped.equals(deck.get(21))){
             
              images.get(displayIndex).setImage(Clubs9);
               displayIndex++;
          
          }
                    if(cardflipped.equals(deck.get(22))){
             
              images.get(displayIndex).setImage(Clubs10);
               displayIndex++;
          
          }
                    if(cardflipped.equals(deck.get(23))){
             
              images.get(displayIndex).setImage(ClubsJ);
               displayIndex++;
          
          }
                    if(cardflipped.equals(deck.get(24))){
             
              images.get(displayIndex).setImage(ClubsQ);
              
               displayIndex++;
          
          }
           
         if(cardflipped.equals(deck.get(25))){
             
               images.get(displayIndex).setImage(ClubsK);
                displayIndex++;
          }
                       
     
          if(cardflipped.equals(deck.get(26))){
             
               images.get(displayIndex).setImage(HeartsA);
                displayIndex++;
          }
          
            if(cardflipped.equals(deck.get(27))){
             
               images.get(displayIndex).setImage(Hearts2);
                displayIndex++;
          }
           
              if(cardflipped.equals(deck.get(28))){
             
               images.get(displayIndex).setImage(Hearts3);
                displayIndex++;
          }
           
                if(cardflipped.equals(deck.get(29))){
             
               images.get(displayIndex).setImage(Hearts4);
                displayIndex++;
          }
           
                  if(cardflipped.equals(deck.get(30))){
             
               images.get(displayIndex).setImage(Hearts5);
                displayIndex++;
          }
           
                    if(cardflipped.equals(deck.get(31))){
             
               images.get(displayIndex).setImage(Hearts6);
                displayIndex++;
          }
           
                      if(cardflipped.equals(deck.get(32))){
             
               images.get(displayIndex).setImage(Hearts7);
                displayIndex++;
          }
           
             if(cardflipped.equals(deck.get(33))){
             
               images.get(displayIndex).setImage(Hearts8);
                displayIndex++;
          }
           
           if(cardflipped.equals(deck.get(34))){
             
               images.get(displayIndex).setImage(Hearts9);
                displayIndex++;
          }
           
           if(cardflipped.equals(deck.get(35))){
             
               images.get(displayIndex).setImage(Hearts10);
                displayIndex++;
          }
           
                
           if(cardflipped.equals(deck.get(36))){
             
               images.get(displayIndex).setImage(HeartsJ);
                displayIndex++;
          }
           
          if(cardflipped.equals(deck.get(37))){
             
               images.get(displayIndex).setImage(HeartsQ);
                displayIndex++;
          }
           
          if(cardflipped.equals(deck.get(38))){
             
               images.get(displayIndex).setImage(HeartsK);
                displayIndex++;
          }
            
          
    
         if(cardflipped.equals(deck.get(39)))  {
             
            
              images.get(displayIndex).setImage(SpadesA);
              
                  displayIndex++;
          }
         
         
          if(cardflipped.equals(deck.get(40)))  {
             
            
              images.get(displayIndex).setImage(Spades2);
              
                  displayIndex++;
          }
            if(cardflipped.equals(deck.get(41)))  {
             
            
              images.get(displayIndex).setImage(Spades3);
              
                  displayIndex++;
          }
              if(cardflipped.equals(deck.get(42)))  {
             
            
              images.get(displayIndex).setImage(Spades4);
              
                  displayIndex++;
          }
                if(cardflipped.equals(deck.get(43)))  {
             
            
              images.get(displayIndex).setImage(Spades5);
              
                  displayIndex++;
          }
                  if(cardflipped.equals(deck.get(44)))  {
             
            
              images.get(displayIndex).setImage(Spades6);
              
                  displayIndex++;
          }
            if(cardflipped.equals(deck.get(45)))  {
             
            
              images.get(displayIndex).setImage(Spades7);
              
                  displayIndex++;
          }
              if(cardflipped.equals(deck.get(46)))  {
             
            
              images.get(displayIndex).setImage(Spades8);
              
                  displayIndex++;
          }
                if(cardflipped.equals(deck.get(47)))  {
             
            
              images.get(displayIndex).setImage(Spades9);
              
                  displayIndex++;
          }
                  if(cardflipped.equals(deck.get(48)))  {
             
            
              images.get(displayIndex).setImage(Spades10);
              
                  displayIndex++;
          }
              
            if(cardflipped.equals(deck.get(49)))  {
             
            
              images.get(displayIndex).setImage(SpadesJ);
              
                  displayIndex++;
          }
            
            if(cardflipped.equals(deck.get(50)))  {
             
            
              images.get(displayIndex).setImage(SpadesQ);
              
                  displayIndex++;
          }  
            
              if(cardflipped.equals(deck.get(51)))  {
             
            
              images.get(displayIndex).setImage(SpadesK);
              
                  displayIndex++;
          }  
           
           
           
            setPoints();
            counter++;
           
              }    
       else{
         // System.out.println("done");
       }
        
    }
    
    
    public void setPoints(){
        
       PokerCombo one =  PokerHands.getPokerCombo(gameLogic.getSpecificPile(1));
       PokerCombo two =  PokerHands.getPokerCombo(gameLogic.getSpecificPile(2));
       PokerCombo three =  PokerHands.getPokerCombo(gameLogic.getSpecificPile(3));
       PokerCombo four=  PokerHands.getPokerCombo(gameLogic.getSpecificPile(4));
       PokerCombo five =  PokerHands.getPokerCombo(gameLogic.getSpecificPile(5));
       
       pile1.setText(comboToString(one));
       pile2.setText(comboToString(two));
       pile3.setText(comboToString(three));
       pile4.setText(comboToString(four));
       pile5.setText(comboToString(five));
        
       total.setText(Integer.toString(gameLogic.getPoints()));
        
        
    }
    
    public String comboToString(PokerCombo x){
        
        String info="";
        
        switch(x){
        
        case PAIR: return "PAIR";
        case TWOPAIRS: return "TWOPAIRS";
        case THREEOFAKIND: return "THREE OF A KIND";
        case FLUSH: return "FLUSH";
        case NONE: return "NONE";
        
    }
        
        
        return info;
        
        
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb)  {
         
         deck = new ArrayList<>();
         one.fill(deck);
         flipButton.setDisable(true);
       
      
    }    
    
}
