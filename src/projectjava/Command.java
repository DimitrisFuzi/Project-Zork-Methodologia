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
public class Command {
     String cmdCheck ;

    public String isCmdCheck() {
        return this.cmdCheck;
    }

    public Command(String cmdCheck) {
        this.cmdCheck = cmdCheck;
    }


    public void CommandsList (String cT) //ch=CheckingText checking for Text if its command
    {   
        
        String[] dir = {"go east", "go west", "go north", "go south"};
        if((dir[0]).equals(cT)||dir[1].equals(cT)||dir[2].equals(cT)||dir[3].equals(cT)    
                || "open".equals(cT) || "pick up".equals(cT)) 
        {
        } else {
            cmdCheck = "false" ; 
         } 
        
    }
     
}

