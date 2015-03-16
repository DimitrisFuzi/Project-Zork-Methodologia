/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

/**
 *
 * @author Αντώνης
 */
public class ProjectJava {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Actor text = new Actor();
        
        Parserr check = new Parserr();
        
   
       do{
        Command cmdChecking  = new Command("true");        
        text.SetLine(); // Reading the player command

        check.setCheckText(text); //store the command of player in Parserr Class
       
        cmdChecking.CommandsList(check.getCheckText()); //Call the CommandList method to Check if command is true
       
        check.ParserrCmdCheck(cmdChecking);
        
       
        }while(!text.getText().equals("exit"));
    }
    
} 