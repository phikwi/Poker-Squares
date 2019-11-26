package app;

import Model.PsLogic;

import java.util.Scanner;
public class TextUi {
    private Scanner scan; 
    PsLogic  gameLogic = new PsLogic();
    public TextUi(){
        scan = new Scanner(System.in);
    }
    
    //Main loop
    
    public void runGame(){
        char choice;
        String answer;
        int inputCount=0;
        printMenu(); 
        do{    
                answer = scan.nextLine();
                if( answer.length()==0){
                    System.out.println("Please Select an option (P or Q)");
                     answer = scan.nextLine();
               }
                
    		answer = answer.toUpperCase();     
                choice = answer.charAt(0);
                switch(choice) {
    			case 'P':gameLogic.addCardToPile(); break;
                        case 'Q':System.out.println("Game exited");
                                 return;
    			default:System.out.println("Unknown command");
    		}
                
                 System.out.println(gameLogic.toString());
    		
            
           }while(!gameLogic.isGameOver());
             System.out.println("Game Over");
    }
    
   
    public void printMenu() {
    	System.out.println("---Menu--------------------------------------------");
    	System.out.println("Pick 5 Cards one at a time(Type P and enter to pick)");
        System.out.println("Press Q to quit game");
    	System.out.println("--------------------");
    }
    
    public static void main(String[] args) {
    	
        TextUi uI= new TextUi();
               uI.runGame();
             
       
    }
}
