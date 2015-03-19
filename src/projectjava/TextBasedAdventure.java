/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedadventure;
import java.util.HashMap;
/**
 *
 * @author Αέναος
 */
public class TextBasedAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap par = new HashMap();
        
        ZorkRoom CurrentRoom = new StartingRoom();
        ZorkRoom Forest = new Forest();
        ZorkRoom Castle = new Castle();   
        ZorkRoom Keep = new Keep();
        ZorkRoom DeadEnd = new DeadEnd();
                
        
        par.put("Forest", Forest);
        par.put("Castle", Castle);
        par.put("Keep", Keep);
        par.put("DeadEnd", DeadEnd);
        
        CurrentRoom.setExits(par);
        Forest.setExits(par);
        Castle.setExits(par);
        Keep.setExits(par);
        DeadEnd.setExits(par);
        
        Actor Player = new Actor();
        Player.setLine();
        Parser TextParser = new Parser();
        TextParser.checkCommand(Player.getText(), CurrentRoom);
        
    }
    
}

