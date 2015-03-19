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
public class DeadEnd extends ZorkRoom {

    private String description = "This is a dead end. You should probably go back...";
    private HashMap exits;        // stores exits of this room.

    @Override
    public void setExits(HashMap par) {
        
        if (par.containsKey("Forest"))
            exits.put("go back",par.get("Forest"));

    }
}
