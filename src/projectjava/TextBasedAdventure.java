/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedadventure;

/**
 *
 * @author Αέναος
 */
public class TextBasedAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IZorkRoom CurrentRoom = new ();
        Forest Forest = new Forest();
        Castle Castle = new Castle();
        Keep Keep= new Keep();
        DeadEnd DeadEnd = new DeadEnd();
        
        Forest.setExits(DeadEnd,Castle,DeadEnd,Keep);
        Castle.setExits(DeadEnd,DeadEnd,DeadEnd,Forest);
        Castle.setExits(DeadEnd,Forest,DeadEnd,DeadEnd);
        CurrentRoom.setDescription();
        CurrentRoom.setExits(Forest,DeadEnd,DeadEnd,DeadEnd);
        
        
        Actor Player = new Actor();
        Player.setLine();
    }
    
}
