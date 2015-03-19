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
        Forest forest = new Forest();
        Castle castle = new Castle();   
        Keep keep = new Keep();
        DeadEnd deadEnd = new DeadEnd();
                
        
        par.put("Forest", forest);
        par.put("Castle", castle);
        par.put("Keep", keep);
        par.put("DeadEnd", deadEnd);
        
        CurrentRoom.setExits(par);
        forest.setExits(par);
        castle.setExits(par);
        keep.setExits(par);
        deadEnd.setExits(par);
        
        Actor Player = new Actor();
        Player.setLine();
        Parser TextParser = new Parser();
        TextParser.checkCommand(Player.getText(), CurrentRoom);
        
    }
    
}
