/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;


/**
 *
 * @author Αέναος
 */
public class Parser {
          
    public void checkCommand( String command, ZorkRoom currentRoom){
         
        if (currentRoom.getExits().containsKey(command)){
            
            currentRoom = (ZorkRoom) currentRoom.getExits().get(command);
            System.out.println(currentRoom.getDescription());
            
        }else
            System.out.println("I didn't recognise the command.");
    }  
}
