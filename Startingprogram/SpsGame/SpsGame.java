// import java.util.Scanner;
import java.io.Console;  
import java.nio.file.attribute.UserPrincipal;
import java.util.Random;
import java.io.IOException;

public class SpsGame{
     
   
    public static void main(String[] args){
        // Console cmdConsole = System.console();
        // Random random = new Random();
        // int userInput = 0;
        // char again = 'y';
        // // ClearScr cls = new ClearScr();
        // // System.console().clear();
        
            
           
        //     // System.out.println(raw);
            
        //     while (userInput != 1 && userInput != 2 && userInput != 3 && again=='y' || again == 'Y'){
                
                
        //         System.out.print("\nChoose one out of below  \n1. STONE\n2. PAPER\n3. SCISSOR\n\n");
        //         userInput = Integer.parseInt(cmdConsole.readLine());

        //         // cmdConsole.flush(); 
            
            
        //     int computer = random.nextInt(1,4);
        //     System.out.println(userInput + " " + computer); 

        //     // checking for conditions seprately 

        //     if (userInput == 1 && computer != 1){
        //         if (computer == 2) {
                    
        //             System.out.println("\n You loose \n try again");
        //         }
        //         else{
                   
        //             System.out.println("\n You Win \n Well Done");
        //         }
        //     }
            
            
        //     //

        //     else if (userInput == 2 && computer != 2){
        //         if (computer == 3) {

        //             System.out.println("\n You loose \n try again");
        //         }
        //         else{

        //             System.out.println("\n You Win \n Well Done");
        //         }
        //     }
            

        //     //

        //     else if (userInput == 3 && computer != 3){
        //         if (computer == 1) {

        //             System.out.println("\n You loose \n try again");
        //         }
        //         else{
                    
        //             System.out.println("\n You Win \n Well Done");
        //         }
        //     }
             
            

        //     else{
        //         if (userInput == 1 || userInput == 2 || userInput == 3){
        //         System.out.println("\n It's a Draw \n try again");
        //         }
        //         else{
        //             ClearScr.clear();
        //             System.out.println("Invalid agrument try again, choose from  1/2/3");
                    
        //             continue;

        //         }
        //     }

        // System.out.println("\n \n do you want to play again y for yes else No:");
        // again = cmdConsole.readLine().charAt(0);
        // userInput = 0;
        // ClearScr.clear();
        // }
        computerHand();
    }
    
// function to print and animate coputerhand of this game;
public static void computerHand(){
    String scissorString = "   _    _\n  (_)  / )\n    | (_/\n   _+/\n  //|\\\n // | )\n(/  |/   ";
    String stoneString = "          __                        \n _______/  |_  ____   ____   ____  \n /  ___/\\   __\\/  _ \\ /    \\_/ __ \\ \n \\___ \\  |  | (  <_> )   |  \\  ___/\n/____ _> |__|  \\____/|___|  /\\___" ;
    String paperString = "\_ \_\_   \_\_ \_ \_ \_\_   \_\_\_ \_ \_\_\n| '\_ \ / \_` | '\_ \ / \_ \ '\_\_|\n| |\_) | (\_| | |\_) |  \_\_/ |   \n| .\_\_/ \\_\_,\_| .\_\_/ \\_\_\_|\_|   \n| |         | |              \n|\_|         |\_| " ;
    try{
        int i = 0;
    while(i<=5){
    ClearScr.clear();
    System.out.println(scissorString);
    ClearScr.clear();
    // Thread.sleep(62);
    System.out.println(stoneString);
    ClearScr.clear();
    i++;
}
}
catch(final Exception e)
{
    System.out.println(e);
}

}
}
